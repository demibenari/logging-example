package demibenari.workers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class WorkerImpl extends AbstractWorker {
    private final Logger logger = LoggerFactory.getLogger(WorkerImpl.class);

    public WorkerImpl(int id) {
        super(id);
    }

    public void beforeWork() {
        logger.debug("Working class for id: {} preparing to Work", id);
    }

    @Override
    public void doTheActualWork() {
        logger.info("Doing dome important work for id: {}", id);
    }

    public void afterWork() {
        // Some Exception to show the way to output exceptions in the code
        try {
            int comptation = 10 / 0;
        } catch (ArithmeticException ex) {
            logger.error("I did a stupid thing dividing by 0", ex);
        }

        logger.debug("Working class for id: {} Finished working!", id);
    }
}
