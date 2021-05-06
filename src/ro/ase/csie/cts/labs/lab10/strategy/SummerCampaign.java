package ro.ase.csie.cts.labs.lab10.strategy;

public class SummerCampaign implements BonusStrategyInterface{
    @Override
    public void getBonusPoints(int points, Player player) {
        player.exp += (1.5 * points);
    }
}
