package pl.edu.pjwstk.mpr.cafe;

public class Cafe {
	private String name;
	private String address;
	private String phone;
	private Integer numOfEmployees;
	private Integer numOfTables;

	public Cafe() {

	}

	public Cafe(String name, String address, String phone,
			Integer numOfEmployees, Integer numOfTables) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.numOfEmployees = numOfEmployees;
		this.numOfTables = numOfTables;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}
	
	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	public Integer getNumOfTables() {
		return numOfTables;
	}
	
	public void setNumOfTables(Integer numOfTables) {
		this.numOfTables = numOfTables;
	}
}
