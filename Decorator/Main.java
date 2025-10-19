package Decorator;

public class Main {
    public static void main(String[] args) {
        BasicKnight knight = new BasicKnight();
        knight.setWeapon("longsword");

        Speed boostedKnight = new Speed(new Shield(knight));
        boostedKnight.setSpeedBonus(25);

        boostedKnight.attack();

        System.out.println();
        System.out.println("System check:");
        System.out.println("Weapon: " + knight.getWeapon());
        Shield shield = (Shield) boostedKnight.getCharacter();
        System.out.println("Shield: " + shield.getShieldType());
        System.out.println("Speed bonus: " + boostedKnight.getSpeedBonus() + "%");
    }
}



