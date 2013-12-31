package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Barang;

@Service
@Transactional
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
	public void tambahStokBarang(String idBarang, int jumlahBarang) {
		
		
	}

	@Override
	public void suntingBarang(Barang barang) {
		baseDao.update(barang);
	}
	
	//daftarBarang belum terdokumentasi
	@Override
	public List<Barang> daftarBarang(){
		return baseDao.listAll(Barang.class);
	}
	
	@Override
	public void hapusBarang(String idBarang){
		baseDao.delete(idBarang, Barang.class);
	}
}
