package id.ac.its.SimplePOS2013.Gudang.BackOffice;

import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TokoService;

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
public class GudangKelolaToko {
	@Autowired
	private TokoService tokoService;
	
    @RequestMapping(value = "/gudang/kelola_toko/tambah",method = RequestMethod.GET)
    public String homeKelolaBarangTambah(Toko toko,Model model){
            return "kelola_toko_tambah";
    }
    @RequestMapping(value="/gudang/kelola_toko/tambah", params={"tambahToko"},method=RequestMethod.POST)
    public String tambahToko(Toko toko, BindingResult bindingResult) {
       this.tokoService.tambahToko(toko);
        return "redirect:/gudang/kelola_toko";
    }

    @RequestMapping(value = "/gudang/kelola_toko/sunting",method = RequestMethod.GET)
    public String homeKelolaTokoSunting(Toko toko, Model model){
            return "kelola_toko_sunting";
    }
    
    @RequestMapping(value="/gudang/kelola_toko/sunting", params={"suntingToko"},method=RequestMethod.POST)
    public String suntingToko(Toko toko, BindingResult bindingResult) {
       this.tokoService.suntingToko(toko);
        return "redirect:/gudang/kelola_toko";
    }
    
    @RequestMapping(value="/gudang/kelola_toko/hapus", params={"hapusToko"},method=RequestMethod.POST)
    public String hapusToko(String idToko, BindingResult bindingResult){
    	this.tokoService.hapusToko(idToko);
    	return "redirect:/gudang/kelola_toko";
    }
}
