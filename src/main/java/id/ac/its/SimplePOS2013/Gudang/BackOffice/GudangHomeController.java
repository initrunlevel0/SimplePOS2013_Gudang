package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GudangHomeController {
	@RequestMapping(value = "/gudang", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "tes";
	}
	
	@RequestMapping(value="/gudang/login", method = RequestMethod.GET) 
	public String loginGet(Model model) {
		List<Barang> barang = new ArrayList<Barang>();
		Barang b1 = new Barang();
		Barang b2 = new Barang();
		b1.setNamaBarang("Bengbeng");
		b2.setNamaBarang("Bongbong");
		barang.add(b1);
		barang.add(b2);
		return "login";
	}
	
}
