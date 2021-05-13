package ro.ase.csie.cts.labs.lab11.command;

public class AutosaveModule implements GameModuleInterface {

    int freq;

    public AutosaveModule(int freq) {
        this.freq = freq;
    }


    @Override
    public void doTheTask(String details) {
        System.out.println("Autosaving for " + details);
    }


}
