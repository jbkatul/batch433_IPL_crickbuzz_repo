package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService implements ServiceInterface {

	private IPLDao ipldao = null;
	private List<Player> allplayer = null;

	@Override
	public Player getOnePlayer(int pk) {
		allplayer = getallPlayer();
		for (Player p : allplayer) {
			if (p.getP_id() == pk) {
				ipldao = new IPLDao();
				Player player = ipldao.getOnePlayer(pk);
				return player;
			}
		}

		return null;
	}

	@Override
	public List<Player> getallPlayer() {
		ipldao = new IPLDao();
		allplayer = ipldao.getallPlayer();
		return allplayer;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		if(obj == null || obj.getP_id() <= 0 || obj.getJn() <= 0) {
			return null;
		}
		allplayer = getallPlayer();

		for (Player p : allplayer) {
			if (p.getP_id() == obj.getP_id()) {
				return null;
			}
		}

		ipldao = new IPLDao();
		Player p1 = ipldao.InsertOnePlayer(obj);

		return p1;
	}

	@Override
	public List<Player> getallPlayer(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getallBatsman(String team) {
		
		return null;
	}

	@Override
	public List<Player> getallBowlers(String team) {
		
		return null;
	}

	@Override
	public List<Player> getallAllrounders(String team) {
	
		return null;
	}

	@Override
	public List<Player> getplayers_name_starts_with(String name) {
	
		return null;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		
		return null;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		
		return null;
	}

}
