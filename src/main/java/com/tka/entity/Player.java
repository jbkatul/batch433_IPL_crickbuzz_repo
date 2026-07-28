package com.tka.entity;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int p_id;
	@Column(name = "JourseyNo")
	private int jn;
	@Column(name = "PlayerName")
	private String p_name;
	private int runs;
	private int wickets;
	@Column(name = "TeamName")
	private String tname;
	private String specialisation;

	public Player() {}

	public Player( int jn, String p_name, int runs, int wickets, String tname, String specialisation) {
		this.jn = jn;
		this.p_name = p_name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
		this.specialisation = specialisation;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getJn() {
		return jn;
	}
	public void setJn(int jn) {
		this.jn = jn;
	}
	public String getP_name() {
		return p_name;

	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	@Override
	public String toString() {
		return "{ pid= " + p_id+" Jn= "+jn+" P_name= "+p_name+" runs= "+runs+" Wickets= "+wickets+" Tname= "+tname+" specialisation="+specialisation+"}";
	}
}
