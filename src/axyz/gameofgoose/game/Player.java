package axyz.gameofgoose.game;

/**
 * Abstract class that represent a generic player.
 * 
 * @author Andrea Moretti
 */
public abstract class Player {

	private boolean playing;
	private boolean winner;

	public Player() {
		this.playing = true;
		this.winner = false;
	}

	/**
	 * @param playing
	 *            set to true if the player is playing
	 */
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	/**
	 * @return true if the player is playing
	 */
	public boolean isPlaying() {
		return playing;
	}

	/**
	 * @param winner
	 *            set to true if the player has won
	 */
	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	/**
	 * @return true if the player has won
	 */
	public boolean isWinner() {
		return winner;
	}
}
