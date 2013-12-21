package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface StokTokoService {
    void tambahStokPerToko(StokToko stokToko);
    void suntingStokPerToko(StokToko stokToko);
    void tambahStokToko (String idBarang, int JumlahBarang);
    StokToko cariStok (String idStokToko);
}
