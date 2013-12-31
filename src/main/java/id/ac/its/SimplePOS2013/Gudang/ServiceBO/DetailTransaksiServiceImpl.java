package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailTransaksiServiceImpl implements DetailTransaksiService{
	
	@Autowired
	private BaseDAO<DetilTransaksi, String> baseDao;
	
	@Override
	public void tambahDetailTransaksi (DetilTransaksi detilTransaksi){
		baseDao.add(detilTransaksi);
	}
	
	@Override
    public int totalHarga (String idDetailTransaksi){
    	int total  = 0 ;
		return total;
    }
	@Override
	public void hitungKembalian (int totalHarga, int uangBayar){
		//void?
	}
	
	@Override
	public void suntingDetailTransaksi(DetilTransaksi detilTransaksi){
		baseDao.update(detilTransaksi);
	}
	
	
    
    

}
