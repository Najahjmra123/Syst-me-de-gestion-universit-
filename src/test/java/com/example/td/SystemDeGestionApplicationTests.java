package com.example.td;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootApplication
@EntityScan("com.example.td")
class SystemDeGestionApplicationTests {

	@Test
	void contextLoads() {
	}

}
