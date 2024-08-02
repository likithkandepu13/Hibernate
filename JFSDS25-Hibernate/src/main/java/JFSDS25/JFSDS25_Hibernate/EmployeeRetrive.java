package JFSDS25.JFSDS25_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeRetrive {

	public static void main(String[] args)
	{
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml"); 

    
    SessionFactory sf = cfg.buildSessionFactory(); 
    Session s = sf.openSession();
    Transaction t = s.beginTransaction();
        Employee emp = s.get(Employee.class, 30837);
            System.out.print(emp.getEname());
            t.commit(); 
            s.close();
            sf.close();

	}

}
