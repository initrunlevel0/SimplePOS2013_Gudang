package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;
import id.ac.its.SimplePOS2013.DataModel.DAO.*;
import java.util.List;

public class DetilTransaksiServiceFOImpl implements DetilTransaksiServiceFO {
	BaseDAO<DetilTransaksi, String> baseDAO;
	@Override
	public void tambahDetilTransaksi(DetilTransaksi detilTransaksi) {
		// TODO Auto-generated method stub
		baseDAO.add(detilTransaksi);
	}

	@Override
	public void suntingDetilTransaksi(DetilTransaksi detilTransaksi) {
		// TODO Auto-generated method stub
		baseDAO.update(detilTransaksi);
	}

	@Override
	public void hapusDetilTransaksi(String idDetilTransaksi) {
		// TODO Auto-generated method stub
		baseDAO.delete(idDetilTransaksi, DetilTransaksi.class);
	}

	@Override
	public DetilTransaksi lihatDetilTransaksiToko(String idDetilTransaksi) {
		// TODO Auto-generated method stub
		return baseDAO.view(idDetilTransaksi, DetilTransaksi.class);
	}

	@Override
	public List<DetilTransaksi> lihatDaftarDetilTransaksiToko() {
		// TODO Auto-generated method stub
		return baseDAO.listAll(DetilTransaksi.class);
	}

}
