package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BarangService barangService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale); 
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		Barang barang = new Barang();
		barang.setIdBarang("2");
		barang.setNamaBarang("top");
		barang.setHargaBeli(1000);
		barang.setHargaJual(1200);
		//barangService.tambahBarang(barang);
		Barang brg = barangService.ambilBarangId("1");
		barangService.hapusBarang("1");
		return "home";
	}
	
}
