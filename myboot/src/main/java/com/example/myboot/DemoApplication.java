package com.example.myboot;

import com.example.myboot.aop.MyAspect;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example.myboot.aop"})
public class DemoApplication {

	@Bean(name = "myAspect")
	public MyAspect init(){
		return new MyAspect();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
