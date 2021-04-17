package com.ccanozerr.fr.event;

import com.ccanozerr.fr.domain.Licence;
import com.ccanozerr.fr.domain.metadata.annotations.BusinessEvent;

@BusinessEvent
public class FootballerEvent {

	private Licence licence;

	public FootballerEvent(Licence licence) {
		this.licence = licence;
	}

	public Licence getLicence() {
		return licence;
	}

	@Override
	public String toString() {
		return "FootballerEvent [licence=" + licence + "]";
	}

}
