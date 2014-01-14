package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;







import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "PEGAWAI_TOKO")
public class PegawaiToko {

	@Id
	@Column(name= "ID_PEGAWAI")
	private String idPegawai;

	@ManyToOne
	@JoinColumn(name="ID_TOKO")
	@JsonIgnore
	private Toko toko;

	@Column (name = "NAMA_PEGAWAI_TOKO")
	private String namaPegawaiToko;

	@Column (name ="ALAMAT_PEGAWAI_TOKO")
	private String alamatPegawaiToko;

	@Column (name= "TELEPON_PEGAWAI_TOKO")
	private String neleponPegawaiToko;

	@Column (name ="GAJI_PEGAWI_TOKO")
	private int gajiPegawaiToko; 

	//@OneToMany (mappedBy="pegawaiToko")
	//private Set<Transaksi> transaksi;



	public PegawaiToko(){


	}



	public PegawaiToko(String idPegawai, Toko toko, String namaPegawaiToko,
			String nlamatPegawaiToko, String neleponPegawaiToko,
			int gajiPegawaiToko, Set<Transaksi> transaksi) {
		super();
		this.idPegawai = idPegawai;
		this.toko = toko;
		this.namaPegawaiToko = namaPegawaiToko;
		this.alamatPegawaiToko = nlamatPegawaiToko;
		this.neleponPegawaiToko = neleponPegawaiToko;
		this.gajiPegawaiToko = gajiPegawaiToko;
	
	}



	public String getIdPegawai() {
		return idPegawai;
	}



	public void setIdPegawai(String idPegawai) {
		this.idPegawai = idPegawai;
	}



	public Toko getToko() {
		return toko;
	}



	public void setToko(Toko toko) {
		this.toko = toko;
	}



	public String getNamaPegawaiToko() {
		return namaPegawaiToko;
	}



	public void setNamaPegawaiToko(String namaPegawaiToko) {
		this.namaPegawaiToko = namaPegawaiToko;
	}



	public String getNlamatPegawaiToko() {
		return alamatPegawaiToko;
	}



	public void setNlamatPegawaiToko(String nlamatPegawaiToko) {
		this.alamatPegawaiToko = nlamatPegawaiToko;
	}



	public String getNeleponPegawaiToko() {
		return neleponPegawaiToko;
	}



	public void setNeleponPegawaiToko(String neleponPegawaiToko) {
		this.neleponPegawaiToko = neleponPegawaiToko;
	}



	public int getGajiPegawaiToko() {
		return gajiPegawaiToko;
	}



	public void setGajiPegawaiToko(int gajiPegawaiToko) {
		this.gajiPegawaiToko = gajiPegawaiToko;
	}




	
	
}