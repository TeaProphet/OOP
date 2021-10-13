package edu.csf.oop.java.schedule;

import edu.csf.oop.java.schedule.console.GlobalInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger("info.logger");
    public static void main(String[] args) {
        logger.info("Starting schedule program.");
        GlobalInterface.start();
        logger.info("Ending schedule program");
    }
}
