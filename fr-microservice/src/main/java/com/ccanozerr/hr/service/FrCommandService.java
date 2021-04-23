package com.ccanozerr.hr.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccanozerr.fr.application.FrApplication;
import com.ccanozerr.fr.domain.Footballer;
import com.ccanozerr.fr.dto.CreateFootballerRequest;
import com.ccanozerr.fr.dto.CreateFootballerResponse;

@Service
public class FrCommandService {

	@Autowired
	private FrApplication frApplication;
	@Autowired
	private ModelMapper modelMapper;
	
	public CreateFootballerResponse createFootballer(CreateFootballerRequest request) {
		var footballer = modelMapper.map(request, Footballer.class);
		Footballer createdFootbaler = frApplication.createFootballer(footballer);
		return modelMapper.map(createdFootbaler, CreateFootballerResponse.class);
	}
}
