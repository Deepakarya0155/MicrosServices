package com.namming.server.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.namming.server.config.FeginClientForNammingClient;

@RestController
@RequestMapping("c2")
public class TestController {

	@Autowired
	Environment env;
	
	@Autowired
	FeginClientForNammingClient client;
	
	
	@GetMapping("test")
	public  String f1() {
		RequestDO request=new RequestDO();
		request.setName("FFFF");
		request.setAge("AAAa");
		
		Map header=new HashMap<>();
		header.put("FROM","Fegin");
		ResponseEntity response=client.test(request, header);
		System.out.println("Calle completed"+response);
		return "Success";
	}
}
