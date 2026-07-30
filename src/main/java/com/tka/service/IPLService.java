package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService implements ServiceInterface {
	
	private IPLDao dao;
	
	public IPLService() {
		dao = new IPLDao();
	}
	
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
		return dao.getallPlayer().stream().filter(p -> p.getTname().equalsIgnoreCase(team)).toList();
	}

	@Override
	public List<Player> getallBatsman(String team) {
		return dao.getallPlayer().stream().filter(p -> p.getTname().equalsIgnoreCase(team)&&p.getSpecialisation().equalsIgnoreCase("Batsmen")).toList();
	}

	@Override
	public List<Player> getallBowlers(String team) {
		return dao.getallPlayer().stream().filter(p -> p.getTname().equalsIgnoreCase(team)&&p.getSpecialisation().equalsIgnoreCase("Bowler")).toList();
	}

	@Override
	public List<Player> getallAllrounders(String team) {
		return dao.getallPlayer().stream().filter(p -> p.getTname().equalsIgnoreCase(team)&&p.getSpecialisation().equalsIgnoreCase("AllRounder")).toList();
	}

	@Override
	public List<Player> getplayers_name_starts_with(String name) {
		return dao.getallPlayer().stream().filter(p -> p.getP_name().startsWith(name)).toList();
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
	
}
