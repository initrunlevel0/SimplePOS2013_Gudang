package id.ac.its.SimplePOS2013.Gudang.BackOffice;

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
	
}
