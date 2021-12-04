package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;

public class Position {

    private int horizontalPosition = 0;
    private int depth = 0;
    private int aim = 0;

    public void processNavigationCommands (ArrayList<NavigationCommand> commands) {
        for (NavigationCommand command : commands) { 
            if (command.getDirection().equals("forward")) this.move(command.getSteps());
            else if (command.getDirection().equals("down")) this.aimDown(command.getSteps());
            else if (command.getDirection().equals("up")) this.aimUp(command.getSteps());
        }
    }

    public void move (int steps) {
        this.horizontalPosition += steps;
        this.downward (steps * this.getAim());
    }

    public void aimDown (int steps) {
        this.aim += steps;
    }

    public void aimUp (int steps) {
        this.aim -= steps;        
    }

    public void downward (int steps) {
        this.depth += steps;
    }

    public int getHorizontalPosition () {
        return this.horizontalPosition;
    }

    public int getDepth () {
        return this.depth;
    }

    public int getAim () {
        return this.aim;
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
