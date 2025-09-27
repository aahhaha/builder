package Adapter;

import Adapter.game.IGameCharacter;
import Adapter.game.MageAdapter;
import Adapter.game.WarriorAdapter;
import Adapter.old.OldMage;
import Adapter.old.OldWarrior;

public class Main {
    public static void main(String[] args) {
        IGameCharacter warrior = new WarriorAdapter(new OldWarrior());
        IGameCharacter mage = new MageAdapter(new OldMage());

        warrior.move("north");
        warrior.attack();

        mage.move("east");
        mage.attack();
    }
}
