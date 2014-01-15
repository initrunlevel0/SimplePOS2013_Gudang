package id.ac.its.SimplePOS2013.Gudang.ServiceBO;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface DetailTransaksiService {

    void tambahDetailTransaksi (DetilTransaksi detilTransaksi);
    void suntingDetailTransaksi(DetilTransaksi detilTransaksi);
    int totalHarga (String idDetailTransaksi);
    void hitungKembalian (int totalHarga, int uangBayar);

}

