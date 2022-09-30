package rockpaperscissor;

public class Player {
    private int playerScore = 0;
    boolean playerTurn = true;

    public Player(int playerScore, boolean playerTurn) {
        setPlayerScore(playerScore);
        setPlayerTurn(playerTurn);
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public boolean getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore += playerScore;
    }

    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }
}
