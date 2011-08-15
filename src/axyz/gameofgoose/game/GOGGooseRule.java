package axyz.gameofgoose.game;

import javax.swing.JOptionPane;

/**
 * Implementation of the goose rule where you advance by the double of the
 * number that you obtain throwing the dices.
 * 
 * @author Andrea Moretti
 */
public class GOGGooseRule extends GOGRule {

	private int _tmp, _tmp2;

	@Override
	public void apply(GOGGameState gs, GOGAction action) {
		this.diceResult = action.getFirstDiceResult()
				+ action.getSecondDiceResult();
		this.nextPos = action.getPlayer().getCurrentBox()
				+ (this.diceResult * 2);
		JOptionPane
				.showMessageDialog(
						null,
						"With "
								+ diceResult
								+ " You go in a goose box, you have to move again with the same number of steps. QUAK",
						"QUAK MESSAGE", 1);
		if (GOGRuleBook.getRule(this.nextPos) == this) {
			this.nextPos += this.diceResult;
			JOptionPane
					.showMessageDialog(
							null,
							"You've reached again a goose box, you're really lucky... QUAK",
							"QUAK MESSAGE", 1);
			if (GOGRuleBook.getRule(this.nextPos) != GOGRuleBook.getRule(1)) {
				GOGRuleBook.getRule(this.nextPos).apply(gs, action);
				return;
			}
		}
		if (this.nextPos == 63) {
			action.getPlayer().setWinner(true);
			gs.setEndGame(true);
			return;
		} else if (this.nextPos > 63) {
			_tmp = this.nextPos - 63;
			_tmp2 = this.nextPos;
			this.nextPos = 63 - (this.nextPos - 63);
			if (GOGRuleBook.getRule(this.nextPos) != GOGRuleBook.getRule(1)) {
				if (GOGRuleBook.getRule(this.nextPos) == GOGRuleBook.getRule(9)) {
					// action.getPlayer().setCurrentBox(_tmp2 - _tmp);
					if (GOGRuleBook.getRule(_tmp2 - _tmp) == GOGRuleBook
							.getRule(9)) {
						action.getPlayer().setCurrentBox(_tmp2 - (_tmp * 2));
					}
					GOGRuleBook.getRule(_tmp2 - _tmp).apply(gs, action);
					return;
				}
				GOGRuleBook.getRule(this.nextPos).apply(gs, action);
				return;
			}
			action.getPlayer().setCurrentBox(this.nextPos);
			return;
		} else {
			action.getPlayer().setCurrentBox(this.nextPos);
		}

	}
}
