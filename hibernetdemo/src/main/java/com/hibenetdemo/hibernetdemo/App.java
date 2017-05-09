package com.hibenetdemo.hibernetdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
    	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf=configuration.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	User user=new User();
    	user.setId(10);
    	user.setName("swastin");
    	user.setEmail("Swastin95.sahoo");
    	
    	user.setPassword("123456789");
    	session.save(user);
    	 tx.commit();  
        session.close();
    	
    	
    }
}
