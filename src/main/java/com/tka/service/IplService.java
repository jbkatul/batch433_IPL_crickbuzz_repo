package com.tka.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tka.HBUtility.HBUtility;
import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IplService implements ServiceInterface {

	IPLDao dao=new IPLDao();
	private List<Player> allPlayers=null;
	private List<Player> allPlayersByTeam=null;
	private List<Player> allBatsmans=null;
	private List<Player> allBowlers=null;
	private List<Player> allRounders=null;
	private Player p=null;
	private Session session=null;
	private Criteria criteria=null;
	HBUtility hbutility=new HBUtility();
	
	@Override
	public Player getOnePlayer(int pk) {
		p=dao.getOnePlayer(pk);
		return p;
	}

	@Override
	public List<Player> getallPlayer() {
		allPlayers=dao.getallPlayer();
		return allPlayers;
	}

	@Override
	public List<Player> getallPlayer(String team) {
		allPlayers=dao.getallPlayer();
		for(Player p:allPlayers)
		{
			if(p.getTname()==team)
				allPlayersByTeam.add(p);
		}
		return allPlayersByTeam;
	}

	@Override
	public List<Player> getallBatsman(String team) {
		allPlayers=dao.getallPlayer();
		for(Player p:allPlayers)
		{
			if((p.getTname()==team) && (p.getSpecialisation()=="Batsman"))
				allBatsmans.add(p);
		}
		return allBatsmans;
	}

	@Override
	public List<Player> getallBowlers(String team) {
		allPlayers=dao.getallPlayer();
		for(Player p:allPlayers)
		{
			if((p.getTname()==team) && (p.getSpecialisation()=="Bowler"))
				allBowlers.add(p);
		}
		return allBowlers;
	}

	@Override
	public List<Player> getallAllrounders(String team) {
		allPlayers=dao.getallPlayer();
		for(Player p:allPlayers)
		{
			if((p.getTname()==team) && (p.getSpecialisation()=="Allrounder"))
				allRounders.add(p);
		}
		return allRounders;
	}

	@Override
	public List<Player> getplayers_name_starts_with(String name) {
		//allPlayers=dao.getallPlayer();
		session=hbutility.getSession();
		criteria=session.createCriteria(Player.class);
		criteria.add(Restrictions.ilike("V%", "playerName"));
		allPlayers=criteria.list();
		return allPlayers;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		p=dao.InsertOnePlayer(obj);
		return p;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		p=dao.UpdateOnePlayer(obj);
		return p;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		boolean akw=dao.DeleteOnePlayer(pk);
		return akw;
	}
	

}
