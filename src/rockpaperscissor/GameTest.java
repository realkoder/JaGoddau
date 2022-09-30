package rockpaperscissor;

public class GameTest {
    GameLogic gameLogic = new GameLogic();
    GameMethods gameMethods = new GameMethods();

    public void run() {
        while (gameLogic.getRoundCount() < 3) {
            int choice = gameMethods.readPlayersChoice();
            gameMethods.printPlayerChoice(choice);
            int computerChoice = gameLogic.makeComputerChoice();
            gameLogic.makeBattle(choice, computerChoice);
        }
        printAfterGame();
    }

    public static void main(String[] args) {
        new GameTest().run();
    }

    public void printAfterGame() {
        System.out.print("Game ends - ");
        if (gameLogic.player.getPlayerScore() > gameLogic.computer.getPlayerScore()) {
            System.out.println("YEAH! You won - computer lose!!!");
        } else if (gameLogic.player.getPlayerScore() < gameLogic.computer.getPlayerScore()) {
            System.out.println("BOOH! You lose - computer wins!!!");
        } else {
            System.out.println("well OKAY - the game is tie!");
        }
    }
}
