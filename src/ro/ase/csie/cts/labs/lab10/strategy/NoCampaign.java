package ro.ase.csie.cts.labs.lab10.strategy;

public class NoCampaign implements BonusStrategyInterface{
    @Override
    public void getBonusPoints(int points, Player player) {
        player.exp += points;
    }
}
