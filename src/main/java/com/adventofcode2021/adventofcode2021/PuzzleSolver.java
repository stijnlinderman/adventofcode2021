package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;

public class PuzzleSolver {

    public static int getAnswer (ArrayList<Integer> input) {
        return getAmountOfTimesThatDepthIncreasesInThreeMeasurementWindows(input);
    }

    public static void printAnswer (int answer) {
        System.out.println("\n#### THE ANSWER ####\n\n" + answer + "\n\n#### END OF ANSWER ####\n");
    }

    public static int getAmountOfTimesThatDepthIncreasesInThreeMeasurementWindows (ArrayList<Integer> measurements) {
        int amount = 0;

        for (int i = 0; i < (measurements.size() - 3); i++) {
            int threeMeasurementsWindow = measurements.get(i)+measurements.get(i+1)+measurements.get(i+2);
            int nextThreeMeasurementsWindow = measurements.get(i+1)+measurements.get(i+2)+measurements.get(i+3);
            if (nextThreeMeasurementsWindow > threeMeasurementsWindow) {
                amount++;
            }
        }

        return amount;
    }
    
}
