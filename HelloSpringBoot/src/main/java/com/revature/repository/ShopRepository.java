package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Shop;


@Repository
@Transactional
public interface ShopRepository extends JpaRepository<Shop, Integer>{

	@Query(value="UPDATE shops SET s_name=?1, s_inventory_count=?2 WHERE s_id=?3", nativeQuery = true)
	public boolean update(String name, int invCount, int id);
	
	@Query(value="SELECT * FROM shops where s_id=?1", nativeQuery = true)
	public Shop findById(int id);
}
