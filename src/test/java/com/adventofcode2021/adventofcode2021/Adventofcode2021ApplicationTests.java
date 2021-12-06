package com.adventofcode2021.adventofcode2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Adventofcode2021ApplicationTests {

	@Test
	void gammaRateCalculationIsCorrect () {
		List<String> testInput = new ArrayList<String>(Arrays.asList(new String[]{"000000101010"}));
		PowerConsumption powerConsumption = new PowerConsumption(testInput);
		assertEquals (42, powerConsumption.getGammaRate());
	}

	@Test
	void epsilonRateCalculationIsCorrect () {
		List<String> testInput = new ArrayList<String>(Arrays.asList(new String[]{"000000101010"}));
		PowerConsumption powerConsumption = new PowerConsumption(testInput);
		assertEquals (4053, powerConsumption.getEpsilonRate());
	}

	@Test
	void powerConsumptionCalculationIsCorrect () {
		List<String> testInput = new ArrayList<String>(Arrays.asList(new String[]{"000000101010"}));
		PowerConsumption powerConsumption = new PowerConsumption(testInput);
		assertEquals (42*4053, powerConsumption.getPowerConsumption());
	}

}
