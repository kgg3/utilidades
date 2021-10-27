package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.example.services.PersonasService;


@SpringBootApplication
@Controller
public class Demo2Application {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Demo2Application.class, args);
		PersonasService service = applicationContext.getBean(PersonasService.class);
        service.inicializarBBDD();
	}
	
}
