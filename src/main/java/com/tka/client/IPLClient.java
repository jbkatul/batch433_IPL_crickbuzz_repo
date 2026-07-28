package com.tka.client;


import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLClient {

	public static void main(String[] args) {

		IPLDao dao = new IPLDao();

	    Player player = dao.getOnePlayer(1);

	    System.out.println(player);
	
	}

}
