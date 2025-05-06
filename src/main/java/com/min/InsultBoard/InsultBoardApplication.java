package com.min.InsultBoard;

import com.min.InsultBoard.entity.Insult;
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
            Insult insult = new Insult("F U");
			System.out.println(insult);

			insult.like();

			insult.like();

			System.out.println(insult.getLikes());
		};
	}
}
