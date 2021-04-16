package com.ccanozerr.fr.domain;

import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class Licence {

	private final String playerLicence;
	private static final Map<String, Licence> cache = new WeakHashMap<>();

	private Licence(String playerLicence) {
		this.playerLicence = playerLicence;
	}

	public static Licence valueOf(String playerLicence) {
		if (!isValid(playerLicence))
			throw new IllegalArgumentException("This is not a valid licence");
		var licence = cache.get(playerLicence);
		if (Objects.isNull(licence)) {
			licence = new Licence(playerLicence);
			cache.put(playerLicence, licence);
		}
		return licence;
	}

	private static boolean isValid(String value) {
		if (value == null)
			return false;
		if (!value.matches("^\\d{11}$")) {
			return false;
		}
		int[] digits = new int[11];
		for (int i = 0; i < digits.length; ++i) {
			digits[i] = value.charAt(i) - '0';
		}
		int x = digits[0];
		int y = digits[1];
		for (int i = 1; i < 5; i++) {
			x += digits[2 * i];
		}
		for (int i = 2; i <= 4; i++) {
			y += digits[2 * i - 1];
		}
		int c1 = 7 * x - y;
		if (c1 % 10 != digits[9]) {
			return false;
		}
		int c2 = 0;
		for (int i = 0; i < 10; ++i) {
			c2 += digits[i];
		}
		if (c2 % 10 != digits[10]) {
			return false;
		}
		return true;
	}

	public String getPlayerLicence() {
		return playerLicence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerLicence == null) ? 0 : playerLicence.hashCode());
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
		Licence other = (Licence) obj;
		if (playerLicence == null) {
			if (other.playerLicence != null)
				return false;
		} else if (!playerLicence.equals(other.playerLicence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Licence [playerLicence=" + playerLicence + "]";
	}

}
