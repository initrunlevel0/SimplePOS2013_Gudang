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
	private Transaksi idTransaksi;
	
	@ManyToOne
	@JoinColumn(name="ID_BARANG")
	private Barang idBarang;
	
	@Column
	private int uangBayar;
	
	@Column
	private int uangKembalian;

	public DetilTransaksi(String idDetailTransaksi, Transaksi idTransaksi,
			Barang idBarang, int uangBayar, int uangKembalian) {
		super();
		this.idDetailTransaksi = idDetailTransaksi;
		this.idTransaksi = idTransaksi;
		this.idBarang = idBarang;
		this.uangBayar = uangBayar;
		this.uangKembalian = uangKembalian;
	}

	public String getIdDetailTransaksi() {
		return idDetailTransaksi;
	}

	public void setIdDetailTransaksi(String idDetailTransaksi) {
		this.idDetailTransaksi = idDetailTransaksi;
	}

	public Transaksi getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(Transaksi idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	public Barang getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(Barang idBarang) {
		this.idBarang = idBarang;
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
