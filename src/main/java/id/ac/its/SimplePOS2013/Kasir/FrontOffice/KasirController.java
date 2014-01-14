package id.ac.its.SimplePOS2013.Kasir.FrontOffice;


import java.util.ArrayList;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;
import id.ac.its.SimplePOS2013.DataModel.Model.Struk;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;
import id.ac.its.SimplePOS2013.Gudang.ServiceFO.KasirService;
import id.ac.its.SimplePOS2013.Gudang.ServiceFO.KasirServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KasirController {
	// Sementara koneksi database via Autowired Service BO secara langsung
	// Selanjutnya menggunakan koneksi ke webservice
	@Autowired
	private BarangService barangService;   // Lho harusnya ini ada di ServiceFO yah
	@Autowired
	private KasirService kasirService;
	
	// Hardcode dulu
	private final int idToko = 1;
	
	// Interaksi data JSON
	// Lihat: http://www.mkyong.com/spring-mvc/spring-3-mvc-and-json-example/
	// Update Maven untuk memasang paket Jackson JSON Mapper
	// Format data sesuaikan domain Barang
	@RequestMapping(value = "/kasir/ambil_data_barang", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Barang> ambilDataBarang() {
		return barangService.daftarBarang();
	}
	
	// Format data sesuaikan domain Transaksi dan DetilTransaksi
	// Wira masih bingung cara menggabungkan dua @RequestBody sebagai parameter)
	@RequestMapping(value = "/kasir/proses_transaksi", method = RequestMethod.POST)
	public @ResponseBody Boolean prosesTransaksi(@RequestBody Struk struk) {	
		kasirService.tambahTransaksi(struk.getTransaksi(),struk.getDetilTransaksi());
		return true;
	}
	
	// Testing JSOn
	@RequestMapping(value = "/kasir/test", method = RequestMethod.GET)
	public @ResponseBody List<Barang> getListBarangJSON() {
		List<Barang> result = new ArrayList<Barang>();
		Barang barang1 = new Barang();
		barang1.setNamaBarang("Bengbeng");
		result.add(barang1);
		return result;
	}
	
	@RequestMapping(value = "/kasir/test2", method = RequestMethod.GET)
	public @ResponseBody List<Integer> test2() {
		List<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);
		return a;
	}
	
	// Laman sebenarnya
	@RequestMapping(value = "/kasir", method = RequestMethod.GET)
	public String kasirPage(Model model) {
		return "kasir";
	}
}
