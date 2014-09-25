package demibenari;

import demibenari.workers.Worker;
import demibenari.workers.WorkerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Preferred way, using Slf4J, using a Facade to encapsulate the logging framework used
 * by configuration.
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class SLF4JMain {
    private static Logger logger = LoggerFactory.getLogger(SLF4JMain.class);

    public static void main(String[] args) {
        logger.info("Running the Application");

        Worker worker = new WorkerImpl(1);

        worker.doTheWork();

        logger.info("Finished running the application");
    }
}
