package JFSDS25.JFSDS25_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInsert {

	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t= s.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEid(31051);
		emp.setEname("v");
		emp.setEsal(999998);;
		
		s.save(emp);
		t.commit();
		System.out.println("Inserted completed");
		s.close();
		sf.close();
	}

}
