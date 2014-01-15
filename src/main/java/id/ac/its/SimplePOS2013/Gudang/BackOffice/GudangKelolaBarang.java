package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GudangKelolaBarang {
	
	@Autowired
	private BarangService barangService;
	
	//=============================/list barang(select table)
	@RequestMapping(value = "/gudang/kelola_barang", method = RequestMethod.GET)
	public String homeKelolaBarang(Model model) {
		return "kelola_barang";
	}
	
	//=============================/menampilkan gudang
		@RequestMapping(value = "/gudang", method = RequestMethod.GET)
		public String homeGudang(Model model) {
			return "gudang";
		}
	
	@ModelAttribute("daftarBarang")
	public List<Barang> daftarBarang(){
		return this.barangService.daftarBarang();
	}
	
	//==============================tambah barang(insert ke database)
	@RequestMapping(value = "/gudang/kelola_barang/tambah",method = RequestMethod.GET)
	public String homeKelolaBarangTambah(Barang barang,Model model){
		//barangService.tambahBarang(barang);
		return "kelola_barang_tambah";
	}
	@RequestMapping(value="/gudang/kelola_barang/tambah", params={"tambahBarang"},method=RequestMethod.POST)
	public String tambahBarang(Barang barang, BindingResult bindingResult) {
	   this.barangService.tambahBarang(barang);
	    return "redirect:/gudang/kelola_barang";
	}
	
	//================================sunting barang(update table database)
	@RequestMapping(value = "/gudang/kelola_barang/sunting",method = RequestMethod.GET)
	public String homeKelolaBarangSunting(Barang barang, Model model){
		return "kelola_barang_sunting";
	}
	
	@RequestMapping(value="/gudang/kelola_barang/sunting", params={"suntingBarang"},method=RequestMethod.POST)
	public String suntingBarang(Barang barang, BindingResult bindingResult) {
	   this.barangService.suntingBarang(barang);
	    return "redirect:/gudang/kelola_barang";
	}
	
	//==================================tambah stok barang(hanya bisa buka laman)
	@RequestMapping(value = "/gudang/kelola_barang/tambah_stok_gudang",method = RequestMethod.GET)
	public String homeKelolaBarangTambahStok(Model model){
		return "kelola_barang_tambah_stok";
	}
	
	//===================================kirim ke toko(hanya bisa buka laman)
	@RequestMapping(value = "/gudang/kelola_barang/kirim_ke_toko",method = RequestMethod.GET)
	public String homeKelolaBarangKirim(Model model){
		return "kelola_barang_kirim_ke_toko";
	}
	
}
