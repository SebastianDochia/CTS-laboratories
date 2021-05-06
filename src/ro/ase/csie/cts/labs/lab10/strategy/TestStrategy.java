package ro.ase.csie.cts.labs.lab10.strategy;

public class TestStrategy {
    public static void main(String[] args) {

        Player player = new Player("Bogdan", 10, 100);

        player.setBonusCampaign(new NoCampaign());
        player.getExp(150);

        player.setBonusCampaign(new EasterCampaign());
        player.getExp(150);

        System.out.println(player.exp);
    }
}
