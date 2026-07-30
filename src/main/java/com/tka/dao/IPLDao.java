package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces {

	private Configuration cfg = null;
	private SessionFactory sf = null;
	private Session s = null;
	private Player player = null;
	private List<Player> allplayer = null;
	private Transaction tnx = null;

	@Override
	public Player getOnePlayer(int pk) {
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Player.class);
		sf = cfg.buildSessionFactory();
		s = sf.openSession();

		player = new Player();
		Player player = s.get(Player.class, pk);
		s.close();
		return player;
	}

	@Override
	public List<Player> getallPlayer() {
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Player.class);
		sf = cfg.buildSessionFactory();
		s = sf.openSession();

		allplayer = new ArrayList<>();

		Criteria c = s.createCriteria(Player.class);
		allplayer = c.list();
		s.close();
		return allplayer;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Player.class);
		sf = cfg.buildSessionFactory();
		s = sf.openSession();
		tnx = s.beginTransaction();

		s.save(obj);
		tnx.commit();
		s.close();

		return obj;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {

		return null;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {

		return null;
	}

}
