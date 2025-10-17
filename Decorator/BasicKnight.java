package Decorator;

public class BasicKnight implements ICharacter {
    @Override
    public void attack() {
        System.out.println("Knight attacks");
    }
}