package com.ccanozerr.fr.event;

import com.ccanozerr.fr.domain.Licence;

public class FootballerDeleteEvent extends FootballerEvent {

	public FootballerDeleteEvent(Licence licence) {
		super(licence);
	}

}
