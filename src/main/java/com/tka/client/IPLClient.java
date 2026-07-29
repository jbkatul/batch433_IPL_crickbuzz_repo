package com.tka.client;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLClient {

	public static void main(String[] args) {

		IPLDao dao = new IPLDao();

		List<Player> players = dao.getallPlayer();

		System.out.println("------ ALL PLAYERS ------");

		for (Player p : players) {
			System.out.println(p);
		}
	
	}

}
