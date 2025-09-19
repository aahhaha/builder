package AbstractFactory;

public class AFMain {
    public static void main(String[] args) {
        RaceFactory elves = new ElfFactory();
        RaceFactory orcs = new OrcFactory();
        Warrior ew = elves.createWarrior();
        Archer ea = orcs.createArcher();
        Warrior ow = orcs.createWarrior();
        Archer oa = orcs.createArcher();
        ew.attack(); ea.shoot();
        ow.attack(); oa.shoot();
    }
}
