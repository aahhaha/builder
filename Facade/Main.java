package Facade;

import Facade.facade.SmartHomeFacade;
import Facade.methods.Climate;
import Facade.methods.Light;
import Facade.methods.Music;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.goodMorning();

        System.out.println();
        System.out.println("Light status: " + home.getLight().getStatus());
        System.out.println("Current track: " + home.getMusic().getCurrentTrack());
        System.out.println("Climate: " + home.getClimate().getTemperatureStatus());
    }
}
