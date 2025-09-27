package Adapter.game;

import Adapter.old.OldWarrior;

public class WarriorAdapter implements IGameCharacter {
    private final OldWarrior warrior;

    public WarriorAdapter(OldWarrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public void move(String direction) {
        warrior.walk(direction);
    }

    @Override
    public void attack() {
        warrior.slashSword();
    }
}
