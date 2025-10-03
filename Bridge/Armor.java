package Bridge;

public class Armor implements Outfit {
    @Override
    public String name() { return "Armor"; }

    @Override
    public void special(String character) {
        System.out.println(character + " feels protected by heavy armor!");
    }
}
