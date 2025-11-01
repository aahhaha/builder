package Observer.entities;

import Observer.core.Observer;

public class Player implements Observer {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        String message = name + " received event: " + event;
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
