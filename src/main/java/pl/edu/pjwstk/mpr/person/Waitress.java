package pl.edu.pjwstk.mpr.person;

import javax.persistence.Entity;

import pl.edu.pjwstk.mpr.cafe.Translator;

@Entity
public class Waitress extends Employee {

	private static final long serialVersionUID = 1L;

	public Waitress() {
		super();
	}

	public Waitress(String firstName, String lastName, String address,
			String phone, Double sallary) {
		super(firstName, lastName, address, phone, sallary, Translator.ROLE_WAITRESS);
	}
}
