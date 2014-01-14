package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.DataModel.Model.Struk;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;

import java.util.List;

public interface KasirService {
	public List<Barang> ambilDataBarang();
	public void kurangiStokToko(Barang barang, Toko toko, int stok);
	public Toko lihatInfoToko(int idToko);
	public Transaksi tambahTransaksi(Struk struk);
	
}
