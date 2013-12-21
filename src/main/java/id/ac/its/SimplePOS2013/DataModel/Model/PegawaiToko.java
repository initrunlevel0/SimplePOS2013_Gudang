package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "PegawaiToko")
public class PegawaiToko {

	@Id
	@GeneratedValue
	@Column(name= "ID_PEGAWAI")
	private String idPegawai;

	@Column(name= "ID_TOKO")
	private String idToko;

	@Column (name = "NAMA_PEGAWAI_TOKO")
	private String NamaPegawaiToko;

	@Column (name ="ALAMAT_PEGAWAI_TOKO")
	private String AlamatPegawaiToko;

	@Column (name= "TELEPON_PEGAWAI_TOKO")
	private String TeleponPegawaiToko;

	@Column (name ="GAJI_PEGAWI_TOKO")
	private int GajiPegawaiToko; 

	@OneToMany (mappedBy="pegawaiToko")
	private Set<Transaksi> transaksi;



	public PegawaiToko(){


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


	public String getNamaPegawaiToko() {
		return NamaPegawaiToko;
	}


	public void setNamaPegawaiToko(String namaPegawaiToko) {
		NamaPegawaiToko = namaPegawaiToko;
	}


	public String getAlamatPegawaiToko() {
		return AlamatPegawaiToko;
	}


	public void setAlamatPegawaiToko(String alamatPegawaiToko) {
		AlamatPegawaiToko = alamatPegawaiToko;
	}


	public String getTeleponPegawaiToko() {
		return TeleponPegawaiToko;
	}


	public void setTeleponPegawaiToko(String teleponPegawaiToko) {
		TeleponPegawaiToko = teleponPegawaiToko;
	}


	public int getGajiPegawaiToko() {
		return GajiPegawaiToko;
	}


	public void setGajiPegawaiToko(int gajiPegawaiToko) {
		GajiPegawaiToko = gajiPegawaiToko;
	}
}