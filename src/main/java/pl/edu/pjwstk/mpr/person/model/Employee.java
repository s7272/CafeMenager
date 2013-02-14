package pl.edu.pjwstk.mpr.person.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
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
import javax.persistence.Table;

import pl.edu.pjwstk.mpr.cafe.model.Cafe;
import pl.edu.pjwstk.mpr.common.Translator;

@Entity
@Table(name = "employee", catalog = "cafeDB")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private Double sallary;
	private Integer role;
	private Set<Cafe> cafes = new HashSet<Cafe>(0);

	public Employee() {
	}

	public Employee(String firstName, String lastName, String address,
			String phone, Double sallary, Integer role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.sallary = sallary;
		this.role = role;
	}

	public Employee(String firstName, String lastName, String address,
			String phone, Double sallary, Integer role, Set<Cafe> cafes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.sallary = sallary;
		this.role = role;
		this.cafes = cafes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "employee_id", unique = true, nullable = false)
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "first_name", nullable = false, length = 120)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 120)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "address", nullable = false, length = 255)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", nullable = false, length = 20)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "sallary", nullable = false)
	public Double getSallary() {
		return sallary;
	}

	public void setSallary(Double sallary) {
		this.sallary = sallary;
	}

	@Column(name = "role", nullable = false)
	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "cafe_employee", catalog = "cafeDB", joinColumns = { @JoinColumn(name = "employee_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "cafe_id", nullable = false, updatable = false) })
	public Set<Cafe> getCafes() {
		return this.cafes;
	}

	public void setCafes(Set<Cafe> cafes) {
		this.cafes = cafes;
	}

	@Override
	public String toString() {
		String cafeNames = "";
		for (Cafe c : cafes) {
			cafeNames += c.getCafeName() + ", ";
		}
		return "Employee [employeeId=" + employeeId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", address=" + address
				+ ", phone=" + phone + ", sallary=" + sallary + ", cafes="
				+ cafeNames + "role=" + Translator.getRoleName(role) + "]";
	}

}
