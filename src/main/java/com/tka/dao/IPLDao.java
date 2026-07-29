package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tka.Utility.HBUtility;
import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces{

	@Override
	public Player getOnePlayer(int pk) {
		Session session = HBUtility.getSession();
		Player pl=session.get(Player.class, pk);
		
		return pl;
	}

	@Override
	public List<Player> getallPlayer() {
		Session session = HBUtility.getSession();
		Criteria criteria = session.createCriteria(Player.class);
		List<Player> allPlayer = criteria.list();
		return allPlayer;
		
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		Session session = HBUtility.getSession();
		Transaction trx=session.beginTransaction();
		 try {
			 	session.save(obj);   
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
	public Player UpdateOnePlayer(Player obj) {
		Session session = HBUtility.getSession();
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
	public Boolean DeleteOnePlayer(int pk) {
		Session session = HBUtility.getSession();
		Transaction trx=session.beginTransaction();
		Player player = session.get(Player.class, pk);
		 try {
			 	session.remove(player);   
	            trx.commit();
	            session.close();
	            return true;
	            
	        } catch (Exception e) 
		 		{

	            trx.rollback();
	            session.close();
	            e.printStackTrace();
	            return false;
	        }
		
	}
	}


