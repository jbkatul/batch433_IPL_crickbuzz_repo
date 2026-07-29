package com.tka.client;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLClient {

	public static void main(String[] args) {
		
		IPLDao dao = new IPLDao();

		List<Player> players = new ArrayList<>();

		players.add(new Player(0, 18, "Virat Kohli", 8500, 4, "RCB", "Batsman"));
		players.add(new Player(0, 97, "Rajat Patidar", 1800, 0, "RCB", "Batsman"));
		players.add(new Player(0, 45, "Rohit Sharma", 7000, 15, "MI", "Batsman"));
		players.add(new Player(0, 93, "Jasprit Bumrah", 120, 180, "MI", "Bowler"));
		players.add(new Player(0, 7, "MS Dhoni", 5200, 0, "CSK", "Batsman"));
		players.add(new Player(0, 8, "Ravindra Jadeja", 3000, 160, "CSK", "Allrounder"));
		players.add(new Player(0, 63, "Shubman Gill", 3500, 0, "GT", "Batsman"));
		players.add(new Player(0, 99, "Mohammed Siraj", 150, 110, "GT", "Bowler"));
		players.add(new Player(0, 17, "Yashasvi Jaiswal", 1800, 0, "RR", "Batsman"));
		players.add(new Player(0, 22, "Yuzvendra Chahal", 80, 210, "RR", "Bowler"));

		for (Player p : players) {
			dao.InsertOnePlayer(p);
		}


//		Player p = new Player();
//
//		p.setJn(18);
//		p.setP_name("Virat Kohli");
//		p.setRuns(8500);
//		p.setWickets(4);
//		p.setTname("RCB");
//		p.setSpecialisation("Batsman");
//
//		IPLDao dao = new IPLDao();
//
//		dao.InsertOnePlayer(p);
//
//		System.out.println("Player Inserted Successfully...");
		
		
//		IPLDao dao = new IPLDao();
//
//        Player p = dao.getOnePlayer(1);
//
//        System.out.println(p);
        
        
//        IPLDao dao = new IPLDao();
//
//        List<Player> players = dao.getallPlayer();
//
//        for (Player p : players) {
//            System.out.println(p);
//	}
		
		
//		IPLDao dao = new IPLDao();
//
//        Player player = dao.getOnePlayer(1);
//
//        if(player != null) {
//
//            player.setRuns(9000);
//            player.setWickets(5);
//
//            dao.UpdateOnePlayer(player);
//
//            System.out.println("Player Updated Successfully...");
//        }
//        else {
//
//            System.out.println("Player Not Found...");
//        }
		
		
		
		
		
//		IPLDao dao = new IPLDao();
//
//		boolean status = dao.DeleteOnePlayer(1);
//
//		if(status) {
//			System.out.println("Player Deleted Successfully...");
//		}
//		else {
//			System.out.println("Player Not Found...");
//		}
		
		
//		IPLService service = new IPLService();
//
//		List<Player> list = service.getallPlayer("RCB");
//
//		for (Player p : list) {
//		    System.out.println(p);
//		}

}
}