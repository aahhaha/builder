package Visitor.core;

import Visitor.core.GameVisitor;

public interface GameElement {
    void accept(GameVisitor visitor);
}
