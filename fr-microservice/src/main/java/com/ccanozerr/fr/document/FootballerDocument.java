package com.ccanozerr.fr.document;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.ccanozerr.fr.domain.metadata.enumtypes.Country;
import com.ccanozerr.fr.domain.metadata.enumtypes.Currency;
import com.ccanozerr.fr.domain.metadata.enumtypes.League;
import com.ccanozerr.fr.domain.metadata.enumtypes.Position;
import com.ccanozerr.fr.domain.metadata.enumtypes.Role;
import com.ccanozerr.fr.validation.annotation.Licence;

@Document(collection = "footballers")
public class FootballerDocument {

	@Id
	@Licence
	private String licence;

	@Field(name = "firstName")
	@NotEmpty
	private String firstName;

	@Field(name = "midName")
	private String midName;

	@Field(name = "lastName")
	@NotEmpty
	private String lastName;

	@Field(name = "nickName")
	private String nickName;

	@Field(name = "birthDay")
	@NotEmpty
	private LocalDate birthDay;

	@Field(name = "birthCountry")
	@NotEmpty
	private Country birthCountry;

	@Field(name = "firstNation")
	@NotEmpty
	private Country firstNation;

	@Field(name = "secondNation")
	private Country secondNation;

	@Field(name = "otherNation")
	private Country otherNation;

	@Field(name = "teamName")
	@NotEmpty
	private String teamName;

	@Field(name = "teamNickName")
	private String teamNickName;

	@Field(name = "teamFoundYear")
	@NotEmpty
	private int teamFoundYear;

	@Field(name = "league")
	@NotEmpty
	private League league;

	@Field(name = "contractStart")
	@NotEmpty
	private int contractStart;

	@Field(name = "contractEnd")
	@NotEmpty
	private int contractEnd;

	@Field(name = "salary")
	@NotEmpty
	@Min(10_000)
	private Double salary;

	@Field(name = "salaryCurrency")
	@NotEmpty
	private Currency salaryCurrency;

	@Field(name = "mainPosition")
	@NotEmpty
	private Position mainPosition;

	@Field(name = "mainRole")
	@NotEmpty
	private Role mainRole;

	private FootballerDocument() {
	}

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
		return "FootballerEntity [licence=" + licence + ", firstName=" + firstName + ", midName=" + midName
				+ ", lastName=" + lastName + ", nickName=" + nickName + ", birthDay=" + birthDay + ", birthCountry="
				+ birthCountry + ", firstNation=" + firstNation + ", secondNation=" + secondNation + ", otherNation="
				+ otherNation + ", teamName=" + teamName + ", teamNickName=" + teamNickName + ", teamFoundYear="
				+ teamFoundYear + ", league=" + league + ", contractStart=" + contractStart + ", contractEnd="
				+ contractEnd + ", salary=" + salary + ", salaryCurrency=" + salaryCurrency + ", mainPosition="
				+ mainPosition + ", mainRole=" + mainRole + "]";
	}

}
