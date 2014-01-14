package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface TokoService {
	void tambahToko(Toko toko);
	void suntingToko(Toko toko);
	Toko lihatToko(int idToko);
	int hitungPemasukan(String idToko, String idTransaksi);
	int hitungPengeluaran(String idPegawaiToko, String idStokPerToko);
	
	void hapusToko(int idToko);

}
