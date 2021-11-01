package com.pfa.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.web.model.ComingFixture;
import com.pfa.web.model.Player;
import com.pfa.web.service.ComingFixtureService;
import com.pfa.web.service.PlayerService;

@RestController
@RequestMapping("/pfa")
public class MainController {
	
	@Autowired
	ComingFixtureService fixtureService;
	
	@Autowired
	PlayerService playerService;
	
	@GetMapping("/home")
	public String welcome() {
		return "Welcome to Pioneers Football Academy";
	}
	
	@PutMapping("/add/fixture")
	public ComingFixture addFixture(@RequestParam String opponent, @RequestParam String venue, @RequestParam String date, @RequestParam String time) {
		
		ComingFixture fixture = new ComingFixture();
		fixture.setDate(date);
		fixture.setOpponent(opponent);
		fixture.setTime(time);
		fixture.setVenue(venue);
		
		return fixtureService.createupcomingFixture(fixture);
	}
	
	@GetMapping("/all/fixtures")
	public List<ComingFixture> getAllFixtures() {
		
		return fixtureService.getAllFixtures();
	}
	
	@GetMapping("fixture/{id}")
	public ComingFixture getFixtureById(@PathVariable long id) {
		return fixtureService.getFixture(id);
	}
	
	@PutMapping("/createplayer")
	public Player createPlayer(
			@RequestParam String fname,
			@RequestParam String lname,
			@RequestParam String phone,
			@RequestParam String address,
			@RequestParam String academicLevel,
			@RequestParam String pname,
			@RequestParam String pPhone,
			@RequestParam int age) {
		
		Player p = new Player();
		
		p.setAcademicLevel(academicLevel);
		p.setAddress(address);
		p.setAge(age);
		p.setFirstName(fname);
		p.setLastName(lname);
		p.setPhone(phone);
		p.setpPhone(pPhone);
		p.setpName(pname);
		
		return playerService.createPlayer(p);
	}
	
	@GetMapping("player/{id}")
	public Player getPlayerById(@PathVariable long id) {
		return playerService.getPlayerById(id);
	}
	
	@GetMapping("/all/players")
	public List<Player> getAllPlayers() {
		
		return playerService.getAllPlayers();
	}
	
	@GetMapping("/playerbyfirst/{fname}")
	public List<Player> getPlayerByFirstName(@PathVariable String fname) {
		
		return playerService.getPlayerByFirstName(fname);
	}
	
	@GetMapping("/playerbylast/{lname}")
	public List<Player> getPlayerByLastName(@PathVariable String lname) {
		
		return playerService.getPlayerByLastName(lname);
	}
	
	@GetMapping("/playerbyphone/{phone}")
	public Player getPlayerByPhone(@PathVariable String phone) {
		
		return playerService.getPlayerByPhone(phone);
	}
	
	
}
