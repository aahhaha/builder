package Builder;

import FactoryMethod.CharacterFactories;
import FactoryMethod.CharacterType;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = CharacterFactories.get(CharacterType.WARRIOR).create();
        GameCharacter archer = CharacterFactories.get(CharacterType.ARCHER).create();

        System.out.println(warrior);
        System.out.println(archer);
    }
}

