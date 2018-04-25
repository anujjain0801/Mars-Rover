package com.eventmobi.rover.commands;

import com.eventmobi.rover.MarsRover;

public class RotateLeftCommand implements Command {

    @Override
    public void execute(final MarsRover rover) {
        rover.turnLeft();
    }

}
