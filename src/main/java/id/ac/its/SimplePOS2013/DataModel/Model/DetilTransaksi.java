package id.ac.its.SimplePOS2013.DataModel.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="DETIL_TRANSAKSI")
public class DetilTransaksi {
	
	
	@Id
	@Column(name="ID_DETAIL_TRANSAKSI")
	private String idDetailTransaksi;
	
	//this
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ID_TRANSAKSI")
	private Transaksi transaksi;
	
	//this
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ID_BARANG")
	private Barang barang;
	
	//this
	@Column
	private int qty;
	
	public DetilTransaksi(){
		
	}
	//this
	public DetilTransaksi(String idDetailTransaksi, Transaksi transaksi,
			Barang barang, int qty) {
		super();
		this.idDetailTransaksi = idDetailTransaksi;
		this.transaksi = transaksi;
		this.barang = barang;
		this.qty = qty;
	}

	public String getIdDetailTransaksi() {
		return idDetailTransaksi;
	}

	public void setIdDetailTransaksi(String idDetailTransaksi) {
		this.idDetailTransaksi = idDetailTransaksi;
	}

	public Transaksi getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(Transaksi transaksi) {
		this.transaksi = transaksi;
	}

	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
	}

	//this
	
	public int getQty() {
		return qty;
	}
	//this
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}