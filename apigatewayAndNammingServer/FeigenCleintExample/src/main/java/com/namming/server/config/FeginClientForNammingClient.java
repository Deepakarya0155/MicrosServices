package com.namming.server.config;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.namming.server.controllers.RequestDO;

//@FeignClient(name="c1",url="http://localhost:8081")
@FeignClient(name="CLIENT")
public interface FeginClientForNammingClient {

	
	@PostMapping("c1/test")
	public ResponseEntity test(@RequestBody RequestDO request,@RequestHeader Map header);
}
