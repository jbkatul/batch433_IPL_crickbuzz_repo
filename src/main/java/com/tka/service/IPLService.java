package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService implements ServiceInterface {

	IPLDao dao = new IPLDao();

	@Override
	public Player getOnePlayer(int pk) {
		return dao.getOnePlayer(pk);
	}

	@Override
	public List<Player> getallPlayer() {
		return dao.getallPlayer();
	}

	@Override
	public List<Player> getallPlayer(String team) {
		return dao.getallPlayer(team);
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		return dao.InsertOnePlayer(obj);
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		return dao.UpdateOnePlayer(obj);
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		return dao.DeleteOnePlayer(pk);
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

}