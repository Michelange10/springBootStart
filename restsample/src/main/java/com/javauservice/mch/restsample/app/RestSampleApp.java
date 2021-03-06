package com.javauservice.mch.restsample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javauservice.mch.restsample")

public class RestSampleApp {
/*
    SpringbootApplication 类继承 SpringBootServletInitializer 并重写 configure 方法

	@SpringBootApplication
	public class SpringbootApplication extends SpringBootServletInitializer {

		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(SpringbootApplication.class);
		}*/


	public static void main(String[] args) {
		System.out.println("start.....");
		SpringApplication.run(RestSampleApp.class, args);
		System.out.println("start  success .....");
	}
}
