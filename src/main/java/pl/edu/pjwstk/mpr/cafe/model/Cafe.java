package pl.edu.pjwstk.mpr.cafe.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import pl.edu.pjwstk.mpr.person.model.Employee;

@Entity
@Table(name = "cafe", catalog = "cafeDB", uniqueConstraints = {
		@UniqueConstraint(columnNames = "cafeName"),
		@UniqueConstraint(columnNames = "cafeAddress") })
public class Cafe implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer cafeId;
	private String cafeName;
	private String cafeAddress;
	private String cafePhone;
	private Integer numOfEmployees = 0;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Cafe() {
	}

	public Cafe(String cafeName, String cafeAddress, String cafePhone,
			Integer numOfEmployees) {
		this.cafeName = cafeName;
		this.cafeAddress = cafeAddress;
		this.cafePhone = cafePhone;
		this.numOfEmployees = numOfEmployees;
	}
	
	public Cafe(String cafeName, String cafeAddress, String cafePhone,
			Integer numOfEmployees, Set<Employee> employees) {
		this.cafeName = cafeName;
		this.cafeAddress = cafeAddress;
		this.cafePhone = cafePhone;
		this.numOfEmployees = numOfEmployees;
		this.employees = employees;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
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

	@Column(name = "cafe_phone", nullable = false, length = 20)
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
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "cafes")
	public Set<Employee> getEmployees() {
		return this.employees;
	}
 
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", cafeName=" + cafeName
				+ ", cafeAddress=" + cafeAddress + ", cafePhone=" + cafePhone
				+ ", numOfEmployees=" + numOfEmployees + "]";
	}
}
