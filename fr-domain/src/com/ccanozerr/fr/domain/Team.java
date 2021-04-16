package com.ccanozerr.fr.domain;

import java.time.Year;
import java.util.Objects;

import com.ccanozerr.fr.domain.metadata.enumtypes.League;

public class Team {

	private final String teamName;
	private final String teamNickName;
	private final Year teamFoundYear;
	private final League league;

	private Team(String teamName, String teamNickName, Year teamFoundYear, League league) {
		this.teamName = teamName;
		this.teamNickName = teamNickName;
		this.teamFoundYear = teamFoundYear;
		this.league = league;
	}

	public static Team valueOf(String teamName, String teamNickName, Year teamFoundYear, League league) {
		Objects.requireNonNull(teamName);
		Objects.requireNonNull(league);
		return new Team(teamName, teamNickName, teamFoundYear, league);
	}

	public String getTeamName() {
		return teamName;
	}

	public String getTeamNickName() {
		return teamNickName;
	}

	public Year getTeamFoundYear() {
		return teamFoundYear;
	}

	public League getLeague() {
		return league;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((league == null) ? 0 : league.hashCode());
		result = prime * result + ((teamFoundYear == null) ? 0 : teamFoundYear.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((teamNickName == null) ? 0 : teamNickName.hashCode());
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
		Team other = (Team) obj;
		if (league != other.league)
			return false;
		if (teamFoundYear == null) {
			if (other.teamFoundYear != null)
				return false;
		} else if (!teamFoundYear.equals(other.teamFoundYear))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (teamNickName == null) {
			if (other.teamNickName != null)
				return false;
		} else if (!teamNickName.equals(other.teamNickName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamNickName=" + teamNickName + ", teamFoundYear=" + teamFoundYear
				+ ", league=" + league + "]";
	}

}
