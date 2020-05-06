package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/sample")
public class SampleController {

	@GetMapping(path = "/get" , produces = "application/json")
	public String get(@RequestParam String name) {
		return "Hello "+name+"!!";
	}
}
