package com.ccanozerr.fr.event;

import com.ccanozerr.fr.domain.Licence;

public class FootballerCreateEvent extends FootballerEvent {

	public FootballerCreateEvent(Licence licence) {
		super(licence);
	}

}
