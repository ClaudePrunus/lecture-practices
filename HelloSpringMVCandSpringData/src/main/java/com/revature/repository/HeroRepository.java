package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Hero;

@Repository
@Transactional
public interface HeroRepository extends JpaRepository<Hero, Integer> {
	
	// the question mark '?' from h_name indicates the parameter 'name'
	@Query(value = "SELECT * FROM heroes WHERE h_name=?", nativeQuery=true)
	public Hero findByName(String name);
}
