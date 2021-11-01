package com.pfa.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.web.model.Player;
import com.pfa.web.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository repository;
	
	public List<Player> getAllPlayers(){
		return repository.findAll();
	}
	
	public List<Player> getPlayerByFirstName(String fname){
		return repository.findByFirstName(fname);
	}
	
	public List<Player> getPlayerByLastName(String lname){
		return repository.findByLastName(lname);
	}
	
	public Player getPlayerByPhone(String phone ) {
		return repository.findByPhone(phone);
	}
	
	public Player getPlayerById(long id) {
		return repository.getById(id);
	}
	
	public Player createPlayer(Player p) {
		return repository.save(p);
	}

}
