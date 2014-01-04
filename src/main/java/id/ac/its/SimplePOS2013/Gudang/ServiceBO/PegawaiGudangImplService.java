package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;

@Service(value="pegawaiGudangImplService")
public class PegawaiGudangImplService implements PegawaiGudangService, UserDetailsService {
	
	private static final Logger LOGGER = Logger.getLogger(PegawaiGudangImplService.class.getName());
	@Autowired
	private BaseDAO<PegawaiGudang, String> baseDao;

	@Override
	public void tambahPegawaiGudang(PegawaiGudang pegawaigudang) {
		baseDao.add(pegawaigudang);
	}

	@Override
	public void suntingDataPegawaiGudang(PegawaiGudang pegawaigudang) {
		baseDao.update(pegawaigudang);
	}
	
	@Override
	public void hapusPegawaiGudang(String idPegawaiGudang) {
		baseDao.delete(idPegawaiGudang, PegawaiGudang.class);
	}
	
	@Override
	public List<PegawaiGudang> daftarPegawaiGudang(){
		return baseDao.listAll(PegawaiGudang.class);
	}
	
	public PegawaiGudang lihatDataPegawaiGudang(String idPegawaiGudang){
		return baseDao.view(idPegawaiGudang, PegawaiGudang.class);
	}
	
	
	@Override
	public boolean login(String idPegawai, String Password) {
		return false;
	}

	@Override
	public UserDetails loadUserByUsername(String idPegawaiGudang)
			throws UsernameNotFoundException {
		PegawaiGudang dataPegawaiGudang = this.lihatDataPegawaiGudang(idPegawaiGudang);
		if(dataPegawaiGudang == null) {
			throw new UsernameNotFoundException(idPegawaiGudang);
		}
		List<GrantedAuthority> grantedAuthority = new ArrayList<GrantedAuthority>();
		grantedAuthority.add(new GrantedAuthorityImpl("ROLE_USER"));
	
		UserDetails user = new User(dataPegawaiGudang.getIdPegawaiGudang(), dataPegawaiGudang.getPassword(), true, true, true, true,  grantedAuthority);
		LOGGER.info("Username: " + dataPegawaiGudang.getNamaPegawaiGudang() + ", Password: " + dataPegawaiGudang.getPassword());
		return user;
	}
	
	

}
