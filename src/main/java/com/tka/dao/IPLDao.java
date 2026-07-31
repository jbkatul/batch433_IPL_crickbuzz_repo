package com.tka.dao;

import java.util.List;
import com.tka.entity.Player;
import org.hibernate.Session;
import com.tka.utility.HibernateUtil;
import org.hibernate.Transaction;


public class IPLDao implements DaoInterfaces{

	@Override
	public Player getOnePlayer(int pk) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		Player player = session.get(Player.class, pk);

		session.close();

		return player;
	}

	@Override
	public List<Player> getallPlayer() {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		List<Player> list = session
				.createQuery("from Player", Player.class)
				.list();

		session.close();

		return list;
	}

	public List<Player> getallPlayer(String team) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		List<Player> list = session
				.createQuery(
						"from Player where tname = :team",
						Player.class)
				.setParameter("team", team)
				.list();

		session.close();

		return list;
	}

	public List<Player> getallBatsman(String team) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		List<Player> list = session
				.createQuery(
						"from Player where tname = :team and specialisation = 'Batsman'",
						Player.class)
				.setParameter("team", team)
				.list();

		session.close();

		return list;
	}

	public List<Player> getallBowlers(String team) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		List<Player> list = session
				.createQuery(
						"from Player where tname = :team and specialisation = 'Bowler'",
						Player.class)
				.setParameter("team", team)
				.list();

		session.close();

		return list;
	}

	public List<Player> getallAllrounders(String team) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		List<Player> list = session
				.createQuery(
						"from Player where tname = :team and specialisation = 'Allrounder'",
						Player.class)
				.setParameter("team", team)
				.list();

		session.close();

		return list;
	}

	public List<Player> getplayers_name_starts_with(String name) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		List<Player> list = session
				.createQuery(
						"from Player where p_name like :name",
						Player.class)
				.setParameter("name", name + "%")
				.list();

		session.close();

		return list;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		Transaction tx = session.beginTransaction();

		session.save(obj);

		tx.commit();
		session.close();

		return obj;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		Transaction tx = session.beginTransaction();

		session.update(obj);

		tx.commit();
		session.close();

		return obj;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {

		Session session = HibernateUtil
				.getSessionFactory()
				.openSession();

		Transaction tx = session.beginTransaction();

		Player p = session.get(Player.class, pk);

		if (p != null) {
			session.delete(p);
			tx.commit();
			session.close();
			return true;
		}

		tx.rollback();
		session.close();
		return false;
	}

}
