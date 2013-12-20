package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Barang;

@Service
public class BarangServiceImpl implements BarangService {
	
	@Autowired
	private BaseDAO<Barang, String> baseDao;

	@Override
	public void tambahBarang(Barang barang) {
		baseDao.add(barang);
		
	}

	@Override
	public Barang ambilBarangId(String idBarang) {
		return baseDao.view(idBarang, Barang.class);
	}

	@Override
	public void tambahStokBarang(String idBarang) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suntingBarang(String idBarang) {
		// TODO Auto-generated method stub
		
	}
	
}
