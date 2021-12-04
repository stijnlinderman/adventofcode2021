package com.adventofcode2021.adventofcode2021;

import java.util.ArrayList;

public class NavigationCommand {
    
    private String direction;
    private int steps;

    public NavigationCommand (String commandAsString) {
        String[] commandElements = commandAsString.split(" ");
        this.direction = commandElements[0];
        this.steps = Integer.parseInt(commandElements[1]);
    }

    public static ArrayList<NavigationCommand> getNavigationCommandsFromStrings (ArrayList<String> commandsAsStrings) {
        ArrayList<NavigationCommand> commands = new ArrayList<NavigationCommand>();
        commandsAsStrings.forEach((String command) -> commands.add(new NavigationCommand(command)));
        return commands;
    }

    public String getDirection () {
        return this.direction;
    }

    public int getSteps () {
        return this.steps;
    }
}
