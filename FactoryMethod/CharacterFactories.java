package FactoryMethod;

import java.util.Map;

public class CharacterFactories {
    private static final Map<CharacterType, CharacterFactory> REGISTRY = Map.of(
            CharacterType.WARRIOR, new WarriorFactory(),
            CharacterType.ARCHER, new ArcherFactory()
    );

    public static CharacterFactory get(CharacterType type) {
        return REGISTRY.get(type);
    }
}
