package pl.edu.pjwstk.mpr.person.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pl.edu.pjwstk.mpr.person.dao.EmployeeDao;
import pl.edu.pjwstk.mpr.person.model.Employee;
import pl.edu.pjwstk.mpr.util.CustomHibernateDaoSupport;

@Repository("employeeDao")
public class EmployeeDaoImpl extends CustomHibernateDaoSupport implements
		EmployeeDao {

	public void save(Employee employee) {
		getHibernateTemplate().save(employee);
	}

	public void update(Employee employee) {
		getHibernateTemplate().update(employee);
	}

	public void delete(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	public Employee findByEmployeeFirstLastName(String firstName,
			String lastName) {
		List list = getHibernateTemplate().find(
				"from Employee where firstName=" + firstName + " and lastName="
						+ lastName);
		return (Employee) list.get(0);
	}

	public List<Employee> listAllEmployees() {
		List<Employee> list = getHibernateTemplate().find("from Employee");
		return list;
	}

}
