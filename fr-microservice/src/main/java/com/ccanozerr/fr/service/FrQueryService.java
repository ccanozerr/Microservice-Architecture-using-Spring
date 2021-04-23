package com.ccanozerr.fr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.ccanozerr.fr.application.FrApplication;
import com.ccanozerr.fr.domain.Licence;
import com.ccanozerr.fr.dto.FootballerResponse;

import org.modelmapper.ModelMapper;

@Service
public class FrQueryService {

	@Autowired
	ApplicationEventPublisher publisher;

	@Autowired
	private FrApplication frApplication;
	@Autowired
	private ModelMapper modelMapper;
	
	public FootballerResponse getFootballer(String licence) {
		publisher.publishEvent(licence);
		var footballer = frApplication.getFootballerInfo(Licence.valueOf(licence));
		if(footballer.isPresent())
			return modelMapper.map(footballer.get(), FootballerResponse.class);
		throw new IllegalArgumentException("Cannot find footballer");
	}

}
