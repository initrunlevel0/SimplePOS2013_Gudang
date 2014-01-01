package id.ac.its.SimplePOS2013.DataModel.Model;

//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PEGAWAI_GUDANG")

public class PegawaiGudang {
	
	@Id
	@Column (name="ID_PEGAWAI_GUDANG")
	private String idPegawaiGudang;
	
	@Column(name="NAMA_PEGAWAI_GUDANG")
	private String namaPegawaiGudang;
	
	@Column(name="ALAMAT_PEGAWAI_GUDANG")
	private String alamatPegawaiGudang;
	
	@Column(name="TELEPON_PEGAWAI_GUDANG")
	private String teleponPegawaiGudang;
	
	@Column(name="GAJI_PEGAWAI_GUDANG")
	private int gajiPegawaiGudang ;
	
	@Column(name="PASSWORD")
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PegawaiGudang(){
		
	}

	public PegawaiGudang(String idPegawaiGudang, String namaPegawaiGudang,
			String alamatPegawaiGudang, String teleponPegawaiGudang,
			int gajiPegawaiGudang) {
		this.idPegawaiGudang = idPegawaiGudang;
		this.namaPegawaiGudang = namaPegawaiGudang;
		this.alamatPegawaiGudang = alamatPegawaiGudang;
		this.teleponPegawaiGudang = teleponPegawaiGudang;
		this.gajiPegawaiGudang = gajiPegawaiGudang;
	}

	public String getIdPegawaiGudang() {
		return idPegawaiGudang;
	}

	public void setIdPegawaiGudang(String idPegawaiGudang) {
		this.idPegawaiGudang = idPegawaiGudang;
	}

	public String getNamaPegawaiGudang() {
		return namaPegawaiGudang;
	}

	public void setNamaPegawaiGudang(String namaPegawaiGudang) {
		this.namaPegawaiGudang = namaPegawaiGudang;
	}

	public String getAlamatPegawaiGudang() {
		return alamatPegawaiGudang;
	}

	public void setAlamatPegawaiGudang(String alamatPegawaiGudang) {
		this.alamatPegawaiGudang = alamatPegawaiGudang;
	}

	public String getTeleponPegawaiGudang() {
		return teleponPegawaiGudang;
	}

	public void setTeleponPegawaiGudang(String teleponPegawaiGudang) {
		this.teleponPegawaiGudang = teleponPegawaiGudang;
	}

	public int getGajiPegawaiGudang() {
		return gajiPegawaiGudang;
	}

	public void setGajiPegawaiGudang(int gajiPegawaiGudang) {
		this.gajiPegawaiGudang = gajiPegawaiGudang;
	}
	
	
}
