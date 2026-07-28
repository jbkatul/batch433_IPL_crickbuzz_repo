package com.tka.dao;

import java.util.List;

import com.tka.entity.Player;

public interface DaoInterfaces {
	
	public abstract Player getOnePlayer(int pk);
	public abstract List<Player> getallPlayer();
	public abstract Player InsertOnePlayer(Player obj);
	public abstract Player UpdateOnePlayer(Player obj);
	public abstract Boolean DeleteOnePlayer(int pk);

}
