package com.tka.dao;

import java.util.List;
import com.tka.entity.Player;
import org.hibernate.Session;
import com.tka.utility.HibernateUtil;

public class IPLDao implements DaoInterfaces{

	@Override
	public Player getOnePlayer(int pk) {
		// TODO Auto-generated method stub
		return null;
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
