package org.jlhh.cpf.micros1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Micros1Application {

	public static void main(String[] args) {
		SpringApplication.run(Micros1Application.class, args);
	}
}
