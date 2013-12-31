package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.StokToko;

@Service
public class StokTokoServiceImpl implements StokTokoService {

	@Autowired
	private BaseDAO<StokToko, String> baseDao;

	@Override
	public void tambahStokPerToko(StokToko stokToko) {
		// TODO Auto-generated method stub
		baseDao.add(stokToko);
	}

	@Override
	public void suntingStokPerToko(StokToko stokToko, String idStokToko) {
		// TODO Auto-generated method stub
		this.cariStok(idStokToko);
		baseDao.update(stokToko);
	}

	@Override
	public StokToko cariStok(String idStokToko) {
		// TODO Auto-generated method stub
		return baseDao.view(idStokToko, StokToko.class);
	}
	
	@Override
	public void hapusStokToko(String idStokToko){
		baseDao.delete(idStokToko, StokToko.class);
	}
	
	public List<StokToko> daftarStokToko(){
		return baseDao.listAll(StokToko.class);
	}
}
