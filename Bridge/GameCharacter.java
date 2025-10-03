package Bridge;

public abstract class GameCharacter {
    private Outfit outfit;

    public GameCharacter(Outfit outfit) {
        this.outfit = outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public void showStyle() {
        System.out.print(type() + " wears " + outfit.name() + ": ");
        outfit.special(type());
    }

    protected abstract String type();
}
