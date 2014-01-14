package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TOKO")
public class Toko {
	
	@Id
	@GeneratedValue
	@Column(name="ID_TOKO")
	private int idToko;
	
	@Column(name="NAMA_TOKO")
	private String namaToko; 

	
	@Column(name="ALAMAT_TOKO")
	private String alamatToko; 	 
	
	@Column(name="UANG_TOKO")
	private Integer uangToko;


	@OneToMany(mappedBy="toko")
	private Set<StokToko> stokPerToko;


//	@OneToMany(mappedBy="toko", fetch=FetchType.EAGER)
//	private Set<PegawaiToko> pegawaiToko;

	public Set<Transaksi> getTransaksi() {
		return transaksi;
	}


	public void setTransaksi(Set<Transaksi> transaksi) {
		this.transaksi = transaksi;
	}


	@OneToMany(mappedBy="toko")
	private Set<Transaksi> transaksi;

	
	public Toko(){
			
	}


	public int getIdToko() {
		return idToko;
	}


	public void setIdToko(int idToko) {
		this.idToko = idToko;
	}


	public String getNamaToko() {
		return namaToko;
	}


	public void setNamaToko(String namaToko) {
		this.namaToko = namaToko;
	}


	public String getAlamatToko() {
		return alamatToko;
	}


	public void setAlamatToko(String alamatToko) {
		this.alamatToko = alamatToko;
	}


	public Integer getUangToko() {
		return uangToko;
	}


	public void setUangToko(Integer uangToko) {
		this.uangToko = uangToko;
	}


	public Set<StokToko> getStokPerToko() {
		return stokPerToko;
	}


	public void setStokPerToko(Set<StokToko> stokPerToko) {
		this.stokPerToko = stokPerToko;
	}


	






	
	
	
	
	
}