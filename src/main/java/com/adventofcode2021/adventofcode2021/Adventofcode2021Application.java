package com.adventofcode2021.adventofcode2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Adventofcode2021Application {

	public static void main(String[] args) {
		SpringApplication.run(Adventofcode2021Application.class, args);
		PuzzleSolver.printAnswer(PuzzleSolver.getAnswer(new Input().getInput()));
	}

}


