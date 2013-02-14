package pl.edu.pjwstk.mpr.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.edu.pjwstk.mpr.cafe.bo.CafeBo;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		String mainMenu = "1 - Manage Cafe\n" + "2 - Manage Employee\n"
				+ "0 - Exit CafeMenager";
		String cafeMenu = "1 - New Cafe\n" + "2 - Update Cafe\n"
				+ "3 - Get list of Cafes\n" + "4 - Delete Cafe\n"
				+ "0 - Back to main menu";
		String cafeMenuUpdate = "1 - update name of cafe\n" +
				"2 - update address\n" +
				"3 - update phone\n" +
				"4 - update all data\n" +
				"0 - back to cafe menu and";
		String employeeMenu = "1 - New Employee\n" + "2 - Update Employee\n"
				+ "3 - Get list of Employees\n" + "4 - Delete Employee\n"
				+ "0 - Back to main menu";

		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			
			Integer optMain;
			do {
				System.out.println("Welcome to CafeMenager!\n" +
						"Please type what you want to do:\n");
				System.out.println(mainMenu);
				System.out.print("Your choice: ");
				String optString = br.readLine();
				optMain = Integer.parseInt(optString);
				
				switch (optMain) {
				case 1:
					CafeBo cafeBo = (CafeBo)appContext.getBean("cafeBo");
					Cafe cafe2;
					String cafeName;
					String cafeAddress;
					String cafePhone;
					Integer optCafe;
					
					do {
						System.out.println("You are here: Manage Cafe \n" +
								"Choose what you want to do:\n");
						System.out.println(cafeMenu);
						System.out.print("Your choice: ");
						optString = br.readLine();
						optCafe = Integer.parseInt(optString);

						switch (optCafe) {
						case 1:
					    	Cafe cafe = new Cafe();
							System.out.println("You are here: Manage Cafe - New Cafe:\n");
							
							System.out.print("Enter name: ");
							cafeName = br.readLine();
							cafe.setCafeName(cafeName);

							System.out.print("Enter address: ");
							cafeAddress = br.readLine();
							cafe.setCafeAddress(cafeAddress);

							System.out.print("Enter phone: ");
							cafePhone = br.readLine();
							cafe.setCafePhone(cafePhone);

							cafeBo.save(cafe);
							break;
						case 2:
							Integer optCafeUpdate;
							System.out.println("You are here: Manage Cafe - Update Cafe:\n");
							System.out.print("Enter name of Cafe: ");
							optString = br.readLine();
							cafe2 = cafeBo.findByCafeName(optString);
							do {
								if (!cafe2.getCafeName().isEmpty()) {
									optString = cafe2.getCafeName();
								}
								System.out.println("Choose what you want to do with: "+optString+"\n");
								System.out.println(cafeMenuUpdate);
								System.out.print("Your choice: ");
								optCafeUpdate = Integer.parseInt(br.readLine());
								
								switch(optCafeUpdate) {
								case 1:
									System.out.print("Enter new name: ");
									cafeName = br.readLine();
									cafe2.setCafeName(cafeName);
									cafeBo.update(cafe2);
									break;
								case 2:
									System.out.print("Enter new address: ");
									cafeAddress = br.readLine();
									cafe2.setCafeAddress(cafeAddress);
									cafeBo.update(cafe2);
									break;
								case 3:
									System.out.print("Enter new phone: ");
									cafePhone = br.readLine();
									cafe2.setCafePhone(cafePhone);
									cafeBo.update(cafe2);
									break;
								case 4:
									System.out.print("Enter new name: ");
									cafeName = br.readLine();
									cafe2.setCafeName(cafeName);

									System.out.print("Enter new address: ");
									cafeAddress = br.readLine();
									cafe2.setCafeAddress(cafeAddress);

									System.out.print("Enter new phone: ");
									cafePhone = br.readLine();
									cafe2.setCafePhone(cafePhone);
									cafeBo.update(cafe2);
									break;
								case 0:
									break;
								}
							} while (optCafeUpdate != 0);
							break;
						case 3:
							System.out.println("You are here: Manage Cafe - Get list of Cafes:\n");
							
					    	for(Cafe c : cafeBo.listAllCafes()) {
					    		System.out.println(c);
					    	}
							break;	
						case 4:
							System.out.println("You are here: Manage Cafe - Delete Cafe:\n");
							System.out.print("Enter name of Cafe: ");
							cafeName = br.readLine();
					    	cafe2 = cafeBo.findByCafeName(cafeName);
					    	
					    	cafeBo.delete(cafe2);
							break;
						case 0:
							break;
						default:
							break;
						}
					} while (optCafe != 0);
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