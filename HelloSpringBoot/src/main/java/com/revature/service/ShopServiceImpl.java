package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Shop;
import com.revature.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository srepo;

	@Override
	public boolean createShop(Shop shop) {
		int pk = srepo.save(shop).getId();
		return (pk > 0) ? true : false;
	}

	@Override
	public Shop getShopById(int id) {
		System.out.println("ID: " + id);
		return srepo.findById(id);
	}

	@Override
	public List<Shop> getAllShops() {
		return srepo.findAll();
	}

	@Override
	public boolean updateShop(Shop shop) {
		return srepo.update(shop.getShopName(), shop.getInventoryCount(), shop.getId());
	}

	@Override
	public boolean deleteShop(Shop shop) {
		srepo.delete(shop);
		return true;
	}
}
