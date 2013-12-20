package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;

public class TransaksiServiceImpl implements TransaksiService {

	@Autowired
	private BaseDAO<Transaksi, String> baseDAO;
	@Override
	public List<Transaksi> transaksiPerBulan(Toko toko) {
		String query = new String("");
		return baseDAO.doQuery(query,Transaksi.class);
	}

	@Override
	public List<Transaksi> transaksiPerTahun(Toko toko) {
		String query = new String("");
		return baseDAO.doQuery(query,Transaksi.class);
	}

	@Override
	public void tambahTransaksi(Transaksi transaksi) {
		 baseDAO.add(transaksi);
	}

	@Override
	public void suntingTransaksi(Transaksi transaksi) {
		// TODO Auto-generated method stub
		baseDAO.update(transaksi);
	}

}
