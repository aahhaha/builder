package Facade;

public class SmartHomeFacade {
    private final Light lights;
    private final Music music;
    private final Climate climate;

    public SmartHomeFacade() {
        lights = new Light();
        music = new Music();
        climate = new Climate();
    }

    public void goodMorning() {
        System.out.println("Good morning mode:");
        lights.turnLight();
        climate.setClimate();
        music.playMusic();
    }
}
