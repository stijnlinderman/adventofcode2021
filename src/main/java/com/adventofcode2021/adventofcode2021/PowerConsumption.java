package com.adventofcode2021.adventofcode2021;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PowerConsumption {

	public static int getPowerConsumption () {

		List<String> input = getInput();
		int[] bitsPerBit = getBitsPerBitFromStrings(input);
		int gammaRate

		return powerConsumption;
	}

	public static List<String> getInput () {
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("input.txt");
		BufferedReader bufferedInputReader = new BufferedReader(new InputStreamReader(inputStream));
		return bufferedInputReader.lines().toList();
	}

	private static int[] getBitsPerBitFromStrings (List<String> lines) {
		int[] onesPerBit = new int[12];

		for (String line : lines) {
			String lineReversedForLoop = new StringBuilder(line).reverse().toString();
			for (int i = 0; i < lineReversedForLoop.length(); i++) {
				onesPerBit[i] += lineReversedForLoop.charAt(i);
			}	
		}

		return onesPerBit;
	}

	public static int getGammaRate () {
		return 
	}
}