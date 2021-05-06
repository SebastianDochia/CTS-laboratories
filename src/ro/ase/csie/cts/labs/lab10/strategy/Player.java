package ro.ase.csie.cts.labs.lab10.strategy;

public class Player {

    String userName;
    int playTime;
    int exp;

    BonusStrategyInterface bonusCampaign = null;

    public Player(String userName, int playTime, int exp) {
        this.userName = userName;
        this.playTime = playTime;
        this.exp = exp;
    }

    public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
        this.bonusCampaign = bonusCampaign;
    }

    public void getExp(int pointsReceived) {
        if(this.bonusCampaign != null) {
            this.bonusCampaign.getBonusPoints(pointsReceived, this);
        }
    }
}
