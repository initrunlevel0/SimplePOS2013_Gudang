/* THIS IS OBSOLLATTEEE -- Wira */
package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;
import id.ac.its.SimplePOS2013.DataModel.Model.StokToko;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PegawaiTokoServiceFOImpl implements PegawaiTokoServiceFO {

	@Autowired
	private BaseDAO<PegawaiToko, String> baseDao;
	
	@Override
	public void tambahPegawaiToko(PegawaiToko pegawaiToko) {
		baseDao.add(pegawaiToko);
	}

	@Override
	public void suntingPegawaiToko(PegawaiToko pegawaiToko) {
		baseDao.update(pegawaiToko);
	}

	@Override
	public void hapusPegawaiToko(String idPegawaiToko) {
		baseDao.delete(idPegawaiToko, PegawaiToko.class);
	}

	@Override
	public PegawaiToko lihatPegawaiToko(String idPegawaiToko) {
		return baseDao.view(idPegawaiToko, PegawaiToko.class);
	}

	@Override
	public List<PegawaiToko> lihatDaftarPegawaiToko() {
		return baseDao.listAll(PegawaiToko.class);
	}
	
}
