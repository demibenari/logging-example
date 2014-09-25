package demibenari;

import demibenari.workers.ConsoleWorker;
import demibenari.workers.Worker;

/**
 * The "Old School way via "System.out.println()" like in the Stone Age!
 *
 * Created by Demi Ben-Ari on 9/25/2014.
 */
public class ConsoleLoggerMain {
    public static void main(String[] args) {
        System.out.println("Running the Application");

        Worker worker = new ConsoleWorker(1);

        worker.doTheWork();

        System.out.println("Finished running the application");
    }
}
