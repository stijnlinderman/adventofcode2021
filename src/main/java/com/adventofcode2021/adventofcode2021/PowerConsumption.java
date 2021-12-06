package com.adventofcode2021.adventofcode2021;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class PowerConsumption {

	private int gammaRate;
	private int epsilonRate;

	public PowerConsumption (List<String> binaryDataInputAsListOfStrings) {
		int[][] inputAsOnesAndZeroesPerBit = getAmountOfOnesAndZeroesPerBitFromInput(binaryDataInputAsListOfStrings);
		
		StringBuilder gammaRateStringBuilder = new StringBuilder();
		StringBuilder epsilonRateStringBuilder = new StringBuilder();

		for (int binaryNumberIndex = 0; binaryNumberIndex < inputAsOnesAndZeroesPerBit.length; binaryNumberIndex++) {
			int amountOfZeroesFound = inputAsOnesAndZeroesPerBit[binaryNumberIndex][0];
			int amountOfOnesFound = inputAsOnesAndZeroesPerBit[binaryNumberIndex][1];

			gammaRateStringBuilder.append((amountOfZeroesFound > amountOfOnesFound) ? "0" : "1");
			epsilonRateStringBuilder.append((amountOfZeroesFound < amountOfOnesFound) ? "0" : "1");
		}
		
		this.gammaRate = Integer.parseInt(gammaRateStringBuilder.toString(), 2);
		this.epsilonRate = Integer.parseInt(epsilonRateStringBuilder.toString(), 2);
	}

	public static List<String> getInput () {
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("input.txt");
		List<String> binaryDataInputAsListOfStrings = new BufferedReader(new InputStreamReader(inputStream)).lines().toList();
		return binaryDataInputAsListOfStrings;
	}

	private static int[][] getAmountOfOnesAndZeroesPerBitFromInput (List<String> inputAsListOfStrings) {
		int binaryNumberSize = inputAsListOfStrings.get(0).length();
		int[][] onesAndZeroesPerBit = new int[binaryNumberSize][2];

		for (String binaryNumberAsString : inputAsListOfStrings) {
			for (int bitIndex = 0; bitIndex < binaryNumberAsString.length(); bitIndex++) {
				int bit = Integer.parseInt(binaryNumberAsString.substring(bitIndex, bitIndex+1));
				onesAndZeroesPerBit[bitIndex][bit]++;
			}
		}
		return onesAndZeroesPerBit;
	}


	public int getGammaRate () {
		return this.gammaRate;
	}

	public int getEpsilonRate () {
		return this.epsilonRate;
	}

	public int getPowerConsumption () {		
		return this.getGammaRate() * this.getEpsilonRate();
	}
}