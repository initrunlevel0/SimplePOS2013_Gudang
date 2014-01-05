package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;
import id.ac.its.SimplePOS2013.DataModel.Model.Struk;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.DetailTransaksiService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TransaksiService;

import java.util.List;

public class KasirServiceImpl implements KasirService {
	
	private BarangService barangService;
	private DetailTransaksiService detilTransaksiService;
	private TransaksiService transaksiService;
	
	@Override
	public List<Barang> ambilDataBarang() {
		// TODO Auto-generated method stub
		return barangService.daftarBarang();
	}

	@Override
	public void tambahDetilTransaksi(DetilTransaksi detilTransaksi){
		detilTransaksiService.tambahDetailTransaksi(detilTransaksi);
	}
	
	@Override
	public void tambahTransaksi(Transaksi transaksi) {
		// TODO Auto-generated method stub
		transaksiService.tambahTransaksi(transaksi);
		
	}

	@Override
	public void kurangiStokToko(Barang barang, Toko toko, int stok) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Toko lihatInfoToko(int idToko) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void tambahTransaksi(Transaksi transaksi,
			List<DetilTransaksi> detilTransaksi) {
		// TODO Auto-generated method stub
		
	}

}
