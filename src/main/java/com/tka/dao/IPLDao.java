package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tka.entity.Player;
import com.tka.utility.Utility;

public class IPLDao implements DaoInterfaces{

	
	
	@Override
	public Player getOnePlayer(int pk) {
		return Utility.getSession().load(Player.class, pk);
	}

	@Override
	public List<Player> getallPlayer() {
		@SuppressWarnings("deprecation")
		Criteria criteria = Utility.getSession().createCriteria(Player.class);
		List<Player> list = criteria.list();
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

	
	
	@Override
	public List<Player> searchPlayerByName(String name) {

	    String hql = "FROM Player WHERE lower(p_name) LIKE :name";

	    Query<Player> query = Utility.getSession().createQuery(hql, Player.class);

	    query.setParameter("name", "%" + name.toLowerCase() + "%");

	    return query.list();
	}

}
