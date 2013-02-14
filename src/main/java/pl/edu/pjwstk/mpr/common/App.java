package pl.edu.pjwstk.mpr.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.edu.pjwstk.mpr.cafe.bo.CafeBo;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;
import pl.edu.pjwstk.mpr.person.bo.EmployeeBo;
import pl.edu.pjwstk.mpr.person.model.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");

		String mainMenu = "1 - Manage Cafe\n" + "2 - Manage Employee\n"
				+ "0 - Exit CafeMenager";
		String cafeMenu = "1 - New Cafe\n" + "2 - Update Cafe\n"
				+ "3 - Get list of Cafes\n" + "4 - Delete Cafe\n"
				+ "0 - Back to main menu";
		String cafeMenuUpdate = "1 - update name of cafe\n"
				+ "2 - update address\n" + "3 - update phone\n"
				+ "4 - update all data\n" + "0 - back to cafe menu";
		String employeeMenu = "1 - New Employee\n" + "2 - Update Employee\n"
				+ "3 - Get list of Employees\n" + "4 - Delete Employee\n"
				+ "0 - Back to main menu";
		String employeeMenuRole = "1 - Menager\n" + "2 - Waitress";
		String employeeMenuUpdate = "1 - update first name\n"
				+ "2 - update last name\n" + "3 - update address\n"
				+ "4 - update phone\n" + "5 - update sallary\n"
				+ "6 - update role\n" + "7 - update cafes\n"
				+ "8 - update all data\n" + "0 - Back to employee menu";
		String employeeMenuUpdateCafes = "1 - List of Cafes\n"
				+ "2 - delete from Cafe" + "3 - add to Cafe "
				+ "0 - Back to employee update menu";

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {

			Integer optMain;
			do {
				System.out.println("Welcome to CafeMenager!\n"
						+ "Please type what you want to do:\n");
				System.out.println(mainMenu);
				System.out.print("Your choice: ");
				optMain = Integer.parseInt(br.readLine());

				CafeBo cafeBo = (CafeBo) appContext.getBean("cafeBo");
				Cafe cafe2;
				Integer optCafe;
				Set<Cafe> cafes = new HashSet<Cafe>();

				EmployeeBo employeeBo = (EmployeeBo) appContext
						.getBean("employeeBo");
				Employee employee2;
				Integer optEmployee;
				String firstName;
				String lastName;

				switch (optMain) {
				case 1:
					do {
						System.out.println("You are here: Manage Cafe \n"
								+ "Choose what you want to do:\n");
						System.out.println(cafeMenu);
						System.out.print("Your choice: ");
						optCafe = Integer.parseInt(br.readLine());

						switch (optCafe) {
						case 1:
							Cafe cafe = new Cafe();
							System.out
									.println("You are here: Manage Cafe - New Cafe:\n");

							System.out.print("Enter name: ");
							cafe.setCafeName(br.readLine());

							System.out.print("Enter address: ");
							cafe.setCafeAddress(br.readLine());

							System.out.print("Enter phone: ");
							cafe.setCafePhone(br.readLine());

							cafeBo.save(cafe);
							break;
						case 2:
							Integer optCafeUpdate;
							System.out
									.println("You are here: Manage Cafe - Update Cafe:\n");
							System.out.print("Enter name of Cafe: ");
							String optString = br.readLine();
							cafe2 = cafeBo.findByCafeName(optString);
							do {
								if (!cafe2.getCafeName().isEmpty()) {
									optString = cafe2.getCafeName();
								}
								System.out
										.println("Choose what you want to do with: "
												+ optString + "\n");
								System.out.println(cafeMenuUpdate);
								System.out.print("Your choice: ");
								optCafeUpdate = Integer.parseInt(br.readLine());

								switch (optCafeUpdate) {
								case 1:
									System.out.print("Enter new name: ");
									cafe2.setCafeName(br.readLine());
									cafeBo.update(cafe2);
									break;
								case 2:
									System.out.print("Enter new address: ");
									cafe2.setCafeAddress(br.readLine());
									cafeBo.update(cafe2);
									break;
								case 3:
									System.out.print("Enter new phone: ");
									cafe2.setCafePhone(br.readLine());
									cafeBo.update(cafe2);
									break;
								case 4:
									System.out.print("Enter new name: ");
									cafe2.setCafeName(br.readLine());

									System.out.print("Enter new address: ");
									cafe2.setCafeAddress(br.readLine());

									System.out.print("Enter new phone: ");
									cafe2.setCafePhone(br.readLine());
									cafeBo.update(cafe2);
									break;
								case 0:
									break;
								}
							} while (optCafeUpdate != 0);
							break;
						case 3:
							System.out
									.println("You are here: Manage Cafe - Get list of Cafes:\n");

							for (Cafe c : cafeBo.listAllCafes()) {
								System.out.println(c);
							}
							break;
						case 4:
							System.out
									.println("You are here: Manage Cafe - Delete Cafe:\n");
							System.out.print("Enter name of Cafe: ");
							cafe2 = cafeBo.findByCafeName(br.readLine());

							cafeBo.delete(cafe2);
							break;
						case 0:
							break;
						default:
							break;
						}
					} while (optCafe != 0);
				case 2:
					do {
						System.out.println("You are here: Manage Employee \n"
								+ "Choose what you want to do:\n");
						System.out.println(employeeMenu);
						System.out.print("Your choice: ");
						optEmployee = Integer.parseInt(br.readLine());

						switch (optEmployee) {
						case 1:
							Employee employee = new Employee();
							System.out
									.println("You are here: Manage Cafe - New Employee:\n");

							System.out.print("Enter first name: ");
							employee.setFirstName(br.readLine());

							System.out.print("Enter last name: ");
							employee.setLastName(br.readLine());

							System.out.print("Enter address: ");
							employee.setAddress(br.readLine());

							System.out.print("Enter phone: ");
							employee.setPhone(br.readLine());

							System.out.print("Enter sallary: ");
							employee.setSallary(Double.parseDouble(br
									.readLine()));

							System.out.println("Choose employee role:");
							System.out.print(employeeMenuRole);
							System.out.println("Your choice: ");
							switch (Integer.parseInt(br.readLine())) {
							case 1:
								employee.setRole(Translator.ROLE_MENAGER);
								break;
							case 2:
								employee.setRole(Translator.ROLE_WAITRESS);
								break;
							default:
								break;
							}
							System.out.println("Choose a Cafe:");
							for (Cafe c : cafeBo.listAllCafes()) {
								System.out.println(c);
							}
							System.out.print("Enter name of cafe:");
							cafe2 = cafeBo.findByCafeName(br.readLine());
							cafes.add(cafe2);
							
							cafe2.setNumOfEmployees(cafe2.getNumOfEmployees()+1);
							cafeBo.update(cafe2);

							employee.setCafes(cafes);
							employeeBo.save(employee);
							break;
						case 2:
							Integer optEmployeeUpdate;
							System.out
									.println("You are here: Manage Cafe - Update Employee:\n");
							System.out.print("Enter first name of Employee: ");
							firstName = br.readLine();
							System.out.print("Enter last name of Employee: ");
							lastName = br.readLine();
							employee2 = employeeBo.findByEmployeeFirstLastName(
									firstName, lastName);
							do {
								if (!employee2.getFirstName().isEmpty() && !employee2.getLastName().isEmpty()) {
									firstName = employee2.getFirstName();
									lastName = employee2.getLastName();
								}
								System.out
										.println("Choose what you want to do with: "
												+ firstName
												+ " "
												+ lastName
												+ "\n");
								System.out.println(employeeMenuUpdate);
								System.out.print("Your choice: ");
								optEmployeeUpdate = Integer.parseInt(br.readLine());

								switch (optEmployeeUpdate) {
								case 1:
									System.out.print("Enter new first name: ");
									employee2.setFirstName(br.readLine());
									employeeBo.update(employee2);
									break;
								case 2:
									System.out.print("Enter new last name: ");
									employee2.setLastName(br.readLine());
									employeeBo.update(employee2);
									break;	
								case 3:
									System.out.print("Enter new address: ");
									employee2.setAddress(br.readLine());
									employeeBo.update(employee2);
									break;
								case 4:
									System.out.print("Enter new phone: ");
									employee2.setPhone(br.readLine());
									employeeBo.update(employee2);
									break;
								case 5:
									System.out.print("Enter new sallary: ");
									employee2.setPhone(br.readLine());
									employeeBo.update(employee2);
									break;	
								case 6:
									System.out.println("Choose employee new role:");
									System.out.print(employeeMenuRole);
									System.out.println("Your choice: ");
									switch (Integer.parseInt(br.readLine())) {
									case 1:
										employee2.setRole(Translator.ROLE_MENAGER);
										break;
									case 2:
										employee2.setRole(Translator.ROLE_WAITRESS);
										break;
									default:
										break;
									}
									employeeBo.update(employee2);
									break;		
								case 7:
									System.out.println("Choose a Cafe:");
									for (Cafe c : cafeBo.listAllCafes()) {
										System.out.println(c);
									}
									System.out.print("Enter name of cafe:");
									cafe2 = cafeBo.findByCafeName(br.readLine());
									cafes.add(cafe2);
									
									cafe2.setNumOfEmployees(cafe2.getNumOfEmployees()+1);
									cafeBo.update(cafe2);
									cafes.addAll(employee2.getCafes());
									employee2.setCafes(cafes);
									employeeBo.update(employee2);
									break;
								case 8:
									System.out.print("Enter new first name: ");
									employee2.setFirstName(br.readLine());
									
									System.out.print("Enter new last name: ");
									employee2.setLastName(br.readLine());

									System.out.print("Enter new address: ");
									employee2.setAddress(br.readLine());

									System.out.print("Enter new phone: ");
									employee2.setPhone(br.readLine());
									
									System.out.print("Enter new sallary: ");
									employee2.setSallary(Double.parseDouble(br.readLine()));
									
									System.out.println("Choose employee new role:");
									System.out.print(employeeMenuRole);
									System.out.print("Your choice: ");
									switch (Integer.parseInt(br.readLine())) {
									case 1:
										employee2.setRole(Translator.ROLE_MENAGER);
										break;
									case 2:
										employee2.setRole(Translator.ROLE_WAITRESS);
										break;
									default:
										break;
									}
									
									System.out.println("Choose a Cafe:");
									for (Cafe c : cafeBo.listAllCafes()) {
										System.out.println(c);
									}
									System.out.print("Enter name of cafe:");
									cafe2 = cafeBo.findByCafeName(br.readLine());
									cafes.add(cafe2);
									
									cafe2.setNumOfEmployees(cafe2.getNumOfEmployees()+1);
									cafeBo.update(cafe2);
									cafes.addAll(employee2.getCafes());
									employee2.setCafes(cafes);
									
									employeeBo.update(employee2);
									break;
								case 0:
									break;
								}
							} while (optEmployeeUpdate != 0);
							break;
						case 3:
							System.out
									.println("You are here: Manage Cafe - Get list of Employees:\n");

							for (Employee c : employeeBo.listAllEmployees()) {
								System.out.println(c);
							}
							break;
						case 4:
							System.out
									.println("You are here: Manage Cafe - Delete Employee:\n");
							System.out.print("Enter first name of Employee: ");
							firstName = br.readLine();
							System.out.print("Enter last name of Employee: ");
							lastName = br.readLine();
							employee2 = employeeBo.findByEmployeeFirstLastName(firstName, lastName);
							
							employeeBo.delete(employee2);
							break;
						case 0:
							break;
						default:
							break;
						}
					} while (optEmployee != 0);
				case 0:
					System.out.println("Exiting...");
					break;
				default:
					break;
				}
			} while (optMain != 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}