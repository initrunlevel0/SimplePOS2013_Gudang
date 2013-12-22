package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.Model.StokToko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;

import java.util.List;

public interface StokTokoServiceFO {
	void tambahStokToko(StokToko stokToko);
	void suntingStokToko(StokToko stokToko);
	void hapusStokToko (String idStokToko);
	StokToko lihatStokToko (String idStokToko);
	List<StokToko> lihatDaftarStokToko();
}
