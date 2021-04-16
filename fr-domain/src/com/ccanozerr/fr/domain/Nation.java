package com.ccanozerr.fr.domain;

import java.util.Objects;

import com.ccanozerr.fr.domain.metadata.enumtypes.Country;

public class Nation {

	private final Country firstNation;
	private final Country secondNation;
	private final Country otherNation;

	private Nation(Country firstNation, Country secondNation, Country otherNation) {
		this.firstNation = firstNation;
		this.secondNation = secondNation;
		this.otherNation = otherNation;
	}

	public static Nation valueOf(Country firstNation, Country secondNation, Country otherNation) {
		Objects.requireNonNull(firstNation);
		return new Nation(firstNation, secondNation, otherNation);
	}

	public Country getFirstNation() {
		return firstNation;
	}

	public Country getSecondNation() {
		return secondNation;
	}

	public Country getOtherNation() {
		return otherNation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstNation == null) ? 0 : firstNation.hashCode());
		result = prime * result + ((otherNation == null) ? 0 : otherNation.hashCode());
		result = prime * result + ((secondNation == null) ? 0 : secondNation.hashCode());
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
		Nation other = (Nation) obj;
		if (firstNation != other.firstNation)
			return false;
		if (otherNation != other.otherNation)
			return false;
		if (secondNation != other.secondNation)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nation [firstNation=" + firstNation + ", secondNation=" + secondNation + ", otherNation=" + otherNation
				+ "]";
	}

}
