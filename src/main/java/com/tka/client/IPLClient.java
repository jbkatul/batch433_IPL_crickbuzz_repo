package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.service.IPLService;



public class IPLClient {

	public static void main(String[] args) {
	IPLService Service = new IPLService();
		
	Scanner sc = new Scanner(System.in);
	

	while (true) {

	    System.out.println("\n===== IPL MENU =====");
	    System.out.println("1. Get One Player");
	    System.out.println("2. Get All Players");
	    System.out.println("3. Insert Player");
	    System.out.println("4. Update Player");
	    System.out.println("5. Delete Player");
	    System.out.println("6. Get Players By Team");
	    System.out.println("7. Get All Batsman");
	    System.out.println("8. Get All Bowlers");
	    System.out.println("9. Get All Rounders");
	    System.out.println("10. Name Starts With");
	    System.out.println("11. Exit");

	    System.out.print("Enter Choice : ");
	    int choice = sc.nextInt();
	    sc.nextLine();   

	    switch (choice) {

	    case 1:
	    	System.out.println("Enter the Player Id :");
	    	int id = sc.nextInt();
	    	
	    	Player p = Service.getOnePlayer(id);
	    	System.out.println(p.getP_id()+" "+p.getJn()+" "+p.getP_name()+" "
	    	+p.getRuns()+" "+p.getWickets()+" "+p.getTname());
	        break;

	    case 2:
	    	List<Player> allplayer = Service.getallPlayer();
	    	allplayer.forEach(j-> System.out.println(j.getP_id()+" "+j.getJn()+" "+j.getP_name()+" "
	    		+j.getRuns()+" "+j.getWickets()+" "+j.getTname()));
	        break;

	    case 3:
	    	 System.out.print("Enter Jersey No : ");
	         int jn = sc.nextInt();
	         sc.nextLine();

	         System.out.print("Enter Player Name : ");
	         String name = sc.nextLine();

	         System.out.print("Enter Runs : ");
	         int runs = sc.nextInt();

	         System.out.print("Enter Wickets : ");
	         int wickets = sc.nextInt();
	         sc.nextLine();

	         System.out.print("Enter Team Name : ");
	         String team = sc.nextLine();

	         System.out.print("Enter Specialization : ");
	         String spec = sc.nextLine();

	         Player insertPlayer = new Player(jn, name, runs, wickets, team, spec);
	         Player insert = Service.InsertOnePlayer(insertPlayer);
	     	System.out.println("Inserted "+insert);
	         
	        break;

	    case 4:
	    	 System.out.print("Enter Player ID : ");
	         int pid = sc.nextInt();

	         System.out.print("Enter Jersey No : ");
	         int j = sc.nextInt();
	         sc.nextLine();

	         System.out.print("Enter Player Name : ");
	         String pname = sc.nextLine();

	         System.out.print("Enter Runs : ");
	         int r = sc.nextInt();

	         System.out.print("Enter Wickets : ");
	         int w = sc.nextInt();
	         sc.nextLine();

	         System.out.print("Enter Team Name : ");
	         String t = sc.nextLine();

	         System.out.print("Enter Specialization : ");
	         String s = sc.nextLine();

	         Player updatePlayer = new Player(pid, j, pname, r, w, t, s);
	         Player update = Service.UpdateOnePlayer(updatePlayer);
	     	System.out.println("Updated Player "+update);
	        break;

	    case 5:
	    	System.out.print("Enter Player ID : ");
	        int deleteId = sc.nextInt();
	    	Boolean deletepl = Service.DeleteOnePlayer(deleteId);
	    	if(deletepl)
	    	{
	    		System.out.println("Pleyer Deleted");
	    	}
	    	else
	    	{
	    		System.out.println("Pleyer not Deleted");

	    	}

	        break;

	    case 6:
	        sc.nextLine();
	    	System.out.println("Enter the Team name :");
	    	String Team2=sc.nextLine();
	    	List<Player> getTeam = Service.getallPlayer(Team2);
	    	getTeam.forEach(g-> System.out.println(g.getP_id()+" "+g.getJn()+" "+g.getP_name()+" "
	    			+g.getRuns()+" "+g.getWickets()+" "+g.getTname()));
	        break;

	    case 7:
	    	String specialize="Batter";
	    	List<Player> getallBatsman = Service.getallBatsman(specialize);
	    	
	    	getallBatsman.forEach(b-> System.out.println(b.getP_id()+" "+b.getJn()+" "+b.getP_name()+" "	
	    	+b.getRuns()+" "+b.getWickets()+" "+b.getTname()));
	        break;

	    case 8:
	    	List<Player> getallBowlers = Service.getallBowlers("Bowler");
	    	getallBowlers.forEach(o-> System.out.println(o.getP_id()+" "+o.getJn()
	    			+" "+o.getP_name()+" "	
	    			+o.getRuns()+" "+o.getWickets()
	    			+" "+o.getTname()));
	        break;

	    case 9:
	    	List<Player> getallAllrounders = Service.getallAllrounders("ALL-Rounder");
	    	getallAllrounders.forEach(al-> System.out.println(al.getP_id()+" "+al.getJn()
	    	+" "+al.getP_name()+" "	
	    	+al.getRuns()+" "+al.getWickets()
	    	+" "+al.getTname()));
	        break;

	    case 10:
	    System.out.println("Enter First name");
	   	 String names=sc.nextLine();
	   	List<Player> getplayers_name_starts_with = Service.getplayers_name_starts_with(names);
	   	getplayers_name_starts_with.forEach(d-> System.out.println(d.getP_id()+" "+d.getJn()
	   	+" "+d.getP_name()+" "+d.getRuns()+" "+d.getWickets()+" "+d.getTname()));
	        break;

	    case 11:
	        System.out.println("Thank You...");
	        sc.close();
	        return;

	    default:
	        System.out.println("Invalid Choice");
	    }
	}
	
	}

}
