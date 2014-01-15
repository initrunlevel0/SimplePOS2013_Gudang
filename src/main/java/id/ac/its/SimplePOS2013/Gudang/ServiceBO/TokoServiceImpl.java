package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;

@Service
public class TokoServiceImpl implements TokoService{
	
	@Autowired
	private BaseDAO<Toko, Integer> baseDao;

	@Override
	public void tambahToko(Toko toko) {
		baseDao.add(toko);
	}
	
	@Override
	public void suntingToko(Toko toko){
		baseDao.update(toko);
	}
	
	@Override
	public List<Toko> daftarToko(){
		return baseDao.listAll(Toko.class);
	}
	
	public Toko lihatToko(int idToko){
		return baseDao.view(idToko, Toko.class);
	}
	
	@Override
	public int hitungPemasukan(String idToko, String idTransaksi){
		//gak ngerti ini
		int pemasukan=0;
		
		return pemasukan;
	}
	
	@Override
	public int hitungPengeluaran(String idPegawaiToko, String idStokPerToko){
		int pengeluaran=0;
		
		return pengeluaran;
	}
	
	@Override
	public void hapusToko(int idToko){
		baseDao.delete(idToko, Toko.class);
	}

	@Override
	public Toko lihatReferensiToko(int idToko) {
		return baseDao.getReferences(idToko, Toko.class);
	}
	
	
}
