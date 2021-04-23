package com.ccanozerr.fr.dto;

import java.time.LocalDate;

import com.ccanozerr.fr.domain.metadata.enumtypes.Country;
import com.ccanozerr.fr.domain.metadata.enumtypes.Currency;
import com.ccanozerr.fr.domain.metadata.enumtypes.League;
import com.ccanozerr.fr.domain.metadata.enumtypes.Position;
import com.ccanozerr.fr.domain.metadata.enumtypes.Role;

public class FootballerResponse {

	private String licence;
	private String firstName;
	private String midName;
	private String lastName;
	private String nickName;
	private LocalDate birthDay;
	private Country birthCountry;
	private Country firstNation;
	private Country secondNation;
	private Country otherNation;
	private String teamName;
	private String teamNickName;
	private int teamFoundYear;
	private League league;
	private int contractStart;
	private int contractEnd;
	private Double salary;
	private Currency salaryCurrency;
	private Position mainPosition;
	private Role mainRole;

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Country getBirthCountry() {
		return birthCountry;
	}

	public void setBirthCountry(Country birthCountry) {
		this.birthCountry = birthCountry;
	}

	public Country getFirstNation() {
		return firstNation;
	}

	public void setFirstNation(Country firstNation) {
		this.firstNation = firstNation;
	}

	public Country getSecondNation() {
		return secondNation;
	}

	public void setSecondNation(Country secondNation) {
		this.secondNation = secondNation;
	}

	public Country getOtherNation() {
		return otherNation;
	}

	public void setOtherNation(Country otherNation) {
		this.otherNation = otherNation;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamNickName() {
		return teamNickName;
	}

	public void setTeamNickName(String teamNickName) {
		this.teamNickName = teamNickName;
	}

	public int getTeamFoundYear() {
		return teamFoundYear;
	}

	public void setTeamFoundYear(int teamFoundYear) {
		this.teamFoundYear = teamFoundYear;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public int getContractStart() {
		return contractStart;
	}

	public void setContractStart(int contractStart) {
		this.contractStart = contractStart;
	}

	public int getContractEnd() {
		return contractEnd;
	}

	public void setContractEnd(int contractEnd) {
		this.contractEnd = contractEnd;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Currency getSalaryCurrency() {
		return salaryCurrency;
	}

	public void setSalaryCurrency(Currency salaryCurrency) {
		this.salaryCurrency = salaryCurrency;
	}

	public Position getMainPosition() {
		return mainPosition;
	}

	public void setMainPosition(Position mainPosition) {
		this.mainPosition = mainPosition;
	}

	public Role getMainRole() {
		return mainRole;
	}

	public void setMainRole(Role mainRole) {
		this.mainRole = mainRole;
	}

	@Override
	public String toString() {
		return "FootballerResponse [licence=" + licence + ", firstName=" + firstName + ", midName=" + midName
				+ ", lastName=" + lastName + ", nickName=" + nickName + ", birthDay=" + birthDay + ", birthCountry="
				+ birthCountry + ", firstNation=" + firstNation + ", secondNation=" + secondNation + ", otherNation="
				+ otherNation + ", teamName=" + teamName + ", teamNickName=" + teamNickName + ", teamFoundYear="
				+ teamFoundYear + ", league=" + league + ", contractStart=" + contractStart + ", contractEnd="
				+ contractEnd + ", salary=" + salary + ", salaryCurrency=" + salaryCurrency + ", mainPosition="
				+ mainPosition + ", mainRole=" + mainRole + "]";
	}

}
