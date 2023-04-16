package com.lovetolearn.SpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping("/get")
	public String getData() {
		return "Welcome To My Running SpringAPP";
	}
}
