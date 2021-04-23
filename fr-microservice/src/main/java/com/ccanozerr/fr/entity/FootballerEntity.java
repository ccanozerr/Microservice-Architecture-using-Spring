package com.ccanozerr.fr.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.ccanozerr.fr.domain.metadata.enumtypes.Country;
import com.ccanozerr.fr.domain.metadata.enumtypes.Currency;
import com.ccanozerr.fr.domain.metadata.enumtypes.League;
import com.ccanozerr.fr.domain.metadata.enumtypes.Position;
import com.ccanozerr.fr.domain.metadata.enumtypes.Role;
import com.ccanozerr.hr.validation.annotation.Licence;

@Entity
@Table(name = "footballers")
public class FootballerEntity {

	@Id
	@Licence
	private String licence;

	@Column(name = "firstName")
	@NotEmpty
	private String firstName;

	@Column(name = "midName")
	private String midName;

	@Column(name = "lastName")
	@NotEmpty
	private String lastName;

	@Column(name = "nickName")
	private String nickName;

	@Column(name = "birthDay")
	@NotEmpty
	private LocalDate birthDay;

	@Column(name = "birthCountry")
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Country birthCountry;

	@Column(name = "firstNation")
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Country firstNation;

	@Column(name = "secondNation")
	@Enumerated(EnumType.STRING)
	private Country secondNation;

	@Column(name = "otherNation")
	@Enumerated(EnumType.STRING)
	private Country otherNation;

	@Column(name = "teamName")
	@NotEmpty
	private String teamName;

	@Column(name = "teamNickName")
	private String teamNickName;

	@Column(name = "teamFoundYear")
	@NotEmpty
	private int teamFoundYear;

	@Column(name = "league")
	@Enumerated(EnumType.STRING)
	@NotEmpty
	private League league;

	@Column(name = "contractStart")
	@NotEmpty
	private int contractStart;

	@Column(name = "contractEnd")
	@NotEmpty
	private int contractEnd;

	@Column(name = "salary")
	@NotEmpty
	@Min(10_000)
	private Double salary;

	@Column(name = "salaryCurrency")
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Currency salaryCurrency;

	@Column(name = "mainPosition")
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Position mainPosition;

	@Column(name = "mainRole")
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Role mainRole;

	@Version
	private int version;

	private FootballerEntity() {
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
		FootballerEntity other = (FootballerEntity) obj;
		if (licence == null) {
			if (other.licence != null)
				return false;
		} else if (!licence.equals(other.licence))
			return false;
		return true;
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
