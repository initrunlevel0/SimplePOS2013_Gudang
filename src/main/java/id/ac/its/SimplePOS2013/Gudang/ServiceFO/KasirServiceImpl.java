package id.ac.its.SimplePOS2013.Gudang.ServiceFO;

import id.ac.its.SimplePOS2013.DataModel.DAO.BaseDAO;
import id.ac.its.SimplePOS2013.DataModel.Model.Barang;
import id.ac.its.SimplePOS2013.DataModel.Model.StokToko;
import id.ac.its.SimplePOS2013.DataModel.Model.Struk;
import id.ac.its.SimplePOS2013.DataModel.Model.Toko;
import id.ac.its.SimplePOS2013.DataModel.Model.Transaksi;
import id.ac.its.SimplePOS2013.DataModel.Model.DetilTransaksi;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.BarangService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.DetailTransaksiService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.StokTokoService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TokoService;
import id.ac.its.SimplePOS2013.Gudang.ServiceBO.TransaksiService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KasirServiceImpl implements KasirService {
	@Autowired
	private BarangService barangService;
	
	@Autowired
	private TransaksiService transaksiService;
	
	@Autowired
	private DetailTransaksiService detilTransaksiService;
	
	@Autowired
	private TokoService tokoService;
	
	@Autowired
	private StokTokoService stokTokoService;
	
	public List<Barang> ambilDataBarang() {
		// TODO Auto-generated method stub
		return barangService.daftarBarang();
	}

	@Override
	@Transactional
	public  Transaksi tambahTransaksi(Struk struk) {
		Transaksi transaksi = new Transaksi();
		transaksi.setTanggal(new Date());
		transaksi.setToko(tokoService.lihatReferensiToko(struk.getIdToko()));
		
		
		Set<DetilTransaksi> listDetilTransaksi = new HashSet<DetilTransaksi>();
		int i = 0;
		transaksiService.tambahTransaksi(transaksi);
		for(String s: struk.getIdBarang()) {
			DetilTransaksi dt = new DetilTransaksi();
			dt.setBarang(barangService.lihatReferensiBarang(s));
			dt.setQty(struk.getBarangQty().get(i));
			dt.setTransaksi(transaksi);
			detilTransaksiService.tambahDetailTransaksi(dt);
			listDetilTransaksi.add(dt);
			
			// Kurangi Stok
			StokToko stokToko = stokTokoService.cariStok(struk.getIdToko(), s);
			if(stokToko != null) {
				stokToko.setStokPerToko(stokToko.getStokPerToko() - struk.getBarangQty().get(i));
				stokTokoService.suntingStokPerToko(stokToko);
			}
			i++;
		}
		
		transaksi.setDetilTransaksi(listDetilTransaksi);
		transaksiService.suntingTransaksi(transaksi);
		
		
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