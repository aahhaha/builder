package Observer;

import Observer.core.GameServer;
import Observer.entities.Player;

public class Main {
    public static void main(String[] args) {
        GameServer server = new GameServer();

        Player player1 = new Player("Aibyn");
        Player player2 = new Player("Assem");
        Player player3 = new Player("Farkhad");

        server.attach(player1);
        server.attach(player2);
        server.attach(player3);

        String firstEvent = "New quest: Save the Kingdom!";
        server.newEvent(firstEvent);

        server.detach(player2);

        String secondEvent = "Boss appeared in the Dark Forest!";
        server.newEvent(secondEvent);

        String summary = "Active players: " + server.getPlayerCount();
        System.out.println(summary);
    }
}
