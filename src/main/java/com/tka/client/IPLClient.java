package com.tka.client;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLClient {

	public static void main(String[] args) {

		IPLService service = new IPLService();
		
		System.out.println(service.getOnePlayer(1));
		
		service.getallPlayer().forEach(n->System.out.println(n));
		
		System.out.println("\nSearch Player By Name ");

		List<Player> players = service.searchPlayerByName("Dho");

		if(players.isEmpty()) {
		    System.out.println("No Player Found");
		} else {
		    for(Player p : players) {
		        System.out.println(p);
		    }
		}
	
	}

}