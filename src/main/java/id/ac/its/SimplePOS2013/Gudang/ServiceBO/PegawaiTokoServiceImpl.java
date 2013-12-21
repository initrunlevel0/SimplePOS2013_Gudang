package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;

public class PegawaiTokoServiceImpl implements PegawaiTokoService {

	@Autowired
	private BaseDAO<PegawaiToko, String> baseDao;

	@Override
	public void tambahPegawaiToko(PegawaiToko pegawaitoko) {
		baseDao.add(pegawaitoko);
	}
	
	@Override
	public void suntingDataPegawaiToko(PegawaiToko pegawaiToko){
		baseDao.update(pegawaiToko);
	}
	
	@Override
	public boolean login(String idPegawai,String Password){
		String query = new String("");
		return true;
	}
	
	public void hapusPegawaiToko(String idPegawaitoko){
		baseDao.delete(idPegawaitoko, PegawaiToko.class);
	}
	
	public List<PegawaiToko> daftarPegawaiToko(){
		return baseDao.listAll(PegawaiToko.class);
	}
	public PegawaiToko lihatDataPegawaiToko(String idPegawaiToko){
		return baseDao.view(idPegawaiToko, PegawaiToko.class);
	}

}
