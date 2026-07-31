package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLClient {

	public static void main(String[] args) {

		IPLDao dao = new IPLDao();
		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\n*************** IPL MENU ***************");
			System.out.println("1. Show All Players");
			System.out.println("2. Show Player By ID");
			System.out.println("3. Show Players By Team");
			System.out.println("4. Show Batsmen By Team");
			System.out.println("5. Show Bowlers By Team");
			System.out.println("6. Show Allrounders By Team");
			System.out.println("7. Search Player By Starting Letter");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

				case 1:
					List<Player> allPlayers = dao.getallPlayer();
					allPlayers.forEach(System.out::println);
					break;

				case 2:
					System.out.print("Enter Player ID: ");
					int id = sc.nextInt();
					Player p = dao.getOnePlayer(id);

					if (p != null)
						System.out.println(p);
					else
						System.out.println("Player not found");
					break;

				case 3:
					System.out.print("Enter Team Name: ");
					String team = sc.nextLine();

					List<Player> teamPlayers = dao.getallPlayer(team);
					teamPlayers.forEach(System.out::println);
					break;

				case 4:
					System.out.print("Enter Team Name: ");
					team = sc.nextLine();

					List<Player> batsmen = dao.getallBatsman(team);
					batsmen.forEach(System.out::println);
					break;

				case 5:
					System.out.print("Enter Team Name: ");
					team = sc.nextLine();

					List<Player> bowlers = dao.getallBowlers(team);
					bowlers.forEach(System.out::println);
					break;

				case 6:
					System.out.print("Enter Team Name: ");
					team = sc.nextLine();

					List<Player> allrounders = dao.getallAllrounders(team);
					allrounders.forEach(System.out::println);
					break;

				case 7:
					System.out.print("Enter Starting Letter: ");
					String letter = sc.nextLine();

					List<Player> names = dao.getplayers_name_starts_with(letter);
					names.forEach(System.out::println);
					break;

				case 8:
					System.out.println("Thank you! Exiting application...");
					break;

				default:
					System.out.println("Invalid choice! Try again.");
			}

		} while (choice != 8);

		sc.close();
	}
}