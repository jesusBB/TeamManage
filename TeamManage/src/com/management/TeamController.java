package com.management;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.management.services.TeamService;
import com.model.Team;

@Path("/")
public class TeamController {
	private static final Logger logger = Logger.getLogger(TeamController.class);
	
	TeamService teamService = new TeamService();
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Team> getTeams() {
		logger.debug("Getting list of team");
		try {
			return teamService.getTeams();
		} catch (ParseException e) {
			logger.error("Error getting list of teams: " + e.getMessage());
			return null;
		}
	}
	
	@POST
	@Path("/get")
	@Consumes(MediaType.APPLICATION_JSON)
	public Team getTeam(Team name) {
		logger.debug("Getting team by name:" + name);
		return teamService.getTeamByName(name.getName());
	}
	
	
}


