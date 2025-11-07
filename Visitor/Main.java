package Visitor;

import Visitor.core.StatsVisitor;
import Visitor.entities.Warrior;
import Visitor.entities.Mage;
import Visitor.entities.Archer;
import Visitor.core.GameElement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameElement> team = List.of(
                new Warrior("Fara", 80),
                new Mage("Aibyn", 60),
                new Archer("Assem", 50)
        );

        StatsVisitor stats = new StatsVisitor();

        for (GameElement element : team) {
            element.accept(stats);
        }

        System.out.println("\nTotal team attack power: " + stats.getTotalAttack());
    }
}
