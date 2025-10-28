package Strategy;

public class Character {
    private AttackStrategy strategy;

    public Character(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAttack() {
        strategy.attack();
    }

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }
}
