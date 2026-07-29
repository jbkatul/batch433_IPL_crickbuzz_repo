package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService implements ServiceInterface{

	IPLDao dao = new IPLDao();
	
	@Override
	public Player getOnePlayer(int pk) {
		Player pl = dao.getOnePlayer(pk);
		return pl;
	}

	@Override
	public List<Player> getallPlayer() {
		List<Player> allPlayer = dao.getallPlayer();
		return allPlayer;
	}

	@Override
	public List<Player> getallPlayer(String team) {
		List<Player> getallPlayer = dao.getallPlayer();
		List<Player> player = new ArrayList();
		
		
		for(Player pl : getallPlayer)
		{
			if(pl.getTname().equalsIgnoreCase(team))
			{
				player.add(pl);
			}
		}
		
		return player;
	}

	@Override
	public List<Player> getallBatsman(String specialize) {
		List<Player> getallPlayer = dao.getallPlayer();
		List<Player> player = new ArrayList();
		
		
		for(Player pl : getallPlayer)
		{
			if(pl.getSpecialisation().equalsIgnoreCase(specialize))
			{
				player.add(pl);
			}
		}
		
		return player;
	}

	@Override
	public List<Player> getallBowlers(String specialize) {
		List<Player> getallPlayer = dao.getallPlayer();
		List<Player> player = new ArrayList();
		
		
		for(Player pl : getallPlayer)
		{
			if(pl.getSpecialisation().equalsIgnoreCase(specialize))
			{
				player.add(pl);
			}
		}
		
		return player;
	}

	@Override
	public List<Player> getallAllrounders(String specialize) {
		List<Player> getallPlayer = dao.getallPlayer();
		List<Player> player = new ArrayList();
		
		
		for(Player pl : getallPlayer)
		{
			if(pl.getSpecialisation().equalsIgnoreCase(specialize))
			{
				player.add(pl);
			}
		}
		
		return player;
	}

	@Override
	public List<Player> getplayers_name_starts_with(String name) {
		List<Player> getallPlayer = dao.getallPlayer();
		List<Player> player = new ArrayList();
		
		
		for(Player pl : getallPlayer)
		{
			if(pl.getP_name().toLowerCase().startsWith(name.toLowerCase()))
			{
				player.add(pl);
			}
		}
		
		return player;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		Player insertOnePlayer = dao.InsertOnePlayer(obj);
		return insertOnePlayer;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		Player UpdatePlayer = dao.UpdateOnePlayer(obj);
		return UpdatePlayer;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		
		return dao.DeleteOnePlayer(pk);
	}
	

}
