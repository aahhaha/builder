package Adapter.game;

import Adapter.old.OldMage;

public class MageAdapter implements IGameCharacter {
    private final OldMage mage;

    public MageAdapter(OldMage mage) {
        this.mage = mage;
    }

    @Override
    public void move(String direction) {
        mage.go(direction);
    }

    @Override
    public void attack() {
        mage.casteNails();
    }
}
