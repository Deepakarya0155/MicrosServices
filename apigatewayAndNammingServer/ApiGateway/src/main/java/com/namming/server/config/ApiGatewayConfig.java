package com.namming.server.config;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

	
	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//		Function<PredicateSpec, Buildable<Route>> fn=P->P.path("/t/**")
//				.filters(F->F.addRequestHeader("Name", "Deepak"))
//				.uri("http://192.168.1.8:8082/");
	
		return builder.routes()
//				.route(fn)
				.route(P->P.path("/c1/**").uri("lb://CLIENT"))
				.route(P->P.path("/c2/**").uri("lb://CLIENT2"))
				
				.build();
	}
}
