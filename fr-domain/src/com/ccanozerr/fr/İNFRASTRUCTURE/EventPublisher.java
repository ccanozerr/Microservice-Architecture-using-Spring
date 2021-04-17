package com.ccanozerr.fr.ÝNFRASTRUCTURE;

import com.ccanozerr.fr.event.FootballerEvent;

public interface EventPublisher {
	
	void publish(FootballerEvent footballerEvent);

}
