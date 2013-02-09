package pl.edu.pjwstk.mpr.cafe;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cafe", catalog = "cafeDB")
public class Cafe implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer cafeId;
	private String cafeName;
	private String cafeAddress;
	private String cafePhone;
	private Integer numOfEmployees;
	private Integer numOfTables;
	
	public Cafe() {
	}
	
	public Cafe(String cafeName, String cafeAddress, String cafePhone,
			Integer numOfEmployees, Integer numOfTables) {
		this.cafeName = cafeName;
		this.cafeAddress = cafeAddress;
		this.cafePhone = cafePhone;
		this.numOfEmployees = numOfEmployees;
		this.numOfTables = numOfTables;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cafe_id", unique = true, nullable = false)
	public Integer getCafeId() {
		return cafeId;
	}
	
	public void setCafeId(Integer cafeId) {
		this.cafeId = cafeId;
	}
	
	@Column(name = "cafe_name", unique = true, nullable = false, length = 255)
	public String getCafeName() {
		return cafeName;
	}
	
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	
	@Column(name = "cafe_address", unique = true, nullable = false, length = 255)
	public String getCafeAddress() {
		return cafeAddress;
	}
	
	public void setCafeAddress(String cafeAddress) {
		this.cafeAddress = cafeAddress;
	}
	
	@Column(name = "cafe_phone", unique = true, nullable = false, length = 9)
	public String getCafePhone() {
		return cafePhone;
	}
	
	public void setCafePhone(String cafePhone) {
		this.cafePhone = cafePhone;
	}
	
	@Column(name = "num_of_employees", nullable = true, length = 2)
	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}
	
	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	@Column(name = "num_of_tables", nullable = true, length = 2)
	public Integer getNumOfTables() {
		return numOfTables;
	}
	
	public void setNumOfTables(Integer numOfTables) {
		this.numOfTables = numOfTables;
	}
	
}
