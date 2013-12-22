package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;

import java.util.List;

public interface DetilTransaksiServiceFO {
	void tambahDetilTransaksi (DetilTransaksi detilTransaksi);
	void suntingDetilTransaksi (DetilTransaksi detilTransaksi);
	void hapusDetilTransaksi (String idDetilTransaksi);
	DetilTransaksi lihatDetilTransaksiToko (String idDetilTransaksi);
	List<DetilTransaksi> lihatDaftarDetilTransaksiToko();
}
