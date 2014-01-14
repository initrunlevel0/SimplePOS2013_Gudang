package id.ac.its.SimplePOS2013.DataModel.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Struk implements Serializable {
	
	private int idToko;
	private List<String> idBarang;
	
	public int getIdToko() {
		return idToko;
	}
	public void setIdToko(int idToko) {
		this.idToko = idToko;
	}
	public List<String> getIdBarang() {
		return idBarang;
	}
	public void setIdBarang(List<String> idBarang) {
		this.idBarang = idBarang;
	}
}
