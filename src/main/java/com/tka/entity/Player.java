package com.tka.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "player")
public class Player {
	
	@Id
	private int p_id;
	private int jn;
	private String p_name;
	private int runs;
	private int wickets;
	private String tname;
	private String specialisation;

}
