package com.ccanozerr.fr.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.ccanozerr.fr.domain.metadata.enumtypes.Country;
import com.ccanozerr.fr.domain.metadata.enumtypes.Currency;
import com.ccanozerr.fr.domain.metadata.enumtypes.League;
import com.ccanozerr.fr.domain.metadata.enumtypes.Position;
import com.ccanozerr.fr.domain.metadata.enumtypes.Role;
import com.ccanozerr.hr.validation.annotation.Licence;

public class CreateFootballerRequest {

	@Licence
	private String licence;
	@NotEmpty
	private String firstName;
	private String midName;
	@NotEmpty
	private String lastName;
	private String nickName;
	@NotEmpty
	private LocalDate birthDay;
	@NotEmpty
	private Country birthCountry;
	@NotEmpty
	private Country firstNation;
	private Country secondNation;
	private Country otherNation;
	@NotEmpty
	private String teamName;
	private String teamNickName;
	@NotEmpty
	private int teamFoundYear;
	@NotEmpty
	private League league;
	@NotEmpty
	private int contractStart;
	@NotEmpty
	private int contractEnd;
	@NotEmpty
	@Min(10_000)
	private Double salary;
	@NotEmpty
	private Currency salaryCurrency;
	@NotEmpty
	private Position mainPosition;
	@NotEmpty
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
		CreateFootballerRequest other = (CreateFootballerRequest) obj;
		if (licence == null) {
			if (other.licence != null)
				return false;
		} else if (!licence.equals(other.licence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreateFootballerRequest [licence=" + licence + ", firstName=" + firstName + ", midName=" + midName
				+ ", lastName=" + lastName + ", nickName=" + nickName + ", birthDay=" + birthDay + ", birthCountry="
				+ birthCountry + ", firstNation=" + firstNation + ", secondNation=" + secondNation + ", otherNation="
				+ otherNation + ", teamName=" + teamName + ", teamNickName=" + teamNickName + ", teamFoundYear="
				+ teamFoundYear + ", league=" + league + ", contractStart=" + contractStart + ", contractEnd="
				+ contractEnd + ", salary=" + salary + ", salaryCurrency=" + salaryCurrency + ", mainPosition="
				+ mainPosition + ", mainRole=" + mainRole + "]";
	}

}
