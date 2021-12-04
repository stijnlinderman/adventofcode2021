package com.adventofcode2021.adventofcode2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Adventofcode2021ApplicationTests {

	ArrayList<Integer> testInput = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,2,1,3,4,4}));

	@Test
	void threeIncreasesIsThreeIncreases() {
		assertEquals(3, PuzzleSolver.getAmountOfTimesThatDepthIncreases(testInput));
	}

}
