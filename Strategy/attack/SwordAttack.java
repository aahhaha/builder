package Strategy.attack;

public class SwordAttack implements AttackStrategy {
    public String getDefaultAttackDescription() {
        return defaultAttackDescription;
    }

    public void setDefaultAttackDescription(String defaultAttackDescription) {
        this.defaultAttackDescription = defaultAttackDescription;
    }

    private String defaultAttackDescription = "Attacking with a sword";
    @Override
    public void attack() {
        System.out.println(defaultAttackDescription);
    }
}

