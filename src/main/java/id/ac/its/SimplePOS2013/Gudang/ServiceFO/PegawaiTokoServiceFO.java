package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.Model.PegawaiToko;

import java.util.List;

public interface PegawaiTokoServiceFO {
	void tambahPegawaiToko(PegawaiToko pegawaiToko);
	void suntingPegawaiToko(PegawaiToko pegawaiToko);
	void hapusPegawaiToko (String idPegawaiToko);
	PegawaiToko lihatPegawaiToko (String idPegawaiToko);
	List<PegawaiToko> lihatDaftarPegawaiToko();
}
