package axyz.gameofgoose.game;

/**
 * Abstract class that represent a generic state of a game.
 * 
 * @author Andrea Moretti
 */
public abstract class GameState {

	private boolean endGame;

	/**
	 * @param endGame
	 *            set to true if the game is ended
	 */
	public void setEndGame(boolean endGame) {
		this.endGame = endGame;
	}

	/**
	 * @return true if the game has ended
	 */
	public boolean isEndGame() {
		return endGame;
	}

}
