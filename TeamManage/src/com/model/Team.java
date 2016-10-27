package com.model;

import java.util.Date;
import java.util.List;

public class Team {
	String name;
	String city;
	Competition competition;
	Owner owner;
	List<Player> players;
	Date creation;
	
	
	public Team(String name, String city, Competition competition, Owner owner, List<Player> players, Date creation) {
		super();
		this.name = name;
		this.city = city;
		this.competition = competition;
		this.owner = owner;
		this.players = players;
		this.creation = creation;
	}

	
	
	public Team(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Competition getCompetition() {
		return competition;
	}


	public void setCompetition(Competition competition) {
		this.competition = competition;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	public List<Player> getPlayers() {
		return players;
	}


	public void setPlayers(List<Player> players) {
		this.players = players;
	}


	public Date getCreation() {
		return creation;
	}


	public void setCreation(Date creation) {
		this.creation = creation;
	}


	
	
	
}
