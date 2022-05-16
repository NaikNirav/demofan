package com.cgi.demofan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemofanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofanApplication.class, args);
		//Fan class creation and method calls
		Fan fan=new Fan();
		fan.displayStatus();
		fan.pullCordOne();
		fan.pullCordTwo();
		fan.displayStatus();
		fan.pullCordOne();
		fan.displayStatus();
	}

}
