package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces{
	
	private SessionFactory sf ;
	
	public IPLDao() {
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
	}
	@Override
	public Player getOnePlayer(int pk) {
		
		Session os = sf.openSession();
		Player obj = os.get(Player.class, pk);
		os.close();
		return obj;
	}

	@Override
	public List<Player> getallPlayer() {
		
		Session os = sf.openSession();
		Criteria c = os.createCriteria(Player.class);
		List<Player> allplayer = c.list();
		return allplayer;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    session.save(obj);
	    tx.commit();
	    session.close();
	    return obj;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.update(obj);
        tx.commit();
        session.close();
        return obj;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		 Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
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
