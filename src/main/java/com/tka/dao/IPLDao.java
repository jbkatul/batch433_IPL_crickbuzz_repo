package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tka.HBUtility.HBUtility;
import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces{
	
    HBUtility hbutility=new HBUtility();
	private Session session=null;
	private Player p=null;
    private Criteria criteria=null;
	
	List<Player> allPlayers=null;
	
	@Override
	public Player getOnePlayer(int pk) {
		session=hbutility.getSession();
	    p=session.get(Player.class,1);
		return p;
	}

	@Override
	public List<Player> getallPlayer() {
		session=hbutility.getSession();
		criteria=session.createCriteria(Player.class);
		allPlayers=criteria.list();
		return allPlayers;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		session=hbutility.getSession();
		session.save(obj);
		return null;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		session=hbutility.getSession();
		session.update(obj);
		return null;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		session=hbutility.getSession();
		session.delete(pk);
		return null;
	}

}
