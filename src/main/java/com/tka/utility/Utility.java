package com.tka.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Player;

public class Utility {
	public static Session getSession() {
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Player.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory.openSession();
	}
	
}
