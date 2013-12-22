package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface TokoService {
	void tambahToko(Toko toko);
	void suntingToko(Toko toko);
	int hitungPemasukanToko(String idToko, String idTransaksi);
	int hitungPengeluaranToko(String idPegawaiToko, String idStokPerToko);
	
	void hapusToko(String idToko);

}
