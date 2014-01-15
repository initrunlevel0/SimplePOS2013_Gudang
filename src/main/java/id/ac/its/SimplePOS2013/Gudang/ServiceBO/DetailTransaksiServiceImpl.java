package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailTransaksiServiceImpl implements DetailTransaksiService{
	
	@Autowired
	private BaseDAO<DetilTransaksi, Integer> baseDao;
	
	
	public void tambahDetailTransaksi (DetilTransaksi detilTransaksi){
		baseDao.add(detilTransaksi);
	}
	
	public int totalHarga (int idDetailTransaksi){
		return 0;
    }
	
	public void hitungKembalian (int totalHarga, int uangBayar){
		//void?
	}
	
	public void suntingDetailTransaksi(DetilTransaksi detilTransaksi){
		baseDao.update(detilTransaksi);
	}



}
