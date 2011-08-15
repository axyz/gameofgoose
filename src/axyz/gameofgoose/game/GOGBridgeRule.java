package axyz.gameofgoose.game;

import javax.swing.JOptionPane;

/**
 * Implementation of the rule of the bridge: if you go in the box 6 you cross
 * directly to the 12.
 * 
 * @author Andrea Moretti
 */
public class GOGBridgeRule extends GOGRule {

	@Override
	public void apply(GOGGameState gs, GOGAction action) {
		this.diceResult = action.getFirstDiceResult()
				+ action.getSecondDiceResult();
		this.nextPos = 12;
		JOptionPane
				.showMessageDialog(
						null,
						"With "
								+ diceResult
								+ " You go to the BRIDGE and cross directly to the box 12. QUAK",
						"QUAK MESSAGE", 1);
		action.getPlayer().setCurrentBox(this.nextPos);

	}
}
