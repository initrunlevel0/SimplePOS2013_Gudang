package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;

@Service
public class PegawaiGudangImplService implements PegawaiGudangService {
	
	@Autowired
	private BaseDAO<PegawaiGudang, String> baseDAO;

	@Override
	public void tambahPegawaiGudang(PegawaiGudang pegawaiGudang) {
		baseDAO.add(pegawaiGudang);
		
	}

	@Override
	public void suntingDataPegawaiGudang(PegawaiGudang pegawaiGudang) {
		baseDAO.update(pegawaiGudang);

	}

	@Override
	public void login(PegawaiGudang pegawaiGudang, String query) {
		// TODO Auto-generated method stub
		baseDAO.doQuery(query, PegawaiGudang.class);
	}
	
	

}
