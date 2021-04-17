package com.ccanozerr.fr.application.business;

import java.util.Optional;

import com.ccanozerr.fr.application.FrApplication;
import com.ccanozerr.fr.domain.Footballer;
import com.ccanozerr.fr.domain.Licence;
import com.ccanozerr.fr.event.FootballerCreateEvent;
import com.ccanozerr.fr.event.FootballerDeleteEvent;
import com.ccanozerr.fr.repository.FootballerRepository;
import com.ccanozerr.fr.ÝNFRASTRUCTURE.EventPublisher;

public class StandardFrApplication implements FrApplication{
	
	private FootballerRepository footballerRepository;
	private EventPublisher eventPublisher;

	@Override
	public Footballer createFootballer(Footballer footballer) {
		var licence = footballer.getLicence();
		var createdFootballer = footballerRepository.create(footballer);
		eventPublisher.publish(new FootballerCreateEvent(licence));
		return createdFootballer;
	}

	@Override
	public Optional<Footballer> deleteFootballer(Licence licence) {
		var footballer = footballerRepository.findByLicence(licence);
		if (footballer.isEmpty())
			throw new IllegalArgumentException("Footballer does not exist");
		footballerRepository.delete(footballer.get());
		eventPublisher.publish(new FootballerDeleteEvent(licence));
		return footballer;
	}

	@Override
	public Optional<Footballer> getFootballerInfo(Licence licence) {
		return footballerRepository.findByLicence(licence);
	}

}
