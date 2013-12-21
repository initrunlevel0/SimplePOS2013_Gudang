package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface PegawaiTokoService {
	void tambahPegawaiToko(PegawaiToko pegawaiToko);
	void login(PegawaiToko pegawaiToko, String query);
	void suntingDataPegawaiToko(PegawaiToko pegawaiToko);
}
