package axyz.gameofgoose.game;

import javax.swing.JOptionPane;

/**
 * Implementation of the labyrinth rule where you go in the box 42 you get lost
 * and arrive at the box 39.
 * 
 * @author Andrea Moretti
 */
public class GOGLabyrinthRule extends GOGRule {

	@Override
	public void apply(GOGGameState gs, GOGAction action) {
		this.diceResult = action.getFirstDiceResult()
				+ action.getSecondDiceResult();
		this.nextPos = 39;
		JOptionPane
				.showMessageDialog(
						null,
						"With "
								+ diceResult
								+ " You go to the Labyrinth, you get lost and arrive to the box 39. QUAK",
						"QUAK MESSAGE", 1);
		action.getPlayer().setCurrentBox(this.nextPos);

	}
}
