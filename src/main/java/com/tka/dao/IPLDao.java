package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tka.entity.Player;
import com.tka.utility.Utility;

public class IPLDao implements DaoInterfaces{

	@Override
	public Player getOnePlayer(int pk) {
		Session session = Utility.getSession();
		Player pl=session.get(Player.class, pk);
		
		return pl;
	}

	@Override
	public List<Player> getallPlayer() {
		Session session = Utility.getSession();
		Criteria criteria = session.createCriteria(Player.class);
		List<Player> allPlayer = criteria.list();
		return allPlayer;
		
	}

	@Override
	public Player InsertOnePlayer(Player player) {

	    Session session = Utility.getSession();
	    Transaction trx = session.beginTransaction();

	    try {
	        session.save(player);
	        trx.commit();
	    } catch (Exception e) {
	        trx.rollback();
	        e.printStackTrace();
	    }

	    session.close();
	    return player;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		Session session = Utility.getSession();
		Transaction trx=session.beginTransaction();
		 try {
			 	session.saveOrUpdate(obj);   
	            trx.commit();
	            session.close();
	        } catch (Exception e) 
		 		{

	            trx.rollback();
	            session.close();
	            e.printStackTrace();
	        }
		return obj;
	}

	@Override
	public Boolean DeleteOnePlayer(int id) {

	    Session session = Utility.getSession();
	    Transaction trx = session.beginTransaction();

	    try {

	        Player player = session.get(Player.class, id);

	        if (player != null) {
	            session.delete(player);
	            trx.commit();
	            session.close();
	            return true;
	        }

	    } catch (Exception e) {

	        trx.rollback();
	        e.printStackTrace();

	    }

	    session.close();
	    return false;
	}
}