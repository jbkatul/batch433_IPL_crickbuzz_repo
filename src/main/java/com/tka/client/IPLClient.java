package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLClient {

	public static void main(String[] args) {

		IPLService iplservice = new IPLService();
		Scanner sc = new Scanner(System.in);

		// Task-1 Get all Player
		System.out.println("Details of all players...!");

		List<Player> allplayer = iplservice.getallPlayer();

		for (Player player : allplayer) {
			System.out.println("ID: " + player.getP_id() + " JN: " + player.getJn() + " Name: " + player.getP_name()
					+ "Team: " + player.getTname());
		}

		// Task-2 Get one player by id

		System.out.println("\nSearch Player By ID");
		System.out.println("Enter Player Id:");
		int pk = sc.nextInt();
		Player p = iplservice.getOnePlayer(pk);
		if (p != null)
			System.out.println(p);
		else
			System.out.println("Player Not Found...!");

		// Task-3 Add Player

		System.out.println("ADD Player....!");

		System.out.println("Enter Id:");
		int pid = sc.nextInt();

		System.out.println("Enter Jersey Number:");
		int jn = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Player Name:");
		String n = sc.nextLine();

		System.out.println("Enter Runs:");
		int r = sc.nextInt();

		System.out.println("Enter Wickets:");
		int w = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Team Name:");
		String t = sc.nextLine();

		System.out.println("Enter Category:");
		String s = sc.nextLine();

		Player p1 = new Player(pid, jn, n, r, w, t, s);
		Player pp1 = iplservice.InsertOnePlayer(p1);
		if (pp1 != null) {
			System.out.println(pp1);
			System.out.println("Player Added Successfully....!");
		} else {
			System.out.println("Duplicate Id...or check pid and jno...");
		}

	}

}
