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
	public void setIdToko(String idToko) {
	this.idToko = idToko;
	}
	 
	
	@Column(name="NAMA_TOKO")
	private String namaToko; 
	public void setnamaToko(String namaToko) {
	this.namaToko = namaToko;
	}

	
	@Column(name="ALAMAT_TOKO")
	private String alamatToko; 	 
	public void setalamatToko(String alamatToko) {
	this.alamatToko = alamatToko;
	}
	
	@Column(name="UANG_TOKO")
	private Integer uangToko;
	public void setuangToko(Integer uangToko){
	this.uangToko = uangToko;
	}
	





	@OneToMany(mappedBy="Id_Toko")
	private Set<STOK_PER_TOKO> stokPerToko;
	public String getIdToko() {
		return idToko;
	}

	@OneToMany(mappedBy="Toko")
	private Set<PEGAWAI_TOKO> pegawaiToko;
	public String namaToko() {
		return namaToko;
	}

	@OneToMany(mappedBy="Toko")
	private Set<TRANSAKSI> transaksi;
	public String alamatToko() {
		return alamatToko;
	}

	
	public Integer uangToko() {
		return uangToko;
	
	}
	
	public Toko(){
			
	}
	
	
	public Toko(String idToko, String namaToko, String alamatToko, Integer uangToko){
		this.idToko = idToko;
		this.namaToko = namaToko;
		this.alamatToko = alamatToko;
		this.uangToko = uangToko;
	}
		
	}