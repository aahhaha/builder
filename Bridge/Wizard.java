package Bridge;

public class Wizard extends GameCharacter {
    public Wizard(Outfit outfit) { super(outfit); }

    @Override
    protected String type() { return "Wizard"; }
}
