package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService implements ServiceInterface {
	private IPLDao dao;
	
	@Override
	public Player getOnePlayer(int pk) {
		dao = new IPLDao();
		return dao.getOnePlayer(pk);
	}

	@Override
	public List<Player> getallPlayer() {
		dao = new IPLDao();
		return dao.getallPlayer();
	}

	@Override
	public List<Player> getallPlayer(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getallBatsman(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getallBowlers(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getallAllrounders(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getplayers_name_starts_with(String name) {
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
	
	
	@Override
	public List<Player> searchPlayerByName(String name) {
	    dao = new IPLDao();
	    return dao.searchPlayerByName(name);
	}

}
