package pl.edu.pjwstk.mpr.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.classic.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.edu.pjwstk.mpr.cafe.Translator;
import pl.edu.pjwstk.mpr.cafe.bo.CafeBo;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;
import pl.edu.pjwstk.mpr.person.Employee;
import pl.edu.pjwstk.mpr.person.Menager;

public class App {
	public static void main(String[] args) {
//		String mainMenu = "1 - Manage Cafe\n" + "2 - Manage Employee\n"
//				+ "0 - Exit CafeMenager";
//		String cafeMenu = "1 - New Cafe\n" + "2 - Update Cafe\n"
//				+ "3 - Get list of Cafes\n" + "4 - Delete Cafe\n"
//				+ "0 - Back to main menu";
//		String employeeMenu = "1 - New Employee\n" + "2 - Update Employee\n"
//				+ "3 - Get list of Employees\n" + "4 - Delete Employee\n"
//				+ "0 - Back to main menu";
//
//		System.out.println("Welcome to CafeMenager!\n" +
//				"Please type what you want to do:\n");
//		System.out.println(mainMenu);
//
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//
//		Session session = HibernateUtil.getSessionFactory().openSession();
//
//		try {
//			String optString = br.readLine();
//			Integer optMain = Integer.parseInt(optString);
//
//			while (0 != optMain) {
//				switch (optMain) {
//				case 1:
//					System.out.println("You are here: Manage Cafe \n" +
//							"Choose what you want to do:\n");
//					System.out.println(cafeMenu);
//					optString = br.readLine();
//					Integer optCafe = Integer.parseInt(optString);
//					while (0 != optCafe) {
//						switch (optCafe) {
//						case 1:
//							session.beginTransaction();
//							Cafe cafe = new Cafe();
//
//							System.out
//									.println("You are here: Manage Cafe - New Cafe:\n\n");
//							System.out.print("Enter name: ");
//							String cafeName = br.readLine();
//							cafe.setCafeName(cafeName);
//
//							System.out.print("Enter address: ");
//							String cafeAddress = br.readLine();
//							cafe.setCafeAddress(cafeAddress);
//
//							System.out.print("Enter phone: ");
//							String cafePhone = br.readLine();
//							cafe.setCafePhone(cafePhone);
//
//							session.save(cafe);
//							session.getTransaction().commit();
//							optCafe = 0;
//							break;
//						default:
//							break;
//						}
//					}
//				case 0:
//					System.out.println("Exiting...");
//					optMain = 0;
//					break;
//				default:
//					break;
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// session.beginTransaction();
//		// Employee employee = new Employee();
//		//
//		// employee.setAddress("Morska 108A/1");
//		// employee.setFirstName("Tadeusz");
//		// employee.setLastName("Tadz");
//		// employee.setPhone("889332031");
//		// employee.setSallary(new Double(1500));
//		// employee.setRole(Translator.ROLE_MENAGER);
//		//
//		// session.save(employee);
//		// session.getTransaction().commit();
		
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		 
		    	CafeBo cafeBo = (CafeBo)appContext.getBean("cafeBo");
		 
		    	/** insert **/
		    	Cafe cafe = new Cafe();
		    	cafe.setCafeName("Delicje");
		    	cafe.setCafeAddress("10 Lutego 12 Gdynia");
		    	cafe.setCafePhone("700500400");
		    	cafeBo.save(cafe);
		 
		    	/** select **/
		    	Cafe cafe2 = cafeBo.findByCafeName("Delicje");
		    	System.out.println(cafe2);
		 
		    	/** update **/
		    	cafe2.setCafeName("Delicje 2");
		    	cafeBo.update(cafe2);
		 
		    	/** delete **/
		    	cafeBo.delete(cafe2);
		 
		    	System.out.println("Done");
		
	}
}