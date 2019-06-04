package com.dy.platform.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args); 
	}
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name){
		return "hello world"+name+" from port " + port;
	}
	
	/*@RequestMapping("/getHello1")
	public String home(){
		return "hello world from port " + port;
	}
	
	@RequestMapping("/getHello2")
	public String home2(){
		return "hello world2 from port " + port;
	}*/

}
