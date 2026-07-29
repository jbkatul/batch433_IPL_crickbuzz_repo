package com.tka.client;

import java.util.Scanner;

public class IPLClient {
	
	int choice = 0;
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		IPLClient iplclient = new IPLClient();
		iplclient.start();
		
	}

	private void start() {
		
		do {
			displayMenu();
		} while(choice != 11);
		
	}

	private void displayMenu() {
		
		System.out.println("=========================================");
		System.out.println("         IPL CRICBUZZ OPERATIONS         ");
		System.out.println("=========================================\r\n");
		
		System.out.println("1. Insert Player\r\n"
				+ "2. Update Player\r\n"
				+ "3. Delete Player\r\n"
				+ "4. Get Player\r\n"
				+ "5. Get All Players\r\n"
				+ "6. Get All Players By Team\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "\r\n"
				+ "7. Get All Batsmen\r\n"
				+ "8. Get All Bowlers\r\n"
				+ "9. Get All Rounders\r\n"
				+ "10. Search Player By Name\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "11. Exit\r\n"
				+ "\r\n"
				+ "=========================================");
		
		System.out.println("Enter choice :");
		choice = scanner.nextInt();
		
		while(choice < 1 || choice > 11) {
			System.out.println("Invalid choice!");
			System.out.println("---------------");
			System.out.println("Enter choice :");
			choice = scanner.nextInt();
		}
	
		switch(choice) {
		case 1:
			 System.out.println("Insert Player");
			 System.out.println();
			break;
		case 2:
			System.out.println("Update Player");
			System.out.println();
			break;
		case 3:
			System.out.println("Delete Player");
			System.out.println();
			break;
		case 4:
			System.out.println("Get Player");
			System.out.println();
			break;
		case 5:
			System.out.println("Get All Players");
			System.out.println();
			break;
		case 6:
			System.out.println("Get All Players By Team");
			System.out.println();
			break;
		case 7:
			System.out.println("Get All Batsmen");
			System.out.println();
			break;
		case 8:
			System.out.println("Get All Bowlers");
			System.out.println();
			break;
		case 9:
			System.out.println("Get All Rounders");
			System.out.println();
			break;
		case 10:
			System.out.println("Search Player By Name");
			System.out.println();
			break;
		case 11:
			  System.out.println("Thank You...");
			  System.out.println("Application Closed.");
			  System.out.println();
			break;
		default:
		    System.out.println("Invalid Choice");
		}
	}

}
