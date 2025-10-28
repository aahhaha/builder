package Strategy;

public class Main {
    public static void main(String[] args) {
        Character hero = new Character(new SwordAttack());
        hero.performAttack();

        hero.setStrategy(new BowAttack());
        hero.performAttack();

        hero.setStrategy(new MagicAttack());
        hero.performAttack();
    }
}

