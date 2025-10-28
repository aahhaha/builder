package Decorator.components;

import Decorator.base.ICharacter;

public abstract class CharacterDecorator implements ICharacter {
    protected ICharacter character;

    public CharacterDecorator(ICharacter character) {
        this.character = character;
    }

    @Override
    public void attack() {
        character.attack();
    }

    public ICharacter getCharacter() {
        return character;
    }
}
