package Builder;

public class GameCharacter {
    private final String name;
    private final String role;
    private final int health;
    private final int strength;
    private final int agility;
    private final String weapon;
    private final String armor;

    private GameCharacter(Builder builder) {
        this.name = builder.name;
        this.role = builder.role;
        this.health = builder.health;
        this.strength = builder.strength;
        this.agility = builder.agility;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    @Override
    public String toString() {
        return "This characher named \"" + name + 
        "\" is a " + role + 
        ". It has " + health + 
        " hp, " + strength + 
        " strength, " + agility + 
        " agil. Its weapon is " + weapon + 
        " and armor is " + armor;
    }


    public static class Builder {
        private String name;
        private String role;
        private int health;
        private int strength;
        private int agility;
        private String weapon;
        private String armor;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder setAgility(int agility) {
            this.agility = agility;
            return this;
        }

        public Builder setWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public GameCharacter build() {
            return new GameCharacter(this);
        }
    }
}
