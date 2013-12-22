package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import org.springframework.beans.factory.annotation.Autowired;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;


public class TokoServiceImpl implements TokoService{
	
	@Autowired
	private BaseDAO<Toko, String> baseDao;

	@Override
	public void tambahToko(Toko toko) {
		baseDao.add(toko);
	}
	
	@Override
	public void suntingToko(Toko toko){
		baseDao.update(toko);
	}
	
	@Override
	public int hitungPemasukanToko(String idToko, String idTransaksi){
		//gak ngerti ini
		int pemasukan=0;
		
		return pemasukan;
	}
	
	@Override
	public int hitungPengeluaranToko(String idPegawaiToko, String idStokPerToko){
		int pengeluaran=0;
		
		return pengeluaran;
	}
	
	@Override
	public void hapusToko(String idToko){
		baseDao.delete(idToko, Toko.class);
	}
	
	
}
