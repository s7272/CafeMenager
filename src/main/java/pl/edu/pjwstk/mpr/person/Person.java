package pl.edu.pjwstk.mpr.person;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private Double sallary;
	private Integer role;

	public Person() {
		
	}

	public Person(String firstName, String lastName, String address,
			String phone, Double sallary, Integer role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.sallary = sallary;
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Double getSallary() {
		return sallary;
	}

	public void setSallary(Double sallary) {
		this.sallary = sallary;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
	
}
