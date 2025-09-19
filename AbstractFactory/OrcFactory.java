package AbstractFactory;

public class OrcFactory implements RaceFactory {
    public Warrior createWarrior() {  return new OrcWarrior(); }
    public Archer createArcher() { return new OrcArcher(); }
}
