package com.management.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.model.Competition;
import com.model.Owner;
import com.model.Player;
import com.model.Team;

public class TeamService {

	static List<Team> teams = new ArrayList<Team>();
	private static final Logger logger = Logger.getLogger(TeamService.class);
	
	//This method has been created to have some data from memory. 
	//Using DB this method shouldn´t exist. And the information will be retrieved from the DB in the get methods.
	
	static {
		try {
			teams.add(new Team("Real Madrid", 
							   "Madrid", 
							   new Competition("La Liga", 20), 
							   new Owner("Florentino Eduardo", "Perez Rodriguez", new SimpleDateFormat("dd-MM-yyyy").parse("11-11-1945")), 
							   Arrays.asList(new Player("Cristiano", "Ronaldo", new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1985")), 
									   		 new Player("Keylor", "Navas", new SimpleDateFormat("dd-MM-yyyy").parse("01-12-1993")), 
											 new Player("Gareth", "Bale", new SimpleDateFormat("dd-MM-yyyy").parse("05-03-1990"))),  
							   new Date()));
			teams.add(new Team("Cadiz C.F.", 
							   "Cadiz", 
							   new Competition("La Liga 123", 22), 
							   new Owner("Quique", "Pina", new SimpleDateFormat("dd-MM-yyyy").parse("13-01-1965")), 
							   Arrays.asList(new Player("Dani", "Güiza", new SimpleDateFormat("dd-MM-yyyy").parse("30-05-1982")), 
								   		 	 new Player("Aitor", "Garcia", new SimpleDateFormat("dd-MM-yyyy").parse("23-12-1986")), 
										     new Player("Eddy", "Silvestre", new SimpleDateFormat("dd-MM-yyyy").parse("05-03-1990"))) , 
							   new SimpleDateFormat("dd-MM-yyyy").parse("10-09-1910")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public List<Team> getTeams() throws ParseException{
		logger.info(teams);
		return teams;
	}
	
	public Team getTeamByName(String name){
		Team team = null;
		
		for(Team t : teams){
			if(t.getName().equals(name)){
				team = t;
				break;
			}
		}
		logger.debug("Team returned: " + team);
		return team;
	}
}
