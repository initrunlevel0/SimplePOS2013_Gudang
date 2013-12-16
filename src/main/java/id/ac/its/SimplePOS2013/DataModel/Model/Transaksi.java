package id.ac.its.SimplePOS2013.DataModel.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaksi")
public class Transaksi {
	
	@Id
	@Column(name="ID_TRANSAKSI")
	private String idTransaksi;
	
	@ManyToOne
	@JoinColumn(name="ID_PELANGGAN")
	private String idPelanggan;
	
	@ManyToOne
	@JoinColumn(name="ID_PEGAWAI")
	private String idPegawai;
	
	@ManyToOne
	@JoinColumn(name="ID_TOKO")
	private String idToko;
	
	@Column(name="TANGAL")
	private Date tanggal; 
	
	public Transaksi(){
		
	}

	public Transaksi(String idTransaksi, String idPelanggan, String idPegawai,
			String idToko, Date tanggal) {
		super();
		this.idTransaksi = idTransaksi;
		this.idPelanggan = idPelanggan;
		this.idPegawai = idPegawai;
		this.idToko = idToko;
		this.tanggal = tanggal;
	}

	public String getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(String idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	public String getIdPelanggan() {
		return idPelanggan;
	}

	public void setIdPelanggan(String idPelanggan) {
		this.idPelanggan = idPelanggan;
	}

	public String getIdPegawai() {
		return idPegawai;
	}

	public void setIdPegawai(String idPegawai) {
		this.idPegawai = idPegawai;
	}

	public String getIdToko() {
		return idToko;
	}

	public void setIdToko(String idToko) {
		this.idToko = idToko;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	
	
	
	
}
