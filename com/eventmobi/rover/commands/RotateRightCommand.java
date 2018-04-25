package com.thoughtworks.rover.commands;

import com.thoughtworks.rover.MarsRover;

public class RotateRightCommand implements Command {

    @Override
    public void execute(final MarsRover rover) {
        rover.turnRight();
    }

}
