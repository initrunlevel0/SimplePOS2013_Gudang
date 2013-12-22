package id.ac.its.SimplePOS2013.DataModel.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DETIL_TRANSAKSI")
public class DetilTransaksi {
	
	@Id
	@Column(name="ID_DETAIL_TRANSAKSI")
	private String idDetailTransaksi;
	
	@ManyToOne
	@JoinColumn(name="ID_TRANSAKSI")
	private Transaksi transaksi;
	
	@ManyToOne
	@JoinColumn(name="ID_BARANG")
	private Barang barang;
	
	@Column
	private int uangBayar;
	
	@Column
	private int uangKembalian;

	public DetilTransaksi(){
		
	}
	public DetilTransaksi(String idDetailTransaksi, Transaksi transaksi,
			Barang barang, int uangBayar, int uangKembalian) {
		super();
		this.idDetailTransaksi = idDetailTransaksi;
		this.transaksi = transaksi;
		this.barang = barang;
		this.uangBayar = uangBayar;
		this.uangKembalian = uangKembalian;
	}

	public String getIdDetailTransaksi() {
		return idDetailTransaksi;
	}

	public void setIdDetailTransaksi(String idDetailTransaksi) {
		this.idDetailTransaksi = idDetailTransaksi;
	}

	public Transaksi getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(Transaksi transaksi) {
		this.transaksi = transaksi;
	}

	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
	}

	public int getUangBayar() {
		return uangBayar;
	}

	public void setUangBayar(int uangBayar) {
		this.uangBayar = uangBayar;
	}

	public int getUangKembalian() {
		return uangKembalian;
	}

	public void setUangKembalian(int uangKembalian) {
		this.uangKembalian = uangKembalian;
	}
	
}
