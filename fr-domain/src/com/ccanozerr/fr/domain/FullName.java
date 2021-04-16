package com.ccanozerr.fr.domain;

import java.util.Objects;

public class FullName {

	private final String firstName;
	private final String midName;
	private final String lastName;
	private final String nickName;

	private FullName(String firstName, String midName, String lastName, String nickName) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.nickName = nickName;
	}

	public static FullName valueOf(String firstName, String midName, String lastName, String nickName) {
		Objects.requireNonNull(firstName);
		Objects.requireNonNull(lastName);
		return new FullName(firstName, midName, lastName, nickName);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMidName() {
		return midName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickName() {
		return nickName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((midName == null) ? 0 : midName.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
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
		FullName other = (FullName) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (midName == null) {
			if (other.midName != null)
				return false;
		} else if (!midName.equals(other.midName))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName + ", nickName="
				+ nickName + "]";
	}

}
