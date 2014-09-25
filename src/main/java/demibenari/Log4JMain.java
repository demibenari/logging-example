package demibenari;

import demibenari.workers.Log4JWorker;
import demibenari.workers.Worker;
import org.apache.log4j.Logger;

/**
 * A newer way of Logging, using an outer Log4J framework
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class Log4JMain {
    private static Logger logger = Logger.getLogger(Log4JMain.class);

    public static void main(String[] args) {
        logger.info("Running the Application");

        Worker worker = new Log4JWorker(1);

        worker.doTheWork();

        logger.info("Finished running the application");
    }
}
