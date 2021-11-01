package com.pfa.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.web.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
	Player findByPhone(String phone);
	List<Player> findByFirstName(String fname);
	List<Player> findByLastName(String lname);
}
