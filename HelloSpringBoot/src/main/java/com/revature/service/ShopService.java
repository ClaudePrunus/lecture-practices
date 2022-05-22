package com.revature.service;

import java.util.List;

import com.revature.model.Shop;

public interface ShopService {

	//create a new shop
	boolean createShop(Shop shop);
	//get shop by id
	Shop getShopById(int id);
	//get all shops
	List<Shop> getAllShops();
	//update a shop
	boolean updateShop(Shop shop);
	//delete a shop
	boolean deleteShop(Shop shop);

}

