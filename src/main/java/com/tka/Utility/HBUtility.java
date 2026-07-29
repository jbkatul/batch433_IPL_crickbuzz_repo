package com.tka.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtility 
{

	
		private static SessionFactory sessionFactory;

		static 
		{
		    Configuration cfg = new Configuration();
		    cfg.configure("hibernate.cfg.xml");
		    sessionFactory = cfg.buildSessionFactory();
		}

		public static Session getSession() 
		{
		    return sessionFactory.openSession();
		}
}


