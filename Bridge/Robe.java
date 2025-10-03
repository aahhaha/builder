package Bridge;

public class Robe implements Outfit {
    @Override
    public String name() { return "Robe"; }

    @Override
    public void special(String character) {
        System.out.println(character + " channels magic power through the robe!");
    }
}