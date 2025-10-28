package Decorator.components;

import Decorator.base.ICharacter;

public class Shield extends CharacterDecorator {
    private final String shieldType = "basic shield";

    public Shield(ICharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        System.out.println("Shield equipped: " + shieldType + ".");
        super.attack();
    }

    public String getShieldType() {
        return shieldType;
    }
}