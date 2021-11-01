package com.pfa.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.web.model.ComingFixture;

@Repository
public interface ComingFixtureRepo extends JpaRepository<ComingFixture, Long> {

}
