package com.revature.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="heros")
public class Hero {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="h_id")
	private int id;
	
	@Column(name="h_name", unique=true, nullable=false)
	private String name;
	
	@Column(name="h_superpower")
	private String superPower;
	
	@Column(name="h_has_cape", nullable=false)
	private boolean hasCape;

}