package id.ac.its.SimplePOS2013.DataModel.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STOK_TOKO")
public class StokToko {
	
	@Id
	@Column(name="ID_STOK_TOKO")
	private String idStokToko;
	
	@ManyToOne
	@JoinColumn(name="ID_TOKO")
	private Toko idToko; 
	
	@ManyToOne
	@JoinColumn(name="ID_BARANG")
	private Barang idBarang; 
	
	@Column(name="STOK_PER_TOKO")
	private Integer stokPerToko;
	
	public StokToko(){
		
	}
	
	public StokToko(String idStokToko, Integer stokPerToko){
		this.idStokToko = idStokToko;
		this.stokPerToko = stokPerToko;
	}
	
	//setter and getter method
	 public void setIdBarang(Barang idBarang) {
		this.idBarang = idBarang;
	}
	 
	 public void setIdToko(Toko idToko) {
		this.idToko = idToko;
	}
	 
	 public void setIdStokToko(String idStokToko) {
		this.idStokToko = idStokToko;
	}
	 
	 public void setStokPerToko(Integer stokPerToko) {
		this.stokPerToko = stokPerToko;
	}
	  
	 public Barang getIdBarang() {
		return idBarang;
	}
	 
	 public Toko getIdToko() {
		return idToko;
	}
	 
	 public String getIdStokToko() {
		return idStokToko;
	}
	 
	 public Integer getStokPerToko() {
		return stokPerToko;
	}
}
