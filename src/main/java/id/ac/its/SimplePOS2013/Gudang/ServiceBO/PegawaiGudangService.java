package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface PegawaiGudangService {
	void tambahPegawaiGudang (PegawaiGudang pegawaiGudang);
	void suntingDataPegawaiGudang (PegawaiGudang pegawaiGudang);
	void login(PegawaiGudang pegawaiGudang, String query);
}
