package ro.ase.csie.cts.labs.lab11.command;

public class TestCommand {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager("Background tasks");

        manager.addAsyncTask(new AsyncTask(new AutosaveModule(5), "Finishing current level", 0));
        manager.addAsyncTask(new AsyncTask(new UpdateModule(), "Version 10.5", 0));

        System.out.println("Game is running");
        manager.doNextTask();
        System.out.println("Game is running");
        manager.doNextTask();
        System.out.println("Game is running");
    }
}
