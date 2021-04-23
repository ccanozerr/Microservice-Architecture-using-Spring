package com.ccanozerr.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.ccanozerr.fr.dto.CreateFootballerRequest;
import com.ccanozerr.fr.dto.CreateFootballerResponse;
import com.ccanozerr.hr.service.FrCommandService;

import io.swagger.annotations.Api;

@RestController // Meta annotation
@RequestMapping("footballers")
@RequestScope
@CrossOrigin
@Api("FR Rest Api")
public class FrCommandController {
	
	@Autowired
	private FrCommandService frCommandService;
	
	@PostMapping
	public CreateFootballerResponse createFootballer(@RequestBody @Validated CreateFootballerRequest request) {
		return frCommandService.createFootballer(request);
	}

}
