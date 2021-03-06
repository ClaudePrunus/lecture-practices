package com.revature.service;

import java.util.List;

import com.revature.model.Candy;

public interface CandyService {
	//create a new candy
	boolean createCandy(Candy candy);
	//get candy by id
	Candy getCandyById(int id);
	//get all candies
	List<Candy> getAllCandies();
	//update a candy
	boolean updateCandy(Candy candy);
	//delete a candy
	boolean deleteCandy(Candy candy);
}
