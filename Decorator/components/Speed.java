package Decorator.components;

import Decorator.base.ICharacter;

public class Speed extends CharacterDecorator {
    private int speedBonus = 20;

    public Speed(ICharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        System.out.println("Speed increased by " + speedBonus + "%.");
        super.attack();
    }

    public int getSpeedBonus() {
        return speedBonus;
    }

    public void setSpeedBonus(int speedBonus) {
        this.speedBonus = speedBonus;
    }
}