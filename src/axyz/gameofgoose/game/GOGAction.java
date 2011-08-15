package axyz.gameofgoose.game;

/**
 * Class that represent the actions in a game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGAction extends Action {

	private GOGPlayer player;
	private int firstDiceResult;
	private int secondDiceResult;

	/**
	 * Constructor of the class
	 * 
	 * @param p
	 *            The {@link GOGPlayer} who makes the action
	 * @param a
	 *            The result of his first dice
	 * @param b
	 *            The result of his second dice
	 */
	public GOGAction(GOGPlayer p, int a, int b) {
		this.player = p;
		this.firstDiceResult = a;
		this.secondDiceResult = b;
	}

	/**
	 * @return the {@link Player} who makes the action
	 */
	public GOGPlayer getPlayer() {
		return player;
	}

	/**
	 * @return the firstDiceResult
	 */
	public int getFirstDiceResult() {
		return firstDiceResult;
	}

	/**
	 * @return the secondDiceResult
	 */
	public int getSecondDiceResult() {
		return secondDiceResult;
	}

}
