package com.adventofcode2021.adventofcode2021;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Input {

	public static ArrayList<Integer> getInput () {

		ArrayList<Integer> input = new ArrayList<Integer>();

		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("input.txt");
		BufferedReader bufferedInputReader = new BufferedReader(new InputStreamReader(inputStream));
		bufferedInputReader.lines().forEach((String line) -> input.add(Integer.parseInt(line)));

		return input;
	}
}