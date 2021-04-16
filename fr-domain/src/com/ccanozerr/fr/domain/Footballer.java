package com.ccanozerr.fr.domain;

import com.ccanozerr.fr.domain.metadata.annotations.Entity;

@Entity(identity = "licence")
public class Footballer {

	private Licence licence;
	private FullName fullName;
	private Birth birth;
	private Nation nation;
	private Team team;
	private Contract contract;

	private Footballer() {
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

}