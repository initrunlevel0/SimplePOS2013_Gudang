package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface PegawaiTokoService {
	void tambahPegawaiToko(PegawaiToko pegawaitoko);
	void suntingDataPegawaiGudang(String idPegawaiGudang);
	boolean login(String idPegawai,String Password);
}
