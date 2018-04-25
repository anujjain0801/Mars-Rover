package com.eventmobi.rover.commands;

import com.eventmobi.rover.MarsRover;

public interface Command {

    public void execute(final MarsRover rover);

}
