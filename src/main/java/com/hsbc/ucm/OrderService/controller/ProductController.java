package com.hsbc.ucm.OrderService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product/")
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	@GetMapping("/message")
	public String getMessage() {
		log.info("Entered Inside getMessage()");
		return "Hello World , Good Morning";
	}

}
