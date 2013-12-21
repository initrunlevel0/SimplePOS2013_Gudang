package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;

public class PegawaiTokoServiceImpl implements PegawaiTokoService {

	@Autowired
	private BaseDAO<PegawaiToko, String> baseDAO;

	@Override
	public void tambahPegawaiToko(PegawaiToko pegawaiToko) {
		baseDAO.add(pegawaiToko);
		
	}

	@Override
	public void suntingDataPegawaiToko(PegawaiToko pegawaiToko) {
		// TODO Auto-generated method stub
		baseDAO.update(pegawaiToko);
	}

	@Override
	public void login(PegawaiToko pegawaiToko, String query) {
		// TODO Auto-generated method stub
		baseDAO.doQuery(query, PegawaiToko.class);
	}

}
