package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface BarangService {

    void tambahBarang(Barang barang);
    Barang ambilBarangId(String idBarang);
    void tambahStokBarang(String idBarang);
    void suntingBarang(String idBarang);

}
