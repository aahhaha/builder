package Decorator;

public class Main {
    public static void main(String[] args) {
        ICharacter knight = new BasicKnight();
        ICharacter boostedKnight = new Speed(new Shield(knight));

        boostedKnight.attack();
    }
}
