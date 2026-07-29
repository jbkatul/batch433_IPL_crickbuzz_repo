package com.tka.dao;

import java.util.List;
import java.util.ArrayList;
import com.tka.entity.Player;

import com.tka.entity.Player;

public class IPLDao implements DaoInterfaces{

	@Override
	public Player getOnePlayer(int pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getallPlayer() {

		List<Player> list = new ArrayList<>();

// ================= RCB =================
		list.add(new Player(1, 18, "Virat Kohli", 8500, 4, "RCB", "Batsman"));
		list.add(new Player(2, 97, "Rajat Patidar", 950, 0, "RCB", "Batsman"));
		list.add(new Player(3, 19, "Josh Hazlewood", 120, 85, "RCB", "Bowler"));
		list.add(new Player(4, 17, "Tim David", 650, 0, "RCB", "Allrounder"));

// ================= MI =================
		list.add(new Player(5, 45, "Rohit Sharma", 7000, 15, "MI", "Batsman"));
		list.add(new Player(6, 63, "Suryakumar Yadav", 4200, 0, "MI", "Batsman"));
		list.add(new Player(7, 93, "Jasprit Bumrah", 120, 190, "MI", "Bowler"));
		list.add(new Player(8, 33, "Hardik Pandya", 2600, 70, "MI", "Allrounder"));

// ================= CSK =================
		list.add(new Player(9, 7, "MS Dhoni", 5500, 0, "CSK", "Wicketkeeper"));
		list.add(new Player(10, 8, "Ravindra Jadeja", 3200, 160, "CSK", "Allrounder"));
		list.add(new Player(11, 90, "Ruturaj Gaikwad", 2800, 0, "CSK", "Batsman"));
		list.add(new Player(12, 27, "Deepak Chahar", 200, 85, "CSK", "Bowler"));

// ================= KKR =================
		list.add(new Player(13, 74, "Andre Russell", 2400, 110, "KKR", "Allrounder"));
		list.add(new Player(14, 12, "Sunil Narine", 1800, 180, "KKR", "Allrounder"));
		list.add(new Player(15, 23, "Varun Chakravarthy", 60, 95, "KKR", "Bowler"));
		list.add(new Player(16, 41, "Rinku Singh", 1300, 0, "KKR", "Batsman"));

// ================= RR =================
		list.add(new Player(17, 22, "Sanju Samson", 3800, 0, "RR", "Wicketkeeper"));
		list.add(new Player(18, 99, "Yashasvi Jaiswal", 2100, 0, "RR", "Batsman"));
		list.add(new Player(19, 6, "Yuzvendra Chahal", 200, 210, "RR", "Bowler"));
		list.add(new Player(20, 25, "Riyan Parag", 900, 20, "RR", "Allrounder"));

// ================= GT =================
		list.add(new Player(21, 33, "Shubman Gill", 3600, 0, "GT", "Batsman"));
		list.add(new Player(22, 5, "Rashid Khan", 500, 170, "GT", "Allrounder"));
		list.add(new Player(23, 11, "Mohammed Shami", 180, 140, "GT", "Bowler"));
		list.add(new Player(24, 14, "Sai Sudharsan", 1100, 0, "GT", "Batsman"));

// ================= SRH =================
		list.add(new Player(25, 1, "Travis Head", 1500, 0, "SRH", "Batsman"));
		list.add(new Player(26, 77, "Pat Cummins", 800, 95, "SRH", "Allrounder"));
		list.add(new Player(27, 55, "Mohammed Siraj", 90, 115, "SRH", "Bowler"));
		list.add(new Player(28, 9, "Abhishek Sharma", 1400, 10, "SRH", "Allrounder"));

// ================= PBKS =================
		list.add(new Player(29, 10, "Shreyas Iyer", 3100, 0, "PBKS", "Batsman"));
		list.add(new Player(30, 15, "Arshdeep Singh", 50, 90, "PBKS", "Bowler"));
		list.add(new Player(31, 29, "Marcus Stoinis", 2100, 45, "PBKS", "Allrounder"));
		list.add(new Player(32, 88, "Prabhsimran Singh", 1200, 0, "PBKS", "Wicketkeeper"));

// ================= DC =================
		list.add(new Player(33, 17, "KL Rahul", 5000, 0, "DC", "Wicketkeeper"));
		list.add(new Player(34, 4, "Kuldeep Yadav", 150, 110, "DC", "Bowler"));
		list.add(new Player(35, 32, "Axar Patel", 1800, 85, "DC", "Allrounder"));
		list.add(new Player(36, 66, "Jake Fraser-McGurk", 700, 0, "DC", "Batsman"));

// ================= LSG =================
		list.add(new Player(37, 99, "Rishabh Pant", 3400, 0, "LSG", "Wicketkeeper"));
		list.add(new Player(38, 56, "Nicholas Pooran", 2500, 0, "LSG", "Wicketkeeper"));
		list.add(new Player(39, 21, "Avesh Khan", 40, 75, "LSG", "Bowler"));
		list.add(new Player(40, 44, "Mitchell Marsh", 1600, 35, "LSG", "Allrounder"));

		return list;
	}

	@Override
	public Player InsertOnePlayer(Player obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player UpdateOnePlayer(Player obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean DeleteOnePlayer(int pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
