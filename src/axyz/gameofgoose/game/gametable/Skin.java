package axyz.gameofgoose.game.gametable;

/**
 * Abstract class that represent a generic skin for a {@link GameTable}.
 * 
 * @author Andrea Moretti
 */
public abstract class Skin {

	private String img;

	public Skin(String s) {
		this.img = s;
	}

	/**
	 * @param img
	 *            the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
}
