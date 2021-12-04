package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;
import java.util.Iterator;

public class PuzzleSolver {

    public static int getAnswer (ArrayList<Integer> input) {
        return getAmountOfTimesThatDepthIncreases(input);
    }

    public static void printAnswer (int answer) {
        System.out.println("\n#### THE ANSWER ####\n\n" + answer + "\n\n#### END OF ANSWER ####\n");
    }

    public static int getAmountOfTimesThatDepthIncreases (ArrayList<Integer> measurements) {
        int amount = 0;

        for (int i = 0; i < (measurements.size() - 1); i++) {
            if (measurements.get(i+1) > measurements.get(i)) {
                amount++;
            }
        }

        return amount;
    }
    
}
