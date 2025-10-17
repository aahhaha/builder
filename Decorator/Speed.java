package Decorator;

public class Speed extends CharacterDecorator {
    public Speed(ICharacter character) {
        super(character);
    }

    @Override
    public void attack() {
        System.out.println("Speed");
        super.attack();
    }
}
