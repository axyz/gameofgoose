package axyz.gameofgoose.game.gametable;

/**
 * Class that represent a GameTable for the game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGGameTable extends GameTable {

	private GOGSkin skin;

	/**
	 * Constructor of the class.
	 * 
	 * @param s
	 *            the {@link GOGSkin} to use
	 */
	public GOGGameTable(GOGSkin s) {
		super();
		this.setSkin(s);
	}

	/**
	 * @param skin
	 *            the skin to set
	 */
	public void setSkin(GOGSkin skin) {
		this.skin = skin;
	}

	/**
	 * @return the skin
	 */
	public GOGSkin getSkin() {
		return skin;
	}
}
