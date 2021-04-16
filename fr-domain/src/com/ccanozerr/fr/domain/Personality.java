package com.ccanozerr.fr.domain;

import java.util.Objects;

import com.ccanozerr.fr.domain.metadata.enumtypes.Character;

public class Personality {

	private final String favouritePersonal;
	private final String favouriteTeam;
	private final Character character;

	private Personality(String favouritePersonal, String favouriteTeam, Character character) {
		this.favouritePersonal = favouritePersonal;
		this.favouriteTeam = favouriteTeam;
		this.character = character;
	}

	public static Personality valueOf(String favouritePersonal, String favouriteTeam, Character character) {
		Objects.requireNonNull(character);
		return new Personality(favouritePersonal, favouriteTeam, character);
	}

	public String getFavouritePersonal() {
		return favouritePersonal;
	}

	public String getFavouriteTeam() {
		return favouriteTeam;
	}

	public Character getCharacter() {
		return character;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((favouritePersonal == null) ? 0 : favouritePersonal.hashCode());
		result = prime * result + ((favouriteTeam == null) ? 0 : favouriteTeam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personality other = (Personality) obj;
		if (character != other.character)
			return false;
		if (favouritePersonal == null) {
			if (other.favouritePersonal != null)
				return false;
		} else if (!favouritePersonal.equals(other.favouritePersonal))
			return false;
		if (favouriteTeam == null) {
			if (other.favouriteTeam != null)
				return false;
		} else if (!favouriteTeam.equals(other.favouriteTeam))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personality [favouritePersonal=" + favouritePersonal + ", favouriteTeam=" + favouriteTeam
				+ ", character=" + character + "]";
	}

}
