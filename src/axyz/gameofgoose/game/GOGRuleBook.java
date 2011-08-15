package axyz.gameofgoose.game;

/**
 * Class that represent the rule book of the game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGRuleBook extends RuleBook {

	private final static GOGRule defaultRule = new GOGDefaultRule();
	private final static GOGGooseRule gooseRule = new GOGGooseRule();
	private final static GOGBridgeRule bridgeRule = new GOGBridgeRule();
	private final static GOGLabyrinthRule labyrinthRule = new GOGLabyrinthRule();
	private final static GOGDeathRule deathRule = new GOGDeathRule();

	/**
	 * @param box
	 *            the box of which we want to know the rule
	 * @return the {@link GOGRule} to apply in the box
	 */
	public static GOGRule getRule(int box) {
		switch (box) {
		case 5:
		case 9:
		case 14:
		case 18:
		case 23:
		case 27:
		case 32:
		case 36:
		case 41:
		case 45:
		case 50:
		case 54:
		case 59:
			return gooseRule;
		case 6:
			return bridgeRule;
		case 42:
			return labyrinthRule;
		case 58:
			return deathRule;
		default:
			return defaultRule;
		}
	}
}
