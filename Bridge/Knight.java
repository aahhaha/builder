package Bridge;

public class Knight extends GameCharacter {
    public Knight(Outfit outfit) { super(outfit); }

    @Override
    protected String type() { return "Knight"; }
}
