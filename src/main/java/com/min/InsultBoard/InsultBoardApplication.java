package com.min.InsultBoard;

import com.min.InsultBoard.entity.Insult;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InsultBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsultBoardApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Insult insult = new Insult();
			System.out.println(insult);
            insult = new Insult("F U");
			System.out.println(insult);
//			insult = new Insult("");  // causes exception
//			System.out.println(insult);
		};
	}
}
