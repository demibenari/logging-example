package demibenari;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Running the Application");

        DoesWork worker1 = new DoesWork(1);

        worker1.doTheWork();

        logger.info("Finished running the application");

    }
}
