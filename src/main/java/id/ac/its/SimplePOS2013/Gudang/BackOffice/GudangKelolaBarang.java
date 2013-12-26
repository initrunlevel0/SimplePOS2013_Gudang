package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GudangKelolaBarang {
	
	@Autowired
	private BarangService barangService;
	
	@RequestMapping(value = "/gudang/kelola_barang", method = RequestMethod.GET)
	public String homeKelolaBarang(Model model) {
		//barangService.daftarBarang();
		return "kelola_barang";
	}
	
	@RequestMapping(value = "/gudang/kelola_barang/tambah",method = RequestMethod.GET)
	public String homeKelolaBarangTambah(Model model){
		return "kelola_barang_tambah";
	}
	
	@RequestMapping(value = "/gudang/kelola_barang/sunting",method = RequestMethod.GET)
	public String homeKelolaBarangSunting(Model model){
		return "kelola_barang_sunting";
	}
	
	@RequestMapping(value = "/gudang/kelola_barang/tambah_stok_gudang",method = RequestMethod.GET)
	public String homeKelolaBarangTambahStok(Model model){
		return "kelola_barang_tambah_stok";
	}
	
	@RequestMapping(value = "/gudang/kelola_barang/kirim_ke_toko",method = RequestMethod.GET)
	public String homeKelolaBarangKirim(Model model){
		return "kelola_barang_kirim_ke_toko";
	}
	
}
