package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;

@Service
public class PegawaiGudangImplService implements PegawaiGudangService {
	
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
	
	

}
