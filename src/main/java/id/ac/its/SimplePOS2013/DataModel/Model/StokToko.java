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
	private Toko toko; 
	
	@ManyToOne
	@JoinColumn(name="ID_BARANG")
	private Barang barang; 
	
	@Column(name="STOK_PER_TOKO")
	private Integer stokPerToko;
	
	public StokToko(){
		
	}

	public StokToko(String idStokToko, Toko toko, Barang barang,
			Integer stokPerToko) {
		this.idStokToko = idStokToko;
		this.toko = toko;
		this.barang = barang;
		this.stokPerToko = stokPerToko;
	}

	public String getIdStokToko() {
		return idStokToko;
	}

	public void setIdStokToko(String idStokToko) {
		this.idStokToko = idStokToko;
	}

	public Toko getToko() {
		return toko;
	}

	public void setToko(Toko toko) {
		this.toko = toko;
	}

	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
	}

	public Integer getStokPerToko() {
		return stokPerToko;
	}

	public void setStokPerToko(Integer stokPerToko) {
		this.stokPerToko = stokPerToko;
	}
	
	
}
