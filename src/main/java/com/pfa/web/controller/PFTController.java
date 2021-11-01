package com.pfa.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pft")
public class PFTController {
	
	@GetMapping("/landing")
	public String welcome() {
		return "Welcome to PFT 2022";
	}
}
