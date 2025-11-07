package Observer.core;

import java.util.ArrayList;
import java.util.List;
import Observer.entities.Player;

public class GameServer implements Subject {
    private final List<Observer> players = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        String joinMessage = ((Player) observer).getName() + " joined the server.";
        players.add(observer);
        System.out.println(joinMessage);
    }

    @Override
    public void detach(Observer observer) {
        String leaveMessage = ((Player) observer).getName() + " left the server.";
        players.remove(observer);
        System.out.println(leaveMessage);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer player : players) {
            player.update(event);
        }
    }

    public void newEvent(String event) {
        String eventMessage = "[SERVER EVENT] " + event;
        System.out.println(eventMessage);
        notifyObservers(event);
    }

    public int getPlayerCount() {
        return players.size();
    }
}
