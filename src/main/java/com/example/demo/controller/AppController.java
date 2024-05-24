package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

	@GetMapping("/demo")
	public String demoMethod(@RequestParam(required = false) String param) {
		return param;
	}

}
