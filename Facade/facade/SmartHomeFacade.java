package Facade.facade;

import Facade.methods.Climate;
import Facade.methods.Light;
import Facade.methods.Music;

public class SmartHomeFacade {
    private Light light = new Light();
    private Music music = new Music();
    private Climate climate = new Climate();

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
