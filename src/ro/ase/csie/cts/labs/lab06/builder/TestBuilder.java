package ro.ase.csie.cts.labs.lab06.builder;

public class TestBuilder {

    // create the object
    SuperHero superHero = new SuperHero();
    // init it
    //TO DO: don't forget

    //SuperHero superHero2 = new SuperHero("Superman", 100, false, false, new Weapon(), null, new Flying(), null);

    SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100).build();

    SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200).isVillain().isWounded().setRightWeapon(new Weapon()).build();
}
