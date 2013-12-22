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


	@OneToMany(mappedBy="toko")
	private Set<StokToko> stokPerToko;


	@OneToMany(mappedBy="toko")
	private Set<PegawaiToko> pegawaiToko;

	@OneToMany(mappedBy="toko")
	private Set<Transaksi> transaksi;

	
	public Toko(){
			
	}
	
	
	
	
}