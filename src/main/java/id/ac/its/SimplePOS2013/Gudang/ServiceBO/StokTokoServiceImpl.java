package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;
import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.StokToko;

public class StokTokoServiceImpl implements StokTokoService {

	@Autowired
	private BaseDAO<StokToko, String> baseDAO;

	@Override
	public void tambahStokPerToko(StokToko stokToko) {
		// TODO Auto-generated method stub
		baseDAO.add(stokToko);
	}

	@Override
	public void suntingStokPerToko(StokToko stokToko) {
		// TODO Auto-generated method stub
		baseDAO.update(stokToko);
	}

	@Override
	public void tambahStokToko(String idBarang) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StokToko cariStok(String idStokToko) {
		// TODO Auto-generated method stub
		
		return null;
	}
	

}
