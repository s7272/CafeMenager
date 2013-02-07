package pl.edu.pjwstk.mpr.person;

import pl.edu.pjwstk.mpr.cafe.Translator;

public class Menager extends Person {

	public Menager() {
		super();
	}

	public Menager(String firstName, String lastName, String address,
			String phone, Double sallary) {
		super(firstName, lastName, address, phone, sallary, Translator.ROLE_MENAGER);
	}

}
