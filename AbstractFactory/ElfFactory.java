package AbstractFactory;

public class ElfFactory implements RaceFactory {
    public Warrior createWarrior() { return new ElfWarrior(); }
    public Archer createArcher() { return new ElfArcher(); }
}
