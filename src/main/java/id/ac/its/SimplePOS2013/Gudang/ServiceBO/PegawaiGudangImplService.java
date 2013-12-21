package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;

@Service
public class PegawaiGudangImplService implements PegawaiGudangService {
	
	@Autowired
	private BaseDAO<PegawaiGudang, String> besDao;

	@Override
	public void tambahPegawaiGudang(PegawaiGudang pegawaigudang) {
		besDao.add(pegawaigudang);
		
	}

	@Override
	public void suntingDataPegawaiGudang(PegawaiGudang pegawaigudang) {
		besDao.update(pegawaigudang);

		
	}

	@Override
	public boolean login(String idPegawai, String Password) {
		
		return false;
	}
	
	

}
