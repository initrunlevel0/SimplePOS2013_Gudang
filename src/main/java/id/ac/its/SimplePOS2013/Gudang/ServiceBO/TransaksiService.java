package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;

public interface TransaksiService {
	List<Transaksi> transaksiPerBulan(Toko toko);
	List<Transaksi> transaksiPerTahun(Toko toko);
	void tambahTransaksi(Transaksi transaksi); 
	void suntingTransaksi(Transaksi transaksi);
}
