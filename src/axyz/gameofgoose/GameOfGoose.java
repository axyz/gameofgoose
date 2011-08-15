package axyz.gameofgoose;

import axyz.gameofgoose.game.GOGGame;
import axyz.gameofgoose.game.gametable.GOGGameTable;
import axyz.gameofgoose.game.gametable.GOGSkin;
import axyz.gameofgoose.gui.GOGFrame;
import axyz.gameofgoose.util.Dice;

/**
 * Main class of the game.
 * 
 * @author Andrea Moretti
 */
public class GameOfGoose {

	private static GOGGame game;
	private static GOGGameTable gt;
	private static GOGSkin aSkin;
	private static GOGFrame myGOGFrame;

	/**
	 * Main function of the game.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		aSkin = new GOGSkin("axyz/gameofgoose/skin/skin1/skin.jpg",
				"axyz/gameofgoose/skin/skin1/dice/dice-1.png",
				"axyz/gameofgoose/skin/skin1/dice/dice-2.png",
				"axyz/gameofgoose/skin/skin1/dice/dice-3.png",
				"axyz/gameofgoose/skin/skin1/dice/dice-4.png",
				"axyz/gameofgoose/skin/skin1/dice/dice-5.png",
				"axyz/gameofgoose/skin/skin1/dice/dice-6.png",
				"axyz/gameofgoose/skin/skin1/redgoose.png",
				"axyz/gameofgoose/skin/skin1/bluegoose.png",
				"axyz/gameofgoose/skin/skin1/greengoose.png",
				"axyz/gameofgoose/skin/skin1/yellowgoose.png", new int[][] {
						{ 58, 547 }, { 114, 547 }, { 166, 547 }, { 218, 547 },
						{ 275, 547 }, { 325, 547 }, { 380, 547 }, { 435, 547 },
						{ 485, 547 }, { 540, 540 }, { 590, 525 }, { 640, 500 },
						{ 680, 460 }, { 705, 415 }, { 720, 360 }, { 720, 310 },
						{ 710, 255 }, { 680, 205 }, { 640, 160 }, { 590, 140 },
						{ 540, 125 }, { 485, 125 }, { 434, 122 }, { 380, 120 },
						{ 325, 120 }, { 270, 120 }, { 220, 140 }, { 180, 175 },
						{ 145, 217 }, { 130, 270 }, { 128, 324 }, { 145, 373 },
						{ 177, 416 }, { 222, 450 }, { 273, 470 }, { 326, 470 },
						{ 380, 469 }, { 432, 466 }, { 487, 471 }, { 540, 467 },
						{ 588, 450 }, { 626, 410 }, { 650, 362 }, { 648, 306 },
						{ 631, 255 }, { 592, 217 }, { 539, 195 }, { 485, 193 },
						{ 434, 193 }, { 380, 193 }, { 329, 195 }, { 274, 200 },
						{ 232, 228 }, { 201, 272 }, { 202, 323 }, { 228, 367 },
						{ 270, 390 }, { 327, 397 }, { 380, 396 }, { 431, 394 },
						{ 485, 396 }, { 536, 394 }, { 574, 360 } });
		gt = new GOGGameTable(aSkin);
		game = new GOGGame(4, gt, new Dice(6), new Dice(6));
		myGOGFrame = new GOGFrame(game);

		myGOGFrame.setVisible(true);

	}

}
