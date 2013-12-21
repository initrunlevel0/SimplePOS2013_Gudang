package id.ac.its.SimplePOS2013.DataModel.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRANSAKSI")
public class Transaksi {
	
	@Id
	@Column(name="ID_TRANSAKSI")
	private String idTransaksi;
	
	@ManyToOne
	@JoinColumn(name="ID_PELANGGAN")
	private Pelanggan pelanggan;
	
	@ManyToOne
	@JoinColumn(name="ID_PEGAWAI_TOKO")
	private PegawaiToko pegawaiToko;
	
	@ManyToOne
	@JoinColumn(name="ID_TOKO")
	private Toko toko;
	
	@Column(name="TANGGAL")
	private Date tanggal; 
	
	public Transaksi(){
		
	}

	public Transaksi(String idTransaksi, Pelanggan pelanggan,
			PegawaiToko pegawaiToko, Toko toko, Date tanggal) {
		this.idTransaksi = idTransaksi;
		this.pelanggan = pelanggan;
		this.pegawaiToko = pegawaiToko;
		this.toko = toko;
		this.tanggal = tanggal;
	}

	public String getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(String idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	public Pelanggan getPelanggan() {
		return pelanggan;
	}

	public void setPelanggan(Pelanggan pelanggan) {
		this.pelanggan = pelanggan;
	}

	public PegawaiToko getPegawaiToko() {
		return pegawaiToko;
	}

	public void setPegawaiToko(PegawaiToko pegawaiToko) {
		this.pegawaiToko = pegawaiToko;
	}

	public Toko getToko() {
		return toko;
	}

	public void setToko(Toko toko) {
		this.toko = toko;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	
	
	
}
