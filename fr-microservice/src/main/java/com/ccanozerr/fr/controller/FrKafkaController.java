package com.ccanozerr.fr.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ccanozerr.fr.application.FrApplication;
import com.ccanozerr.fr.domain.Footballer;
import com.ccanozerr.fr.dto.CreateFootballerRequest;
import com.ccanozerr.fr.dto.CreateFootballerResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FrKafkaController {
	@Autowired
	private FrApplication frApplication;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	@EventListener
	public void listenEvent(String event) {
		
	}
	@KafkaListener(topics = "hr", groupId = "hr")
	public void listen(String request) throws Exception {
		var createFootballerRequest = objectMapper.readValue(request,CreateFootballerRequest.class);
		var footballer = modelMapper.map(createFootballerRequest,Footballer.class);
		var createdFootballer = frApplication.createFootballer(footballer);
		var createdFootballerResponse = modelMapper.map(createdFootballer, CreateFootballerResponse.class);
		kafkaTemplate.send("result", objectMapper.writeValueAsString(createdFootballerResponse));
	}
	
}
