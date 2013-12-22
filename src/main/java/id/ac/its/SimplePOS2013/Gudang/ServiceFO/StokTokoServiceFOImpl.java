package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;
import id.ac.its.SimplePOS2013.DataModel.Model.StokToko;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StokTokoServiceFOImpl implements StokTokoServiceFO {
	
	@Autowired
	private BaseDAO<StokToko, String> baseDao;
	
	@Override
	public void tambahStokToko(StokToko stokToko){
		baseDao.add(stokToko);
	}
	
	@Override
	public void suntingStokToko(StokToko stokToko){
		baseDao.update(stokToko);
	}
	
	@Override
	public void hapusStokToko (String idStokToko){
		baseDao.delete(idStokToko, StokToko.class);
	}
	
	@Override
	public StokToko lihatStokToko (String idStokToko){
		return baseDao.view(idStokToko, StokToko.class);
	}
	
	@Override
	public List<StokToko> lihatDaftarStokToko(){
		return baseDao.listAll(StokToko.class);
	}
}
