package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.ArrayList;
import java.util.List;

public class Struk {
	private Transaksi transaksi;
	private List<DetilTransaksi> detilTransaksi = new ArrayList<DetilTransaksi>();
	public Transaksi getTransaksi() {
		return transaksi;
	}
	public void setTransaksi(Transaksi transaksi) {
		this.transaksi = transaksi;
	}
	public List<DetilTransaksi> getDetilTransaksi() {
		return detilTransaksi;
	}
	public void setDetilTransaksi(List<DetilTransaksi> detilTransaksi) {
		this.detilTransaksi = detilTransaksi;
	}
	
	
}
