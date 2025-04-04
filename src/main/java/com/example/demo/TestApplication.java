package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}


/*

spring.datasource.url=jdbc:postgresql://new-gustavodelonghi-5564.g.aivencloud.com:27533/dbLadoA?user=avnadmin&password=AVNS_557E7soJ3L2mVBzlT9O&sslmode=require
spring.datasource.username=avnadmin
spring.datasource.password=AVNS_557E7soJ3L2mVBzlT9O
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true

server.error.include-message=always*/