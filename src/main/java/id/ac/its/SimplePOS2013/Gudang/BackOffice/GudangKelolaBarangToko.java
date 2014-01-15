package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.StokTokoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GudangKelolaBarangToko {
	
	@RequestMapping(value = "/gudang/kelola_barang_toko", method = RequestMethod.GET)
	public String homeKelolaBarangToko(Model model) {
		return "kelola_barang_toko";
	}
}
