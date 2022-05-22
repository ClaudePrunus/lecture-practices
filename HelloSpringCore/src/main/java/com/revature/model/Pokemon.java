package com.revature.model;

import java.util.Objects;


public class Pokemon {
	private int pokeId;
	private String pokemonName;
	private String pokeType;
	private int attackPower;
	
	public Pokemon() {
		super();
	}

	public Pokemon(String pokemonName, String pokeType, int attackPower) {
		super();
		this.pokemonName = pokemonName;
		this.pokeType = pokeType;
		this.attackPower = attackPower;
	}

	public Pokemon(int pokeId, String pokemonName, String pokeType, int attackPower) {
		super();
		this.pokeId = pokeId;
		this.pokemonName = pokemonName;
		this.pokeType = pokeType;
		this.attackPower = attackPower;
	}

	public int getPokeId() {
		return pokeId;
	}

	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}
	
	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public String getPokeType() {
		return pokeType;
	}

	public void setPokeType(String pokeType) {
		this.pokeType = pokeType;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public String toString() {
		return "Pokemon [pokeId=" + pokeId + ", pokemonName=" + pokemonName + ", pokeType=" + pokeType
				+ ", attackPower=" + attackPower + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(attackPower, pokeId, pokeType, pokemonName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return attackPower == other.attackPower && pokeId == other.pokeId && Objects.equals(pokeType, other.pokeType)
				&& Objects.equals(pokemonName, other.pokemonName);
	}
	

}
