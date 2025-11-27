package main.java.Task_3;

public class GameSettings {
    GameSettings(String gameName) {
        this.currentPlayers = 0;
        this.gameName = gameName;
    }

    static int maxPlayers = 3;

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    int currentPlayers;
    final String gameName;

    void addPlayer() {
        if (maxPlayers > this.currentPlayers) {
            this.currentPlayers += 1;
        }
    }

    void printGameStatus() {
        String text = "В игре '" + this.gameName + "' участвуют " + this.currentPlayers + " из " + maxPlayers + " игроков";
        System.out.println(text);
    }

    public static void main(String[] args) {
        GameSettings game_1 = new GameSettings("Первая игра");
        GameSettings game_2 = new GameSettings("Вторая игра");

        game_1.addPlayer();
        game_1.printGameStatus();
        game_1.addPlayer();
        game_1.printGameStatus();
        game_1.addPlayer();
        game_1.printGameStatus();
        game_1.addPlayer();
        game_1.printGameStatus();
        game_1.addPlayer();
        game_1.printGameStatus();

        GameSettings.setMaxPlayers(5);
        game_2.addPlayer();
        game_2.printGameStatus();
        game_2.addPlayer();
        game_2.printGameStatus();
        game_2.addPlayer();
        game_2.printGameStatus();
        game_2.addPlayer();
        game_2.printGameStatus();
        game_2.addPlayer();
        game_2.printGameStatus();
        game_2.addPlayer();
        game_2.printGameStatus();
    }
}
