package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ipl_players")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	private int jn;
	private String p_name;
	private int runs;
	private int wickets;
	private String tname;
	private String specialisation;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player( int jn, String p_name, int runs, int wickets, String tname, String specialisation) {
		super();
		this.jn = jn;
		this.p_name = p_name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
		this.specialisation = specialisation;
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
