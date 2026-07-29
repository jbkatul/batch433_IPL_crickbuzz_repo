package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces {

	private Configuration cfg = null;
	private SessionFactory factory = null;
	private Session session = null;
	private Transaction tx = null;

	public IPLDao() {

		cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Player.class);

		factory = cfg.buildSessionFactory();
	}

	@Override
	public Player getOnePlayer(int pk) {

		session = factory.openSession();

		Player player = session.get(Player.class, pk);

		session.close();

		return player;
	}

	@Override
	public List<Player> getallPlayer() {

		session = factory.openSession();

		Query<Player> query = session.createQuery("from Player", Player.class);

		List<Player> list = query.getResultList();

		session.close();

		return list;
	}

	@Override
	public List<Player> getallPlayer(String team) {

		session = factory.openSession();

		Query<Player> query = session.createQuery(
				"from Player where tname=:team", Player.class);

		query.setParameter("team", team);

		List<Player> list = query.getResultList();

		session.close();

		return list;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {

		session = factory.openSession();

		tx = session.beginTransaction();

		session.save(obj);

		tx.commit();

		session.close();

		return obj;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {

		session = factory.openSession();

		tx = session.beginTransaction();

		session.update(obj);

		tx.commit();

		session.close();

		return obj;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {

		session = factory.openSession();

		tx = session.beginTransaction();

		Player player = session.get(Player.class, pk);

		if (player != null) {

			session.delete(player);

			tx.commit();

			session.close();

			return true;
		}

		session.close();

		return false;
	}

}