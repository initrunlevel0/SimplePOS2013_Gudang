package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;
import java.Sql.Date;

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
	
	@Id
	@GeneratedValue
	@Column(name= "ID_TOKO")
	private String idToko;
	
	@Column (name = "NAMA_PEGAWAI_TOKO")
	private String NamaPegawaiToko;
	
	@Column (name ="ALAMAT_PEGAWAI_TOKO")
	private String AlamatPegawaiToko;
	
	@Column (name= "TELEPON_PEGAWAI_TOKO")
	private String TeleponPegawaiToko;
	
	@Columns (name ="GAJI_PEGAWI_TOKO")
	private int GajiPegawaiToko; 
	
	@OneToMany (mappedBy="PegawaiToko")
	private Set<Transaksi> transaksi;
	
}

public PegawaiToko(){
	
	
}
//Getter and Setter methods
public String getidPegawai(){
	return idPegawai;
}

public void idPegawai(String idPegawai){
	this.idPegawai = idPegawai;
}

public String getidToko(){
	return idToko;
}

public void setidToko(String idToko){
	this.idToko = idToko;
}

public String getNamaPegawaiToko(){
	return NamaPegawaiToko;
}

public void setNamaPegawaiToko(String NamaPegawaiToko){
	this.NamaPegawaiToko = NamaPegawaiToko;
}

public String getAlamatPegawaiToko(){
	return AlamatPegawaiToko;
}
public void setAlamatPegawaiToko(String AlamatPegawaiToko){
	this.AlamatPegawaiToko = AlamatPegawaiToko;
}

public String getTeleponPegawaiToko(){
	return TeleponPegawaiToko;
}

public void setTeleponPegawaiToko(String TeleponPegawaiToko){
	this.TeleponPegawaiToko = TeleponPegawaiToko;
}

public int getGajiPegawaiToko(){
	return GajiPegawaiToko;
}

public void setGajiPegawaiToko(int GajiPegawaiToko){
	this.GajiPegawaiToko = GajiPegawaiToko;
}
