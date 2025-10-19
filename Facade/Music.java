package Facade;

public class Music {
    private String currentTrack = "None";

    public void playMusic() {
        currentTrack = "Morning Vibes Playlist";
        System.out.println("Now playing: " + currentTrack);
    }

    public String getCurrentTrack() {
        return currentTrack;
    }
}
