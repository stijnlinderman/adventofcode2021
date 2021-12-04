package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Adventofcode2021Application {

	public static void main(String[] args) {
		SpringApplication.run(Adventofcode2021Application.class, args);
		Position position = new Position();
		
		ArrayList<NavigationCommand> commands = NavigationCommand.getNavigationCommandsFromStrings(new Input().getInput());
		position.processNavigationCommands(commands);
		position.printPositionReport();
	}

}


