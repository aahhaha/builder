package Facade;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.goodMorning();

        System.out.println();
        System.out.println("System check:");
        System.out.println("Light status: " + home.getLight().getStatus());
        System.out.println("Current track: " + home.getMusic().getCurrentTrack());
        System.out.println("Climate: " + home.getClimate().getTemperatureStatus());
    }
}
