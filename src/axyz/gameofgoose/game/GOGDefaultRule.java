package axyz.gameofgoose.game;

/**
 * Implementation of the default rule where you advance by the number that you
 * obtain throwing the dices.
 * 
 * @author Andrea Moretti
 */
public class GOGDefaultRule extends GOGRule {

	@Override
	public void apply(GOGGameState gs, GOGAction action) {
		this.diceResult = action.getFirstDiceResult()
				+ action.getSecondDiceResult();
		this.nextPos = action.getPlayer().getCurrentBox() + this.diceResult;
		if (this.nextPos == 63) {
			action.getPlayer().setCurrentBox(this.nextPos);
			action.getPlayer().setWinner(true);
			gs.setEndGame(true);
			return;
		} else if (this.nextPos > 63) {
			this.nextPos = 63 - (this.nextPos - 63);
			if (GOGRuleBook.getRule(this.nextPos) != GOGRuleBook.getRule(1)) {
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
