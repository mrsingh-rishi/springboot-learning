package com.demo.rishi.week1introduction.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionApplication implements CommandLineRunner {

	@Autowired
	Apple obj;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//        obj.eatApple();

		System.out.println(dbService.getData());
    }
}
