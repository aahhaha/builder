package Decorator;

public class BasicKnight implements ICharacter {
    private String weapon = "sword";

    @Override
    public void attack() {
        System.out.println("Knight attacks with a " + weapon + ".");
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}