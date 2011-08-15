package axyz.gameofgoose.game;

/**
 * Class that represent the state a game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGGameState extends GameState {

	private GOGPlayer redPlayer;
	private GOGPlayer bluePlayer;
	private GOGPlayer greenPlayer;
	private GOGPlayer yellowPlayer;

	/**
	 * @return the redPlayer
	 */
	public GOGPlayer getRedPlayer() {
		return redPlayer;
	}

	/**
	 * @param redPlayer
	 *            the redPlayer to set
	 */
	public void setRedPlayer(GOGPlayer redPlayer) {
		this.redPlayer = redPlayer;
	}

	/**
	 * @return the bluePlayer
	 */
	public GOGPlayer getBluePlayer() {
		return bluePlayer;
	}

	/**
	 * @param bluePlayer
	 *            the bluePlayer to set
	 */
	public void setBluePlayer(GOGPlayer bluePlayer) {
		this.bluePlayer = bluePlayer;
	}

	/**
	 * @return the greenPlayer
	 */
	public GOGPlayer getGreenPlayer() {
		return greenPlayer;
	}

	/**
	 * @param greenPlayer
	 *            the greenPlayer to set
	 */
	public void setGreenPlayer(GOGPlayer greenPlayer) {
		this.greenPlayer = greenPlayer;
	}

	/**
	 * @return the yellowPlayer
	 */
	public GOGPlayer getYellowPlayer() {
		return yellowPlayer;
	}

	/**
	 * @param yellowPlayer
	 *            the yellowPlayer to set
	 */
	public void setYellowPlayer(GOGPlayer yellowPlayer) {
		this.yellowPlayer = yellowPlayer;
	}
}
