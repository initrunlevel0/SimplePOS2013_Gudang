package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.PegawaiGudangService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GudangHomeController {
	@Autowired
	private PegawaiGudangService pegawaiGudangService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "tes";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET) 
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/accessdenied", method = RequestMethod.GET) 
	public String denied(Model model) {
		return "accessdenied";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET) 
	public String logout(Model model) {
		return "logout";
	}
	
}
