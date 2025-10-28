package Facade.methods;

public class Climate {
    private String temperatureStatus = "Normal";

    public void setComfortTemperature() {
        temperatureStatus = "Comfort temperature set to 22°C";
        System.out.println(temperatureStatus);
    }

    public String getTemperatureStatus() {
        return temperatureStatus;
    }
}
