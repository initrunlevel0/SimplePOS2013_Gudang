package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface BarangService {

    void tambahBarang(Barang barang);
    Barang lihatBarang(String idBarang);
    Barang lihatReferensiBarang(String idBarang);
    void tambahStokBarang(String idBarang, int jumlahBarang);
    void suntingBarang(Barang barang);
    void hapusBarang(String idBarang);
    //listBarang belum masuk dokumentasi
    List<Barang> daftarBarang();
}
