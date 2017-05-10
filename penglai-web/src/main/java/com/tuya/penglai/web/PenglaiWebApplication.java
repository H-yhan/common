
package com.tuya.penglai.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:conf/ds_penglai.xml")
@ComponentScan({ "com.tuya.penglai.*" })
@SpringBootApplication
public class PenglaiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PenglaiWebApplication.class, args);
	}
}
