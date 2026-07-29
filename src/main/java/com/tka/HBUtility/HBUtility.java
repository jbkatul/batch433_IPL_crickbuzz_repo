package com.tka.HBUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Player;

public class HBUtility {
		
	private Configuration cfg=null;
	private SessionFactory factory=null;
	private Session session=null;

	public Session getSession()
	{
		cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Player.class);
        
        factory=cfg.buildSessionFactory();
        
        session=factory.openSession();
		
        return session;
		
	}
}
