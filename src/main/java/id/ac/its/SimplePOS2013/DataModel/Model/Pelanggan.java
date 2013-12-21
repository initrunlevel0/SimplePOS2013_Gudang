package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PELANGGAN")
public class Pelanggan {
	
	@Id
	@Column(name="ID_PELANGGAN")
	private String idPelanggan;
	
	@Column(name="NAMA_PELANGGAN")
	private String namaPelanggan; 
	
	@Column(name="ALAMAT_PELANGGAN")
	private String alamatPelanggan; 
	
	@Column(name="TELEPON")
	private String telepon;
	
	@OneToMany(mappedBy="pelanggan")
    private Set<Transaksi> transaksi;
	

	public Pelanggan(){
			
	}
	
	public Pelanggan(String idPelanggan, String namaPelanggan,
			String alamatPelanggan, String telepon, Set<Transaksi> transaksi) {

		this.idPelanggan = idPelanggan;
		this.namaPelanggan = namaPelanggan;
		this.alamatPelanggan = alamatPelanggan;
		this.telepon = telepon;
		this.transaksi = transaksi;
	}

	public String getIdPelanggan() {
		return idPelanggan;
	}


	public void setIdPelanggan(String idPelanggan) {
		this.idPelanggan = idPelanggan;
	}


	public String getNamaPelanggan() {
		return namaPelanggan;
	}


	public void setNamaPelanggan(String namaPelanggan) {
		this.namaPelanggan = namaPelanggan;
	}


	public String getAlamatPelanggan() {
		return alamatPelanggan;
	}


	public void setAlamatPelanggan(String alamatPelanggan) {
		this.alamatPelanggan = alamatPelanggan;
	}


	public String getTelepon() {
		return telepon;
	}


	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}


	public Set<Transaksi> getTransaksi() {
		return transaksi;
	}


	public void setTransaksi(Set<Transaksi> transaksi) {
		this.transaksi = transaksi;
	}
	
	//setter and getter method
	 
}