public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new GameCharacter.Builder()
                .setName("Arthas")
                .setRole("Warrior")
                .setHealth(200)
                .setStrength(90)
                .setAgility(40)
                .setWeapon("Sword")
                .setArmor("Heavy Plate")
                .build();

        GameCharacter archer = new GameCharacter.Builder()
                .setName("Legolas")
                .setRole("Archer")
                .setHealth(120)
                .setStrength(60)
                .setAgility(95)
                .setWeapon("Bow")
                .setArmor("Leather Armor")
                .build();

        System.out.println(warrior);
        System.out.println(archer);
    }
}

