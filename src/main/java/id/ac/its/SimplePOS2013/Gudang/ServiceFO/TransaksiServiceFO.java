package id.ac.its.SimplePOS2013.Gudang.ServiceFO;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface TransaksiServiceFO {
	void tambahTransaksiToko(Transaksi transaksi);
	void suntingTransaksiToko(Transaksi transaksi);
	void hapusTransaksiToko (String idTransaksi);
	Transaksi lihatTransaksiToko (String idTransaksi);
	List<Transaksi> lihatDaftarTransaksiToko();
}
