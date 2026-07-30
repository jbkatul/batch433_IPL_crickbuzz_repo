package com.tka.service;

import java.util.List;

import com.tka.entity.Player;

public interface ServiceInterface {
	
	public abstract Player getOnePlayer(int pk);
	public abstract List<Player> getallPlayer();
	
	public abstract List<Player> getallPlayer(String team);
	
	public abstract List<Player> getallBatsman(String team);
	public abstract List<Player> getallBowlers(String team);
	public abstract List<Player> getallAllrounders(String team);
	public abstract List<Player> getplayers_name_starts_with(String name);
	public abstract Player InsertOnePlayer(Player obj);
	public abstract Player UpdateOnePlayer(Player obj);
	public abstract Boolean DeleteOnePlayer(int pk);
	public abstract List<Player> searchPlayerByName(String name);

}
