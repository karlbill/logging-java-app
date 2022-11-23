package br.com.karlbill.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App  {
    private final static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) {
        logger.trace("Trace level message.");
        logger.debug("Debug level message.");
        logger.info("Info level message.");
        logger.warn("Warning level message.");
        logger.error("Error level message.");
        logger.fatal("Fatal level message.");
    }
}
