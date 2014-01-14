package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.DataModel.Model.Struk;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TokoService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TransaksiService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KasirServiceImpl implements KasirService {
	@Autowired
	private BarangService barangService;
	
	@Autowired
	private TransaksiService transaksiService;
	
	@Autowired
	private TokoService tokoService;
	
	public List<Barang> ambilDataBarang() {
		// TODO Auto-generated method stub
		return barangService.daftarBarang();
	}

	@Override
	public Transaksi tambahTransaksi(Struk struk) {
		Transaksi transaksi = new Transaksi();
		List<Barang> listBarang = new ArrayList<Barang>();
		transaksi.setToko(tokoService.lihatToko(struk.getIdToko()));
		for(String s: struk.getIdBarang()) {
			listBarang.add(barangService.ambilBarangId(s));
		}
		transaksi.setBarang(listBarang);
		
		transaksiService.tambahTransaksi(transaksi);
		return transaksi;
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
}