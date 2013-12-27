package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.PegawaiTokoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GudangKelolaPegawaiToko {
	
	@Autowired
	private PegawaiTokoService PegawaiTokoService;
	
	//=============================/list pegawai toko(select table)
	@RequestMapping(value = "/gudang/pegawai_toko", method = RequestMethod.GET)
	public String homeKelolaPegawaiToko(Model model) {
		return "pegawai_toko";
	}
	@ModelAttribute("daftarPegawaiToko")
	public List<PegawaiToko> daftar(){
		return this.PegawaiTokoService.daftarPegawaiToko();
	}
	
	//==============================tambah pegawaiToko(insert ke database)
	@RequestMapping(value = "/gudang/pegawai_toko/tambah",method = RequestMethod.GET)
	public String homeKelolaPegawaiTokoTambah(PegawaiToko pegawaiToko,Model model){
		return "pegawai_toko_tambah";
	}
	//================================sunting pegawaiToko(update table database)
	@RequestMapping(value = "/gudang/pegawai_toko/sunting",method = RequestMethod.GET)
	public String homeKelolaPegawaiTokoSunting(PegawaiToko pegawaiToko, Model model){
		return "pegawai_toko_sunting";
	}
	
}
