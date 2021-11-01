package com.pfa.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.web.model.ComingFixture;
import com.pfa.web.repository.ComingFixtureRepo;

@Service
public class ComingFixtureService {
	
	@Autowired
	ComingFixtureRepo repository;
	
	public ComingFixture createupcomingFixture(ComingFixture u) {
		return repository.save(u);
	}
	
	public ComingFixture getFixture(long id) {
		return repository.findById(id).get();
	}
	
	public List<ComingFixture> getAllFixtures(){
		return repository.findAll();
	}
}
