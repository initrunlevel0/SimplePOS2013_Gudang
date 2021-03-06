package id.ac.its.SimplePOS2013.Kasir.FrontOffice;


import java.util.ArrayList;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.DataModel.Model.Struk;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TokoService;
import id.ac.its.SimplePOS2013.Gudang.ServiceFO.KasirService;
import id.ac.its.SimplePOS2013.Gudang.ServiceFO.KasirServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KasirController {
	@Autowired
	private KasirService kasirService;
	
	@Autowired
	private TokoService tokoService;
	
	
	// Hardcode dulu
	private final int idToko = 1;
	
	// Interaksi data JSON
	// Lihat: http://www.mkyong.com/spring-mvc/spring-3-mvc-and-json-example/
	// Update Maven untuk memasang paket Jackson JSON Mapper
	// Format data sesuaikan domain Barang
	@RequestMapping(value = "/kasir/ambil_data_barang", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Barang> ambilDataBarang() {
		return kasirService.ambilDataBarang();
	}
	
	// Format data sesuaikan domain Transaksi dan DetilTransaksi
	// Wira masih bingung cara menggabungkan dua @RequestBody sebagai parameter)
	@RequestMapping(value = "/kasir/proses_transaksi", method = RequestMethod.POST, consumes="application/json")
	public @ResponseBody Transaksi prosesTransaksi(@RequestBody Struk struk) {	
		return kasirService.tambahTransaksi(struk);
		//return tokoService.lihatToko(struk.getIdToko());
	}
	
	// Laman sebenarnya
	@RequestMapping(value = "/kasir", method = RequestMethod.GET)
	public String kasirPage(Model model) {
		model.addAttribute("toko", tokoService.lihatToko(idToko));
		return "kasir";
	}
}
