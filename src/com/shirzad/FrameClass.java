/**
 *
 */
package com.shirzad;

import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @author iks93
 *
 */
public class FrameClass extends JFrame {
	private PanelClass panel = new PanelClass();

	public FrameClass() throws HeadlessException {
		setTitle("Draw Afghan Flag");
		setSize(450, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}

}
