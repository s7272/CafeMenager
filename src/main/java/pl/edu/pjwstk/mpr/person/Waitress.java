package pl.edu.pjwstk.mpr.person;

import pl.edu.pjwstk.mpr.cafe.Translator;

public class Waitress extends Person {

	public Waitress() {
		super();
	}

	public Waitress(String firstName, String lastName, String address,
			String phone, Double sallary) {
		super(firstName, lastName, address, phone, sallary, Translator.ROLE_WAITRESS);
	}
}
