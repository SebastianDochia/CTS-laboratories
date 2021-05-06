package ro.ase.csie.cts.labs.lab10.strategy;

public class EasterCampaign implements BonusStrategyInterface{
    @Override
    public void getBonusPoints(int points, Player player) {
        if(player.playTime > 5) {
            player.exp += (2*points);
        }
    }
}
