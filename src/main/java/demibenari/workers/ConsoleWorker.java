package demibenari.workers;

/**
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class ConsoleWorker extends AbstractWorker {
    public ConsoleWorker(int id) {
        super(id);
    }

    @Override
    protected void beforeWork() {
        System.out.println("Working class for id: " + getId() + " preparing to Work");
    }

    @Override
    protected void afterWork() {
        System.out.println("Working class for id: " + getId() + " Finished working!");
    }

    @Override
    public void doTheActualWork() {
        System.out.println("Working class for id: " +  getId() + " Finished working!");
    }
}
