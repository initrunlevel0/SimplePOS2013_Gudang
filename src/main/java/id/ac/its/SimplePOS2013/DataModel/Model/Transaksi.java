package id.ac.its.SimplePOS2013.DataModel.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TRANSAKSI")
public class Transaksi {
	
	@Id
	@GeneratedValue
	@Column(name="ID_TRANSAKSI")
	private int idTransaksi;
	
	//this
	@OneToMany(mappedBy="transaksi")
	private Set<DetilTransaksi> detilTransaksi;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ID_TOKO")
	private Toko toko;
	
	@Column(name="TANGGAL")
	private Date tanggal; 
	
	
	
	//this
	public Set<DetilTransaksi> getDetilTransaksi() {
		return detilTransaksi;
	}
	
	//this
	public void setDetilTransaksi(Set<DetilTransaksi> detilTransaksi) {
		this.detilTransaksi = detilTransaksi;
	}
	
	public Transaksi(){
		
	}

	

	public Transaksi(int idTransaksi, Pelanggan pelanggan,
			PegawaiToko pegawaiToko, Toko toko, Date tanggal) {
		this.idTransaksi = idTransaksi;
	
		this.toko = toko;
		this.tanggal = tanggal;
	}

	public int getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(int idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	

	public Toko getToko() {
		return toko;
	}

	public void setToko(Toko toko) {
		this.toko = toko;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	
	
	
}
