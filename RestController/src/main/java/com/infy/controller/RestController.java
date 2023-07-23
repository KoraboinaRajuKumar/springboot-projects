package com.infy.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/msg")
	public String msg() {
		return "hello Raj kumar";
	}

}
