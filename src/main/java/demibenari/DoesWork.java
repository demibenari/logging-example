package demibenari;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class DoesWork {
    private Logger logger = LoggerFactory.getLogger(DoesWork.class);

    private final int id;

    public DoesWork(int id) {
        this.id = id;

        logger.debug("Working class Created for id:{}", id);
    }

    protected void beforeWork() {
        logger.debug("Working class for id: {} preparing to Work", id);
    }

    public void doTheWork() {
        beforeWork();

        logger.info("Doing dome important work for id: {}", id);

        afterWork();
    }

    protected void afterWork() {
        logger.debug("Working class for id: {} Finished working!", id);
    }
}
