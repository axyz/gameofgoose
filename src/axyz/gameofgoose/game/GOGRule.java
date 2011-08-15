package axyz.gameofgoose.game;

/**
 * Alass that represent a rule in the game of the goose.
 * 
 * @author Andrea Moretti
 */
public abstract class GOGRule extends Rule {

	protected int diceResult;
	protected int nextPos;

	/**
	 * Apply the rule considering the state of the game and the action done.
	 * 
	 * @param gs
	 *            the {@link GOGGameState} to affect
	 * @param action
	 *            the {@link GOGAction} to consider
	 */
	public abstract void apply(GOGGameState gs, GOGAction action);

}
