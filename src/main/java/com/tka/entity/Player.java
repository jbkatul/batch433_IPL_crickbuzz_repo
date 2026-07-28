package com.tka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	@Id
	@Column(name = "p_id")
	private int p_id;
	@Column(name = "jn")
	private int jn;
	@Column(name = "p_name")
	private String p_name;
	@Column(name = "runs")
	private int runs;
	@Column(name = "wickets")
	private int wickets;
	@Column(name = "tname")
	private String tname;
	@Column(name = "specialisation")
	private String specialisation;
	
	public Player() {
		
	}

	public Player(int p_id, int jn, String p_name, int runs, int wickets, String tname, String specialisation) {
		super();
		this.p_id = p_id;
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
		return "Player [p_id=" + p_id + ", jn=" + jn + ", p_name=" + p_name + ", runs=" + runs + ", wickets=" + wickets
				+ ", tname=" + tname + ", specialisation=" + specialisation + "]";
	}
	
	

}
