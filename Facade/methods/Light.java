package Facade.methods;

public class Light {
    private String status = "off";

    public void turnOn() {
        status = "on";
        System.out.println("Lights turned " + status + ".");
    }

    public String getStatus() {
        return status;
    }
}
