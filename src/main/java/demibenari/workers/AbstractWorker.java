package demibenari.workers;

/**
 * Abstract implementation of the worker lifecycle
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public abstract class AbstractWorker implements Worker {

    protected final int id;

    public AbstractWorker(int id) {
        this.id = id;
    }

    protected void beforeWork() {}

    public void doTheWork() {
        beforeWork();

        doTheActualWork();

        afterWork();
    }

    protected void afterWork() {}

    public int getId() {
        return id;
    }

    public abstract void doTheActualWork();
}
