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
	@GeneratedValue
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
	
	public PegawaiGudang(){
		
	}
	
	public PegawaiGudang(String idPegawaiGudang, String namaPegawaiGudang, String alamatPegawaiGudang,String teleponPegawaiGudang ,int gajiPegawaiGudang){
		this.idPegawaiGudang = idPegawaiGudang;
		this.namaPegawaiGudang = namaPegawaiGudang;
		this.alamatPegawaiGudang= alamatPegawaiGudang;
		this.teleponPegawaiGudang= teleponPegawaiGudang;
		this.gajiPegawaiGudang = gajiPegawaiGudang;
	}

	//setter and getter method
	
		public void setIdPegawaiGudang(String idPegawaiGudang) {
			this.idPegawaiGudang = idPegawaiGudang;
		}
		
		public void setNamaPegawaiGudang(String namaPegawaiGudang) {
			this.namaPegawaiGudang= namaPegawaiGudang;
		}
		
		public void setAlamatPegawaiGudang(String alamatPegawaiGudang) {
			this.alamatPegawaiGudang = alamatPegawaiGudang;
		}
		
		public void setTeleponPegawaiGudang(String teleponPegawaiGudang) {
			this.teleponPegawaiGudang = teleponPegawaiGudang;
		}
		
		public void setGajiPegawaiGudang(int gajiPegawaiGudang) {
			this.gajiPegawaiGudang= gajiPegawaiGudang;
		}
		
		public String getIdPegawaiGudang(){
			return idPegawaiGudang;
		}
		
		public String getNamaPegawaiGudang(){
			return namaPegawaiGudang;
		}
		
		public String getAlamatPegawaiGudang(){
			return alamatPegawaiGudang;
		}
		
		public int getGajiPegawaiGudang(){
			return gajiPegawaiGudang;
		}
}
