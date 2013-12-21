package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface PegawaiGudangService {
	void tambahPegawaiGudang (PegawaiGudang pegawaigudang);
	void suntingDataPegawaiGudang (PegawaiGudang pegawaigudang);
	boolean login(String idPegawai, String Password);
}
