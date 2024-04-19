package com.yuseo.blackmagic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class BlackMagicApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BlackMagicApplication.class, args);
	}

}
