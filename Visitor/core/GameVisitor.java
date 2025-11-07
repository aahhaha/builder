package Visitor.core;

import Visitor.entities.Warrior;
import Visitor.entities.Mage;
import Visitor.entities.Archer;

public interface GameVisitor {
    void visit(Warrior warrior);
    void visit(Mage mage);
    void visit(Archer archer);
}
