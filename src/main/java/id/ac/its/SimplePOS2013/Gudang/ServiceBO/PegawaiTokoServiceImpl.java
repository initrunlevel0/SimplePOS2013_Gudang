package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;

public class PegawaiTokoServiceImpl implements PegawaiTokoService {

	@Autowired
	private BaseDAO<PegawaiToko, String> baseDao;

	@Override
	public void tambahPegawaiToko(PegawaiToko pegawaitoko) {
		baseDao.add(pegawaitoko);
		
	}
	@Override
	public void suntingDataPegawaiGudang(String idPegawaiGudang){
		
	}
	@Override
	public boolean login(String idPegawai,String Password){
		
		
	}

}
