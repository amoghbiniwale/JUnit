package com.aurionpro.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons = new JButton[9];
	private boolean xTurn = true;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (xTurn) {
			button.setText("X");
		} else {
			button.setText("O");
		}
		button.setEnabled(false);
		xTurn = !xTurn;

		checkForWinner();
	}

	private void checkForWinner() {
		// Check rows
		for (int i = 0; i < 9; i += 3) {
			if (buttons[i].getText().equals(buttons[i + 1].getText())
					&& buttons[i].getText().equals(buttons[i + 2].getText()) && !buttons[i].isEnabled()) {
				JOptionPane.showMessageDialog(frame, buttons[i].getText() + " wins!");
				resetGame();
				return;
			}
		}
		// Check diagonals
		if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())
				&& !buttons[0].isEnabled()) {
			JOptionPane.showMessageDialog(frame, buttons[0].getText() + " wins!");
			resetGame();
			return;
		}
		if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())
				&& !buttons[2].isEnabled()) {
			JOptionPane.showMessageDialog(frame, buttons[2].getText() + " wins!");
			resetGame();
			return;
		}

		// Check for tie
		boolean tie = true;
		for (int i = 0; i < 9; i++) {
			if (buttons[i].isEnabled()) {
				tie = false;
				break;
			}
		}
		if (tie) {
			JOptionPane.showMessageDialog(frame, "Tie game!");
			resetGame();
		}

	}

	private void resetGame() {
		for (int i = 0; i < 9; i++) {
			buttons[i].setText("");
			buttons[i].setEnabled(true);
		}
		xTurn = true;
	}
	public static void main(String[] args) {
        new GameGUI();
    }
}
