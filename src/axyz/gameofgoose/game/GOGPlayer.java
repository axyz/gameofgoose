package axyz.gameofgoose.game;

import javax.swing.JOptionPane;

/**
 * Class that represent the player in a game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGPlayer extends Player {

	private int currentBox;
	private String avatar;
	private GOGGame g;

	/**
	 * Constructor of the class.
	 * 
	 * @param g
	 *            the {@link GOGGame} in which the player plays
	 * @param img
	 *            the path of the image avatar to use
	 */
	public GOGPlayer(GOGGame g, String img) {
		super();
		this.g = g;
		this.currentBox = 0;
		this.setAvatar(img);
	}

	/**
	 * Move the player considering his result with the dices and the rules of
	 * the game.
	 * 
	 * @param a
	 *            the result of the first dice
	 * @param b
	 *            the result of the second dice
	 */
	public void move(int a, int b) {
		if (this.currentBox == 0 && a + b == 9) {
			if (a == 6 || a == 3) {
				JOptionPane
						.showMessageDialog(null,
								"You've got 6 and 3 on the first hand, you have to go to 26. QUAK");
				this.currentBox = 26;
				return;
			} else {
				JOptionPane
						.showMessageDialog(null,
								"You've got 5 and 4 on the first hand, you have to go to 53. QUAK");
				this.currentBox = 53;
				return;
			}
		}
		GOGRuleBook.getRule(this.currentBox + a + b).apply(
				this.g.getGameState(), new GOGAction(this, a, b));
	}

	/**
	 * @param currentBox
	 *            the currentBox to set
	 */
	public void setCurrentBox(int currentBox) {
		this.currentBox = currentBox;
	}

	/**
	 * @return the currentBox
	 */
	public int getCurrentBox() {
		return currentBox;
	}

	/**
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}
}
