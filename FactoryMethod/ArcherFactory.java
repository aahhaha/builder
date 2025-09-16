package FactoryMethod;

import Builder.GameCharacter;

public class ArcherFactory implements CharacterFactory {
    @Override
    public GameCharacter create() {
        return new GameCharacter.Builder()
                .setName("Legolas")
                .setRole("Archer")
                .setHealth(120)
                .setStrength(50)
                .setAgility(90)
                .setWeapon("Bow")
                .setArmor("Leather")
                .build();
    }
}
