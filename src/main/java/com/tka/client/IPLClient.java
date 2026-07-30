package com.tka.client;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLClient {

	public static void main(String[] args) {

        IPLService service = new IPLService();

        // 1. Insert a new player
        Player newPlayer = new Player();
        newPlayer.setP_name("Virat Kohli");
        newPlayer.setTname("RCB");
        newPlayer.setSpecialisation("Batsman");

        service.InsertOnePlayer(newPlayer);
        System.out.println("Inserted: " + newPlayer.getP_name());

        // 2. Get one player by primary key
        Player p1 = service.getOnePlayer(1);
        if (p1 != null) {
            System.out.println("Fetched Player: " + p1.getP_name() + " - " + p1.getTname());
        }

        // 3. Get all players
        List<Player> allPlayers = service.getallPlayer();
        System.out.println("\nAll Players:");
        for (Player p : allPlayers) {
            System.out.println(p.getP_name() + " (" + p.getTname() + ")");
        }

        // 4. Get players by team
        List<Player> rcbPlayers = service.getallPlayer("RCB");
        System.out.println("\nRCB Players:");
        rcbPlayers.forEach(p -> System.out.println(p.getP_name()));

        // 5. Get batsmen from a team
        List<Player> batsmen = service.getallBatsman("RCB");
        System.out.println("\nRCB Batsmen:");
        batsmen.forEach(p -> System.out.println(p.getP_name()));

        // 6. Update a player
        if (p1 != null) {
            p1.setSpecialisation("Captain");
            service.UpdateOnePlayer(p1);
            System.out.println("\nUpdated Player: " + p1.getP_name() + " → " + p1.getSpecialisation());
        }

        // 7. Delete a player
        boolean deleted = service.DeleteOnePlayer(2);
        System.out.println("\nPlayer with ID 2 deleted: " + deleted);
    }

}
