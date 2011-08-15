package axyz.gameofgoose.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import axyz.gameofgoose.game.GOGGame;

/**
 * GUI component that represent the main window of the game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private GOGGameTableLabel table;
	private GOGGame game;
	private GOGPlayerLabel red, blue, green, yellow;
	private JButton redButton, blueButton, greenButton, yellowButton, newGame,
			rules;
	private JLabel msg;
	private GOGDiceLabel dice1, dice2;
	private BufferedImage iconr, iconb, icong, icony;

	/**
	 * Constructor of the class.
	 * 
	 * @param g
	 *            the game to play with this GUI
	 */
	public GOGFrame(GOGGame g) {
		super("GOOSE GAME");
		try {
			this.iconr = ImageIO.read(ClassLoader.getSystemResource(g
					.getGameTable().getSkin().getRedGoose()));
			this.iconb = ImageIO.read(ClassLoader.getSystemResource(g
					.getGameTable().getSkin().getBlueGoose()));
			this.icong = ImageIO.read(ClassLoader.getSystemResource(g
					.getGameTable().getSkin().getGreenGoose()));
			this.icony = ImageIO.read(ClassLoader.getSystemResource(g
					.getGameTable().getSkin().getYellowGoose()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setSize(1024, 700);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.decode("0x9eb9a8"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(iconr);
		this.game = g;

		this.table = new GOGGameTableLabel(g.getGameTable().getSkin().getImg());
		this.table.setBounds(0, 0, 800, 670);
		this.add(table);

		this.red = new GOGPlayerLabel(g.getGameTable().getSkin().getRedGoose());
		this.red.setBounds(10, 530, 30, 42);
		this.add(red, 0);

		this.blue = new GOGPlayerLabel(g.getGameTable().getSkin()
				.getBlueGoose());
		this.blue.setBounds(10, 520, 30, 42);
		this.add(blue, 0);

		this.green = new GOGPlayerLabel(g.getGameTable().getSkin()
				.getGreenGoose());
		this.green.setBounds(10, 510, 30, 42);
		this.add(green, 0);

		this.yellow = new GOGPlayerLabel(g.getGameTable().getSkin()
				.getYellowGoose());
		this.yellow.setBounds(10, 500, 30, 42);
		this.add(yellow, 0);

		this.redButton = new JButton("RED PLAY");
		this.redButton.addActionListener(this);
		this.redButton.setBounds(800, 0, 224, 100);
		this.redButton.setBackground(Color.red);
		this.add(redButton, 0);

		this.blueButton = new JButton("BLUE PLAY");
		this.blueButton.addActionListener(this);
		this.blueButton.setBounds(800, 100, 224, 100);
		this.blueButton.setEnabled(false);
		this.blueButton.setBackground(Color.gray);
		this.add(blueButton, 0);

		this.greenButton = new JButton("GREEN PLAY");
		this.greenButton.addActionListener(this);
		this.greenButton.setBounds(800, 200, 224, 100);
		this.greenButton.setEnabled(false);
		this.greenButton.setBackground(Color.gray);
		this.add(greenButton, 0);

		this.yellowButton = new JButton("YELLOW PLAY");
		this.yellowButton.addActionListener(this);
		this.yellowButton.setBounds(800, 300, 224, 100);
		this.yellowButton.setEnabled(false);
		this.yellowButton.setBackground(Color.gray);
		this.add(yellowButton, 0);

		this.newGame = new JButton("New Game");
		this.newGame.addActionListener(this);
		this.newGame.setBounds(802, 460, 100, 50);
		this.newGame.setBackground(Color.decode("0xf3edb1"));
		this.add(newGame, 0);

		this.rules = new JButton("Rules");
		this.rules.addActionListener(this);
		this.rules.setBounds(920, 460, 100, 50);
		this.rules.setBackground(Color.decode("0xf3edb1"));
		this.add(rules, 0);

		this.msg = new JLabel();
		this.msg.setBounds(800, 500, 224, 100);
		this.add(msg, 0);

		this.dice1 = new GOGDiceLabel(g.getGameTable().getSkin().getDice1(), g
				.getGameTable().getSkin().getDice2(), g.getGameTable()
				.getSkin().getDice3(), g.getGameTable().getSkin().getDice4(), g
				.getGameTable().getSkin().getDice5(), g.getGameTable()
				.getSkin().getDice6());
		this.dice1.setBounds(802, 566, 100, 100);
		this.add(dice1, 0);
		this.dice1.setFace(1);

		this.dice2 = new GOGDiceLabel(g.getGameTable().getSkin().getDice1(), g
				.getGameTable().getSkin().getDice2(), g.getGameTable()
				.getSkin().getDice3(), g.getGameTable().getSkin().getDice4(), g
				.getGameTable().getSkin().getDice5(), g.getGameTable()
				.getSkin().getDice6());
		this.dice2.setBounds(920, 566, 100, 100);
		this.add(dice2, 0);
		this.dice2.setFace(1);

		this.add(new JLabel(), 0); // ? bug-fix
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.redButton) {
			this.redButton.setEnabled(false);
			this.blueButton.setEnabled(true);
			this.redButton.setBackground(Color.gray);
			this.blueButton.setBackground(Color.blue);
			this.game.redPlay();
			this.dice1.setFace(game.getDiceA().getFace());
			this.dice2.setFace(game.getDiceB().getFace());
			if (this.game.getGameState().isEndGame()) {
				this.blueButton.setEnabled(false);
				this.blueButton.setBackground(Color.gray);
				this.red
						.setLocation(this.game.getGameTable().getSkin()
								.getCoordinate(63).getX() - 20, this.game
								.getGameTable().getSkin().getCoordinate(63)
								.getY() - 20);
				JOptionPane.showMessageDialog(this, "RED WINS", "QUAK MESSAGE",
						1, new ImageIcon(iconr));
			} else {
				this.red.setLocation(this.game.getGameTable().getSkin()
						.getCoordinate(
								this.game.getGameState().getRedPlayer()
										.getCurrentBox()).getX() - 20,
						this.game.getGameTable().getSkin().getCoordinate(
								this.game.getGameState().getRedPlayer()
										.getCurrentBox()).getY() - 20);
			}
		} else if (e.getSource() == this.blueButton) {
			this.blueButton.setEnabled(false);
			this.greenButton.setEnabled(true);
			this.blueButton.setBackground(Color.gray);
			this.greenButton.setBackground(Color.green);
			this.game.bluePlay();
			this.dice1.setFace(game.getDiceA().getFace());
			this.dice2.setFace(game.getDiceB().getFace());
			if (this.game.getGameState().isEndGame()) {
				this.greenButton.setEnabled(false);
				this.greenButton.setBackground(Color.gray);
				this.blue
						.setLocation(this.game.getGameTable().getSkin()
								.getCoordinate(63).getX() - 20, this.game
								.getGameTable().getSkin().getCoordinate(63)
								.getY() - 20);
				JOptionPane.showMessageDialog(this, "BLUE WINS",
						"QUAK MESSAGE", 1, new ImageIcon(iconb));
			} else {
				this.blue.setLocation(this.game.getGameTable().getSkin()
						.getCoordinate(
								this.game.getGameState().getBluePlayer()
										.getCurrentBox()).getX() - 23,
						this.game.getGameTable().getSkin().getCoordinate(
								this.game.getGameState().getBluePlayer()
										.getCurrentBox()).getY() - 23);
			}
		} else if (e.getSource() == this.greenButton) {
			this.greenButton.setEnabled(false);
			this.yellowButton.setEnabled(true);
			this.greenButton.setBackground(Color.gray);
			this.yellowButton.setBackground(Color.yellow);
			this.game.greenPlay();
			this.dice1.setFace(game.getDiceA().getFace());
			this.dice2.setFace(game.getDiceB().getFace());
			if (this.game.getGameState().isEndGame()) {
				this.yellowButton.setEnabled(false);
				this.yellowButton.setBackground(Color.gray);
				this.green
						.setLocation(this.game.getGameTable().getSkin()
								.getCoordinate(63).getX() - 20, this.game
								.getGameTable().getSkin().getCoordinate(63)
								.getY() - 20);
				JOptionPane.showMessageDialog(this, "GREEN WINS",
						"QUAK MESSAGE", 1, new ImageIcon(icong));
			} else {
				this.green.setLocation(this.game.getGameTable().getSkin()
						.getCoordinate(
								this.game.getGameState().getGreenPlayer()
										.getCurrentBox()).getX() - 26,
						this.game.getGameTable().getSkin().getCoordinate(
								this.game.getGameState().getGreenPlayer()
										.getCurrentBox()).getY() - 26);
			}
		} else if (e.getSource() == this.yellowButton) {
			this.yellowButton.setEnabled(false);
			this.redButton.setEnabled(true);
			this.yellowButton.setBackground(Color.gray);
			this.redButton.setBackground(Color.red);
			this.game.yellowPlay();
			this.dice1.setFace(game.getDiceA().getFace());
			this.dice2.setFace(game.getDiceB().getFace());
			if (this.game.getGameState().isEndGame()) {
				this.redButton.setEnabled(false);
				this.redButton.setBackground(Color.gray);
				this.yellow
						.setLocation(this.game.getGameTable().getSkin()
								.getCoordinate(63).getX() - 20, this.game
								.getGameTable().getSkin().getCoordinate(63)
								.getY() - 20);
				JOptionPane.showMessageDialog(this, "YELLOW WINS",
						"QUAK MESSAGE", 1, new ImageIcon(icony));
			} else {
				this.yellow.setLocation(this.game.getGameTable().getSkin()
						.getCoordinate(
								this.game.getGameState().getYellowPlayer()
										.getCurrentBox()).getX() - 29,
						this.game.getGameTable().getSkin().getCoordinate(
								this.game.getGameState().getYellowPlayer()
										.getCurrentBox()).getY() - 29);
			}
		} else if (e.getSource() == this.rules) {
			JOptionPane.showMessageDialog(this, "Rules:\n"
					+ "- When it's your turn you move forward of\n"
					+ "the number given by the dices' faces.\n"
					+ "- If you arrive in a goose box you have to\n"
					+ "move again by the same number of steps.\n"
					+ "- If you go in the BRIDGE(6) you cross\n"
					+ "directly to the box 12.\n"
					+ "- If you go in the LABYRINTH(42) you get\n"
					+ "lost and arrive to the box 39.\n"
					+ "- If you go to the DEATH(58) you die and\n"
					+ "retorun to the first box.\n"
					+ "- Who arrive in the box 63 wins, but have\n"
					+ "to arrive there with an exact movement:\n"
					+ "if you get a number that added to your\n"
					+ "current position give a number higher than\n"
					+ "63 you'll go back by the steps in excess.\n" + "QUAK.",
					"QUAK MESSAGE", 1, new ImageIcon(iconr));
		} else if (e.getSource() == this.newGame) {
			this.newGame();
		}

	}

	private void newGame() {
		this.game.getGameState().setEndGame(false);
		this.game.getGameState().getRedPlayer().setCurrentBox(0);
		this.red.setBounds(10, 530, 30, 42);
		this.redButton.setEnabled(true);
		this.redButton.setBackground(Color.red);
		this.game.getGameState().getBluePlayer().setCurrentBox(0);
		this.blue.setBounds(10, 520, 30, 42);
		this.blueButton.setEnabled(false);
		this.blueButton.setBackground(Color.gray);
		this.game.getGameState().getGreenPlayer().setCurrentBox(0);
		this.green.setBounds(10, 510, 30, 42);
		this.greenButton.setEnabled(false);
		this.greenButton.setBackground(Color.gray);
		this.game.getGameState().getYellowPlayer().setCurrentBox(0);
		this.yellow.setBounds(10, 500, 30, 42);
		this.yellowButton.setEnabled(false);
		this.yellowButton.setBackground(Color.gray);
		this.dice1.setFace(1);
		this.dice2.setFace(1);
	}
}
