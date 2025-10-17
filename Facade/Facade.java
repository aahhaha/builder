package Facade;

public class Facade {
    private final Graphics graphics;
    private final Audio audio;
    private final Physics physics;

    public Facade() {
        graphics = new Graphics();
        audio = new Audio();
        physics = new Physics();
    }

    public void startGame() {
        graphics.load();
        audio.play();
        physics.start();
        System.out.println("Game is ready");
    }
}
