package Decorator;

public class Shield extends CharacterDecorator {
    public Shield(ICharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        System.out.println("Shield");
        super.attack();
    }
}