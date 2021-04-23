package com.ccanozerr.fr.domain.metadata.annotations;

import com.ccanozerr.fr.event.FootballerEvent;

public interface EventPublisher {
	
	void publish(FootballerEvent footballerEvent);

}
