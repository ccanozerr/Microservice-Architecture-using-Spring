package com.ccanozerr.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.ccanozerr.fr.dto.FootballerResponse;
import com.ccanozerr.hr.service.FrQueryService;
import com.ccanozerr.hr.validation.annotation.Licence;

@RestController 
@RequestMapping("footballers")
@RequestScope
@CrossOrigin
public class FrQueryController {
	
	@Autowired
	private FrQueryService frQueryService;
	
	@GetMapping("{licence}")
	public FootballerResponse getFootballer(@PathVariable @Licence String licence) {
		return frQueryService.getFootballer(licence);
	}
	
	

}
