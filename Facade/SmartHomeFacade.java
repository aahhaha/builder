package Facade;

public class SmartHomeFacade {
    private final Light light = new Light();
    private final Music music = new Music();
    private final Climate climate = new Climate();

    public void goodMorning() {
        System.out.println("Good morning mode activated.");
        light.turnOn();
        climate.setComfortTemperature();
        music.playMusic();
    }

    public Light getLight() {
        return light;
    }

    public Music getMusic() {
        return music;
    }

    public Climate getClimate() {
        return climate;
    }
}
