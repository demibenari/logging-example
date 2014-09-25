package demibenari.workers;

import org.apache.log4j.Logger;

/**
 * Log4J worker that uses the Log4J Framework and prints the out put to the Console and a file.
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class Log4JWorker extends AbstractWorker {
    protected final Logger logger = Logger.getLogger(Log4JWorker.class);

    public Log4JWorker(int id) {
        super(id);
    }

    @Override
    protected void beforeWork() {

        // This condition is checked for not creating this string concatenation a new strings to be created,
        // Imagine if this log event would happen 1000 times or more in a second.
        // That couldn't be good...

        if(logger.isDebugEnabled()) {
           for (int index = 0 ; index < 15 ; index++) {
                logger.debug("Working class for id: " + getId() +
                             " preparing to Work again, try number: " + (index + 1));
           }
        }
    }

    @Override
    protected void afterWork() {
        // Some more ugly checks just in case...
        if(logger.isDebugEnabled()) {
            logger.debug("Working class for id: " + getId() + " Finished working!");
        }
    }

    @Override
    public void doTheActualWork() {
        // Checking the condition again with another log level
        if(logger.isInfoEnabled()) {
            logger.info("Working class for id: " +  getId() + " Finished working!");
        }
    }
}
