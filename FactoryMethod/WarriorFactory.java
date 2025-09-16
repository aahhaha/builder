package FactoryMethod;

import Builder.GameCharacter;

public class WarriorFactory implements CharacterFactory {
    @Override
    public GameCharacter create() {
        return new GameCharacter.Builder()
                .setName("Arthas")
                .setRole("Warrior")
                .setHealth(200)
                .setStrength(90)
                .setAgility(40)
                .setWeapon("Sword")
                .setArmor("Heavy Plate")
                .build();
    }
}
