package com.example.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.test01.model.Rates;
@SpringBootApplication
public class Test01Application {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("test-bean.xml");
	     // Rates objA = (Rates) context.getBean("getRates");
	      
		SpringApplication.run(Test01Application.class, args);
	}

}
