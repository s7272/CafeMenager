package pl.edu.pjwstk.mpr.person.dao;

import java.util.List;

import pl.edu.pjwstk.mpr.person.model.Employee;

public interface EmployeeDao {

	void save(Employee cafe);

	void update(Employee cafe);

	void delete(Employee cafe);

	Employee findByEmployeeFirstLastName(String firstName, String lastName);
	
	List<Employee> listAllEmployees();
}
