package axyz.gameofgoose.game;

import javax.swing.JOptionPane;

/**
 * Implementation of the rule of the death: if you go in the box 58 you die and
 * return to the 1.
 * 
 * @author Andrea Moretti
 */
public class GOGDeathRule extends GOGRule {

	@Override
	public void apply(GOGGameState gs, GOGAction action) {
		this.diceResult = action.getFirstDiceResult()
				+ action.getSecondDiceResult();
		this.nextPos = 1;
		JOptionPane.showMessageDialog(null, "With " + diceResult
				+ " You go to the DEATH box :( retourn to the box 1. QUAK",
				"QUAK MESSAGE", 1);
		action.getPlayer().setCurrentBox(this.nextPos);

	}
}
