package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface StokTokoService {
    void tambahStokPerToko(StokToko stokToko);
    StokToko cariStok (String idStokToko);
    StokToko cariStok(int idToko, String idBarang);
	void suntingStokPerToko(StokToko stokToko);
	
	void hapusStokToko(String idStokToko);
	List<StokToko> daftarStokToko();
}
