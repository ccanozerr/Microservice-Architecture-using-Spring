package com.ccanozerr.fr.domain;

import java.time.LocalDate;
import java.time.Year;

import com.ccanozerr.fr.domain.metadata.annotations.Aggregate;
import com.ccanozerr.fr.domain.metadata.annotations.Entity;
import com.ccanozerr.fr.domain.metadata.enumtypes.Character;
import com.ccanozerr.fr.domain.metadata.enumtypes.Country;
import com.ccanozerr.fr.domain.metadata.enumtypes.Currency;
import com.ccanozerr.fr.domain.metadata.enumtypes.League;
import com.ccanozerr.fr.domain.metadata.enumtypes.Position;
import com.ccanozerr.fr.domain.metadata.enumtypes.Role;

@Entity(identity = "licence")
@Aggregate
public class Footballer {

	private Licence licence;
	private FullName fullName;
	private Birth birth;
	private Nation nation;
	private Team team;
	private Contract contract;
	private Pitch pitch;
	private Personality personality;

	public Footballer(Licence licence, FullName fullName, Birth birth, Nation nation, Pitch pitch, Personality personality) {
		this.licence = licence;
		this.fullName = fullName;
		this.birth = birth;
		this.nation = nation;
		this.pitch = pitch;
		this.personality = personality;
	}

	public Footballer(Builder builder) {
		this.licence = builder.licence;
		this.fullName = builder.fullName;
		this.birth = builder.birth;
		this.nation = builder.nation;
		this.team = builder.team;
		this.contract = builder.contract;
		this.pitch = builder.pitch;
		this.personality = builder.personality;
	}

	// Builder: DSL -> Flow API -> Method Chain
	public static class Builder {
		private Licence licence;
		private FullName fullName;
		private Birth birth;
		private Nation nation;
		private Team team;
		private Contract contract;
		private Pitch pitch;
		private Personality personality;

		public Builder licence(Licence licence) {
			this.licence = licence;
			return this;
		}

		public Builder fullName(String firstName, String midName, String lastName, String nickName) {
			this.fullName = FullName.valueOf(firstName, midName, lastName, nickName);
			return this;
		}

		public Builder birth(LocalDate birthDay, Country birthCountry) {
			this.birth = Birth.valueOf(birthDay, birthCountry);
			return this;
		}

		public Builder nation(Country firstNation, Country secondNation, Country otherNation) {
			this.nation = Nation.valueOf(firstNation, secondNation, otherNation);
			return this;
		}

		public Builder team(String teamName, String teamNickName, Year teamFoundYear, League league) {
			this.team = Team.valueOf(teamName, teamNickName, teamFoundYear, league);
			return this;
		}

		public Builder contract(Year contractStart, Year contractEnd, Double salary, Currency salaryCurrency) {
			this.contract = Contract.valueOf(contractStart, contractEnd, salary, salaryCurrency);
			return this;
		}

		public Builder pitch(Position mainPosition, Role mainRole) {
			this.pitch = Pitch.valueOf(mainPosition, mainRole);
			return this;
		}

		public Builder personality(String favouritePersonal, String favouriteTeam, Character character) {
			this.personality = Personality.valueOf(favouritePersonal, favouriteTeam, character);
			return this;
		}

		public Footballer build() {
			//Can make validation for our domain object
			//or business roles
			return new Footballer(this);
		}
	}

	public Licence getLicence() {
		return licence;
	}

	public void setLicence(Licence licence) {
		this.licence = licence;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public Birth getBirth() {
		return birth;
	}

	public void setBirth(Birth birth) {
		this.birth = birth;
	}

	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Pitch getPitch() {
		return pitch;
	}

	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	public Personality getPersonality() {
		return personality;
	}

	public void setPersonality(Personality personality) {
		this.personality = personality;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((licence == null) ? 0 : licence.hashCode());
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
		Footballer other = (Footballer) obj;
		if (licence == null) {
			if (other.licence != null)
				return false;
		} else if (!licence.equals(other.licence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Footballer [licence=" + licence + ", fullName=" + fullName + ", birth=" + birth + ", nation=" + nation
				+ ", team=" + team + ", contract=" + contract + ", pitch=" + pitch + ", personality=" + personality
				+ "]";
	}

}
