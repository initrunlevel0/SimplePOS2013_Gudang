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
	
	@OneToMany(mappedBy="PELANGGAN")
		private Set<Transaksi> transaksi;
	

	public Pelanggan(){
			
	}
	
	
	public Pelanggan(String idPelanggan, String namaPelanggan, String alamatPelanggan, String Telepon){
		this.idPelanggan = idPelanggan;
		this.namaPelanggan = namaPelanggan;
		this.alamatPelanggan = alamatPelanggan;
		this.telepon = telepon;
	}
	
	//setter and getter method
	 public void setIdPelanngan(String idPelanggan) {
		this.idPelanggan = idPelanggan;
	}
	 
	 public void setnamaPelanggan(String namaPelanggan) {
		this.namaPelanggan = namaPelanggan;
	}
	 
	 public void setalamatPelanggan(String alamatPelanggan) {
		this.alamatPelanggan = alamatPelanggan;
	}
	  
	 public void settelepon(String telepon){
		 this.telepon = telepon;
	 }
	 
	 public String getIdPelanggan() {
		return idPelanggan;
	}
	 
	 public String namaPelanggan() {
		return namaPelanggan;
	}
	 
	 public String alamatPelanggan() {
		return alamatPelanggan;
	}
	 
	 public String telepon() {
		return telepon;
	}
}