package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TOKO")
public class Toko {
	
	@Id
	@Column(name="ID_TOKO")
	private String idToko;
	
	@Column(name="NAMA_TOKO")
	private String namaToko; 
	
	@Column(name="ALAMAT_TOKO")
	private String alamatToko; 
	
	@Column(name="UANG_TOKO")
	private Integer uangToko;
	
	@OneToMany(mappedBy="TOKO")
		private Set<StokToko> stokToko;
	
	@OneToMany(mappedBy="TOKO")
		private Set<PegawaiToko> pegawaiToko;
	
	@OneToMany(mappedBy="TOKO")
		private Set<Transaksi> transaksi;

	public Toko(){
			
	}
	
	
	public Toko(String idToko, String namaToko, String alamatToko, Integer uangToko){
		this.idToko = idToko;
		this.namaToko = namaToko;
		this.alamatToko = alamatToko;
		this.uangToko = uangToko;
	}
	
	//setter and getter method
	 public void setIdToko(String idToko) {
		this.idToko = idToko;
	}
	 
	 public void setnamaToko(String namaToko) {
		this.namaToko = namaToko;
	}
	 
	 public void setalamatToko(String alamatToko) {
		this.alamatToko = alamatToko;
	}
	  
	 public void setuangToko(Integer uangToko){
		 this.uangToko = uangToko;
	 }
	 
	 public String getIdToko() {
		return idToko;
	}
	 
	 public String namaToko() {
		return namaToko;
	}
	 
	 public String alamatToko() {
		return alamatToko;
	}
	 
	 public Integer uangToko() {
		return uangToko;
	}
}