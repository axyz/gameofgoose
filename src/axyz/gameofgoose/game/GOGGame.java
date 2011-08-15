package axyz.gameofgoose.game;

import axyz.gameofgoose.game.gametable.GOGGameTable;
import axyz.gameofgoose.util.Dice;

/**
 * Class that represent a game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGGame extends Game {

	private Dice diceA;
	private Dice diceB;
	private GOGGameState gameState;
	private GOGGameTable gameTable;

	/**
	 * Constructor of the class.
	 * 
	 * @param num
	 *            the number o players
	 * @param gt
	 *            the {@link GOGGameTable} to use
	 * @param a
	 *            the first {@link Dice} to use
	 * @param b
	 *            the second {@link Dice} to use
	 */
	public GOGGame(int num, GOGGameTable gt, Dice a, Dice b) {
		super.setNumPlayer(num);
		super.setRuleBook(new GOGRuleBook());
		this.gameTable = gt;
		this.gameState = new GOGGameState();
		this.gameState.setRedPlayer(new GOGPlayer(this, this.getGameTable()
				.getSkin().getRedGoose()));
		this.gameState.setBluePlayer(new GOGPlayer(this, this.getGameTable()
				.getSkin().getBlueGoose()));
		this.gameState.setGreenPlayer(new GOGPlayer(this, this.getGameTable()
				.getSkin().getGreenGoose()));
		this.gameState.setYellowPlayer(new GOGPlayer(this, this.getGameTable()
				.getSkin().getYellowGoose()));
		this.diceA = a;
		this.diceB = b;
	}

	/**
	 * Let the red player play.
	 */
	public void redPlay() {
		this.gameState.getRedPlayer()
				.move(this.diceA.roll(), this.diceB.roll());
	}

	/**
	 * Let the blue player play.
	 */
	public void bluePlay() {
		this.gameState.getBluePlayer().move(this.diceA.roll(),
				this.diceB.roll());
	}

	/**
	 * Let the green player play.
	 */
	public void greenPlay() {
		this.gameState.getGreenPlayer().move(this.diceA.roll(),
				this.diceB.roll());
	}

	/**
	 * Let the yellow player play.
	 */
	public void yellowPlay() {
		this.gameState.getYellowPlayer().move(this.diceA.roll(),
				this.diceB.roll());
	}

	/**
	 * @return the gameState
	 */
	public GOGGameState getGameState() {
		return gameState;
	}

	/**
	 * @return the gameTable
	 */
	public GOGGameTable getGameTable() {
		return gameTable;
	}

	/**
	 * @return the diceA
	 */
	public Dice getDiceA() {
		return diceA;
	}

	/**
	 * @return the diceB
	 */
	public Dice getDiceB() {
		return diceB;
	}

}
