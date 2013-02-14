package pl.edu.pjwstk.mpr.person.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.edu.pjwstk.mpr.person.bo.EmployeeBo;
import pl.edu.pjwstk.mpr.person.dao.EmployeeDao;
import pl.edu.pjwstk.mpr.person.model.Employee;

@Service("employeeBo")
public class EmployeeBoImpl implements EmployeeBo {
 
	@Autowired
	EmployeeDao employeeDao;
 
	public void setStockDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
 
	public void save(Employee employee){
		employeeDao.save(employee);
	}
 
	public void update(Employee employee){
		employeeDao.update(employee);
	}
 
	public void delete(Employee employee){
		employeeDao.delete(employee);
	}
 
	public Employee findByEmployeeFirstLastName(String firstName, String lastName){
		return employeeDao.findByEmployeeFirstLastName(firstName, lastName);
	}
	
	public List<Employee> listAllEmployees(){
		return employeeDao.listAllEmployees();
	}
}
