package Decorator;

public abstract class CharacterDecorator implements ICharacter {
    protected ICharacter character;

    public CharacterDecorator(ICharacter character) {
        this.character = character;
    }

    @Override
    public void attack() {
        character.attack();
    }
}