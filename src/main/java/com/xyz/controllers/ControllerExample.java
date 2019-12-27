package com.xyz.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.CustomerDto;

@RestController
@RequestMapping("/Example")
public class ControllerExample {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showExample() {
		return "Example";

	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public CustomerDto insertdto(@RequestBody CustomerDto dto) {

		System.out.println(dto.toString());
		return dto;

	}

}
