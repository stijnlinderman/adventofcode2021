package com.adventofcode2021.adventofcode2021;

import java.util.List;

public class PuzzleSolver {

    public static String getAnswer (List<String> input) {
        return "" + new PowerConsumption(input).getPowerConsumption();
    }

    public static void printAnswer (String stringToPrint) {
        System.out.println("\n#### THE ANSWER ####\n\n" + stringToPrint + "\n\n#### END OF ANSWER ####\n");
    }
}
