package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Input {

	public static ArrayList<String> getInput () {
		ArrayList<String> input = new ArrayList<String>();

		try {
			FileReader fileReader = new FileReader ("input.txt");
			Scanner scanner = new Scanner(fileReader);

			while (scanner.hasNextLine()) {
				input.add(scanner.nextLine());
			}
			scanner.close();

		} catch (FileNotFoundException exception) {
			System.out.println ("Oops, file not found.");
			exception.printStackTrace();
		}

		return input;
	}
}


