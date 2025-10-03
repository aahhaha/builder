package Bridge;

public class Main {
    public static void main(String[] args) {
        Outfit armor = new Armor();
        Outfit robe = new Robe();

        GameCharacter knight = new Knight(armor);
        GameCharacter wizard = new Wizard(robe);

        knight.showStyle();
        wizard.showStyle();
        knight.setOutfit(robe);
        knight.showStyle();
    }
}
