package JFSDS25.JFSDS25_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDelete {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		Employee emp = s.get(Employee.class, 30837);
		s.delete(emp);
		t.commit();
		System.out.println("Successfully deleted");
		s.close();
		sf.close();
		

	}

}
