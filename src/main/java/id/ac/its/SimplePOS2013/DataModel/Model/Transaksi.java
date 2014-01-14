package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TRANSAKSI")
public class Transaksi {
	
	@Id
	@GeneratedValue
	@Column(name="ID_TRANSAKSI")
	private int idTransaksi;
	
	
	@ManyToOne
	@JoinColumn(name="ID_TOKO")
	private Toko toko;
	
	@Column(name="TANGGAL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tanggal; 
	
	
	
	@ManyToMany
	@JoinTable(name="DETIL_TRANSAKSI", joinColumns={@JoinColumn(name="ID_TRANSAKSI")}, inverseJoinColumns={@JoinColumn(name="ID_BARANG")})
	private List<Barang> barang;
	
	public Transaksi(){
		
	}

	
	public List<Barang> getBarang() {
		return barang;
	}


	public void setBarang(List<Barang> barang) {
		this.barang = barang;
	}


	public Transaksi(int idTransaksi, Pelanggan pelanggan,
			PegawaiToko pegawaiToko, Toko toko, Date tanggal) {
		this.idTransaksi = idTransaksi;
	
		this.toko = toko;
		this.tanggal = tanggal;
	}

	public int getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(int idTransaksi) {
		this.idTransaksi = idTransaksi;
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
