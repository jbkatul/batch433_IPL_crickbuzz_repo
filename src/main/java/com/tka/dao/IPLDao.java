package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces{

	@Override
	public Player getOnePlayer(int pk) {
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");

	    SessionFactory sessionFactory = cfg.buildSessionFactory();

	    Session session = sessionFactory.openSession();

	    Player player = session.get(Player.class, pk);

	    session.close();
	    sessionFactory.close();

	    return player;
		
	}

	@Override
	public List<Player> getallPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
