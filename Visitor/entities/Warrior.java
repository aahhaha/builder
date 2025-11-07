package Visitor.entities;

import Visitor.core.GameElement;
import Visitor.core.GameVisitor;

public class Warrior implements GameElement {
    private final String name;
    private final int attack;

    public Warrior(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }
}
