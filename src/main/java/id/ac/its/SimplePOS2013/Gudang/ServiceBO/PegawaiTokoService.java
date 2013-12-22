package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface PegawaiTokoService {
	void tambahPegawaiToko(PegawaiToko pegawaitoko);
	void suntingDataPegawaiToko(PegawaiToko pegawaiToko);
	boolean login(String idPegawai,String Password);
	
	void hapusPegawaiToko(String idPegawaitoko);
	List<PegawaiToko> daftarPegawaiToko();
	PegawaiToko lihatDataPegawaiToko(String idPegawaiToko);
}
