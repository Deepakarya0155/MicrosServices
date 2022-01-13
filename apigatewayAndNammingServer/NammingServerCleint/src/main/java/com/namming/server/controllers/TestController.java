package com.namming.server.controllers;

import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("c1")
public class TestController {

	@Autowired
	Environment env;
	
	@GetMapping("test")
	public String f1() {
		return "Service running  on "+env.getProperty("local.server.port");
	}
	
	@PostMapping("test")
	public ResponseEntity test(@RequestBody RequestDO request,@RequestHeader Map header) {
		
		System.out.println(request);
		header.forEach((K,V)->System.out.println(K+" -> "+V));
		
		ResponseDO respone=new ResponseDO();
		respone.setResponseCode(0);
		respone.setResponseMsg("Success");
		
		return new ResponseEntity(respone,HttpStatus.OK); 
	}
}
