package com.ccanozerr.fr.domain;

import java.util.Objects;

import com.ccanozerr.fr.domain.metadata.annotations.ValueObject;
import com.ccanozerr.fr.domain.metadata.enumtypes.Position;
import com.ccanozerr.fr.domain.metadata.enumtypes.Role;

@ValueObject
public class Pitch {

	private final Position mainPosition;
	private final Role mainRole;

	private Pitch(Position mainPosition, Role mainRole) {
		super();
		this.mainPosition = mainPosition;
		this.mainRole = mainRole;
	}

	public static Pitch valueOf(Position mainPosition, Role mainRole) {
		Objects.requireNonNull(mainPosition);
		Objects.requireNonNull(mainRole);
		return new Pitch(mainPosition, mainRole);
	}

	public Position getMainPosition() {
		return mainPosition;
	}

	public Role getMainRole() {
		return mainRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mainPosition == null) ? 0 : mainPosition.hashCode());
		result = prime * result + ((mainRole == null) ? 0 : mainRole.hashCode());
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
		Pitch other = (Pitch) obj;
		if (mainPosition != other.mainPosition)
			return false;
		if (mainRole != other.mainRole)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pitch [mainPosition=" + mainPosition + ", mainRole=" + mainRole + "]";
	}

}
