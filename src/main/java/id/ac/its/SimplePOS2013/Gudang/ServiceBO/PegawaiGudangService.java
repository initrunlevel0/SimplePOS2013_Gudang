package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface PegawaiGudangService {
	void tambahPegawaiGudang (PegawaiGudang pegawaigudang);
	void suntingDataPegawaiGudang (PegawaiGudang pegawaigudang);
	void hapusPegawaiGudang(String idPegawaiGudang);
	List<PegawaiGudang> daftarPegawaiGudang();
	PegawaiGudang lihatDataPegawaiGudang(String idPegawaiGudang);
	boolean login(String idPegawai, String Password);
}
