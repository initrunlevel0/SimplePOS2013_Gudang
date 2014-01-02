/* THIS IS OBSOLLATTEEE -- Wira */
package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiGudang;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.PegawaiTokoService;

public class TransaksiServiceFOImpl implements TransaksiServiceFO {

	@Autowired
	private BaseDAO<Transaksi, String> baseDAO;

	@Override
	public void tambahTransaksiToko(Transaksi transaksi) {
		// TODO Auto-generated method stub
		baseDAO.add(transaksi);
	}

	@Override
	public void suntingTransaksiToko(Transaksi transaksi) {
		// TODO Auto-generated method stub
		baseDAO.update(transaksi);
	}

	@Override
	public void hapusTransaksiToko(String idTransaksi) {
		// TODO Auto-generated method stub
		baseDAO.delete(idTransaksi, Transaksi.class);	
	}

	@Override
	public Transaksi lihatTransaksiToko(String idTransaksi) {
		// TODO Auto-generated method stub
		return baseDAO.view(idTransaksi, Transaksi.class);
	}

	@Override
	public List<Transaksi> lihatDaftarTransaksiToko() {
		// TODO Auto-generated method stub
		return baseDAO.listAll(Transaksi.class);
	}

}
