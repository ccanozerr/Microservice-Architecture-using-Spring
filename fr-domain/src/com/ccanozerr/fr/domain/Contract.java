package com.ccanozerr.fr.domain;

import java.time.Year;
import java.util.Objects;

import com.ccanozerr.fr.domain.metadata.enumtypes.Currency;

public class Contract {

	private final Year contractStart;
	private final Year contractEnd;
	private final Double salary;
	private final Currency salaryCurrency;

	private Contract(Year contractStart, Year contractEnd, Double salary, Currency salaryCurrency) {
		this.contractStart = contractStart;
		this.contractEnd = contractEnd;
		this.salary = salary;
		this.salaryCurrency = salaryCurrency;
	}

	public static Contract valueOf(Year contractStart, Year contractEnd, Double salary, Currency salaryCurrency) {
		Objects.requireNonNull(contractStart);
		Objects.requireNonNull(contractEnd);
		Objects.requireNonNull(salary);
		Objects.requireNonNull(salaryCurrency);
		if (salary < 0.0) {
			throw new IllegalArgumentException("This is not a valid salary!");
		}
		return new Contract(contractStart, contractEnd, salary, salaryCurrency);
	}

	public Year getContractStart() {
		return contractStart;
	}

	public Year getContractEnd() {
		return contractEnd;
	}

	public Double getSalary() {
		return salary;
	}

	public Currency getSalaryCurrency() {
		return salaryCurrency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractEnd == null) ? 0 : contractEnd.hashCode());
		result = prime * result + ((contractStart == null) ? 0 : contractStart.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((salaryCurrency == null) ? 0 : salaryCurrency.hashCode());
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
		Contract other = (Contract) obj;
		if (contractEnd == null) {
			if (other.contractEnd != null)
				return false;
		} else if (!contractEnd.equals(other.contractEnd))
			return false;
		if (contractStart == null) {
			if (other.contractStart != null)
				return false;
		} else if (!contractStart.equals(other.contractStart))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (salaryCurrency != other.salaryCurrency)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contract [contractStart=" + contractStart + ", contractEnd=" + contractEnd + ", salary=" + salary
				+ ", salaryCurrency=" + salaryCurrency + "]";
	}

}
