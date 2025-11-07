package Visitor.core;

import Visitor.entities.Warrior;
import Visitor.entities.Mage;
import Visitor.entities.Archer;

public class StatsVisitor implements GameVisitor {
    private int totalAttack = 0;

    @Override
    public void visit(Warrior warrior) {
        System.out.println("Visiting warrior: " + warrior.getName());
        totalAttack += warrior.getAttack();
    }

    @Override
    public void visit(Mage mage) {
        System.out.println("Visiting mage: " + mage.getName());
        totalAttack += mage.getAttack();
    }

    @Override
    public void visit(Archer archer) {
        System.out.println("Visiting archer: " + archer.getName());
        totalAttack += archer.getAttack();
    }

    public int getTotalAttack() {
        return totalAttack;
    }
}
