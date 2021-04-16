package com.ccanozerr.fr.domain;

import java.time.LocalDate;
import java.util.Objects;

import com.ccanozerr.fr.domain.metadata.annotations.ValueObject;
import com.ccanozerr.fr.domain.metadata.enumtypes.Country;

@ValueObject
public class Birth {

	private final LocalDate birthDay;
	private final Country birthCountry;

	private Birth(LocalDate birthDay, Country birthCountry) {
		this.birthDay = birthDay;
		this.birthCountry = birthCountry;
	}

	public static Birth valueOf(LocalDate birthDay, Country birthCountry) {
		Objects.requireNonNull(birthDay);
		Objects.requireNonNull(birthCountry);
		return new Birth(birthDay, birthCountry);
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public Country getBirthCountry() {
		return birthCountry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthCountry == null) ? 0 : birthCountry.hashCode());
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
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
		Birth other = (Birth) obj;
		if (birthCountry != other.birthCountry)
			return false;
		if (birthDay == null) {
			if (other.birthDay != null)
				return false;
		} else if (!birthDay.equals(other.birthDay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Birth [birthDay=" + birthDay + ", birthCountry=" + birthCountry + "]";
	}

}
