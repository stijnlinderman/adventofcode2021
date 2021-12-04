package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;

public class Position {

    private int horizontalPosition = 0;
    private int depth = 0;

    public void processNavigationCommands (ArrayList<NavigationCommand> commands) {
        for (NavigationCommand command : commands) { 
            if (command.getDirection().equals("forward")) this.forward(command.getSteps());
            else if (command.getDirection().equals("up")) this.upward(command.getSteps());
            else if (command.getDirection().equals("down")) this.downward(command.getSteps());
        }
    }

    public void forward (int steps) {
        this.horizontalPosition += steps;
    }

    public void downward (int steps) {
        this.depth += steps;
    }

    public void upward (int steps) {
        this.depth -= steps;
    }

    public int getHorizontalPosition () {
        return this.horizontalPosition;
    }

    public int getDepth () {
        return this.depth;
    }

    public void printPositionReport () {
        System.out.println("\n#### POSITION REPORT ####"
        + "\n"
        + "\nHorizontal position: " + this.getHorizontalPosition()
        + "\nDepth: " + this.getDepth()
        + "\nHorizontal pos * depth = " + this.getHorizontalPosition() * this.getDepth()
        + "\n" 
        + "\n\n#### END POSITION REPORT ####\n");
    }
    
}
