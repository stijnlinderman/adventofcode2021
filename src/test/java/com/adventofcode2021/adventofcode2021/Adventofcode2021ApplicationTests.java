package com.adventofcode2021.adventofcode2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Adventofcode2021ApplicationTests {

	@Test
	void positionIsOneForwardAfterOneForward () {
		Position position = new Position();
		ArrayList<NavigationCommand> commands = NavigationCommand.getNavigationCommandsFromStrings(new ArrayList<String>(Arrays.asList(new String[]{"forward 1"})));
		position.processNavigationCommands(commands);
		assertEquals(1, position.getHorizontalPosition());
		assertEquals(0, position.getDepth());
	}

	@Test
	void positionAfterTwoDownOneForward () {
		Position position = new Position();
		ArrayList<NavigationCommand> commands = NavigationCommand.getNavigationCommandsFromStrings(new ArrayList<String>(Arrays.asList(new String[]{"down 2", "forward 1"})));
		position.processNavigationCommands(commands);
		assertEquals(1, position.getHorizontalPosition());
		assertEquals(2, position.getDepth());
	}

}
