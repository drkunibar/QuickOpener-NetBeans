package com.sessonad.oscommands.commands;

import com.sessonad.oscommands.detector.OperatingSystem;

/**
 * Implementation of {@link Commands} for Cinnamon.
 */
public class LinuxCinnamonCommands extends Commands {

    @Override
    public OperatingSystem getOperatingSystem() {
        return OperatingSystem.LINUX_CINNAMON;
    }
}
