package axyz.gameofgoose.game;

/**
 * Abstract class that represent a generic Game.
 * 
 * @author Andrea Moretti
 */
public abstract class Game {

	private RuleBook ruleBook;
	private int numPlayer;

	/**
	 * @param ruleBook
	 *            the ruleBook to set
	 */
	public void setRuleBook(RuleBook ruleBook) {
		this.ruleBook = ruleBook;
	}

	/**
	 * @return the ruleBook
	 */
	public RuleBook getRuleBook() {
		return ruleBook;
	}

	/**
	 * @param numPlayer
	 *            the number of player to set
	 */
	public void setNumPlayer(int numPlayer) {
		this.numPlayer = numPlayer;
	}

	/**
	 * @return the number of player
	 */
	public int getNumPlayer() {
		return numPlayer;
	}
}
