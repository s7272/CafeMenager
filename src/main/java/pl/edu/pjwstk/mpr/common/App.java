package pl.edu.pjwstk.mpr.common;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.classic.Session;

import pl.edu.pjwstk.mpr.cafe.Cafe;
import pl.edu.pjwstk.mpr.cafe.Translator;
import pl.edu.pjwstk.mpr.person.Employee;
import pl.edu.pjwstk.mpr.person.Menager;
import pl.edu.pjwstk.mpr.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {	
//    	InputStreamReader isr = new InputStreamReader(System.in);
//    	BufferedReader br = new BufferedReader(isr);
//    	try {
//			String what = br.readLine();
//			System.out.println( what );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		Cafe cafe = new Cafe();
 
		cafe.setCafeName("Delicje");
		cafe.setCafePhone("700980900");
		cafe.setCafeAddress("10 lutego 4");
//		cafe.setNumOfEmployees(3);
//		cafe.setNumOfTables(2);
		
		session.save(cafe);
		session.getTransaction().commit();
		
		session.beginTransaction();
		Employee employee = new Employee();
		
		employee.setAddress("Morska 108A/1");
		employee.setFirstName("Tadeusz");
		employee.setLastName("Tadz");
		employee.setPhone("889332031");
		employee.setSallary(new Double(1500));
		employee.setRole(Translator.ROLE_MENAGER);
		
		session.save(employee);
		session.getTransaction().commit();
    }
}
