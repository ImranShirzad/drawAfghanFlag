/**
 *
 */
package com.shirzad;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author iks93
 *
 */
public class PanelClass extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(20, 10, 100, 300);
		g.fillRect(20, 10, 100, 300);

		g.setColor(Color.RED);
		g.drawRect(120, 10, 160, 300);
		g.fillRect(120, 10, 160, 300);

		g.setColor(Color.GREEN);
		g.drawRect(280, 10, 100, 300);
		g.fillRect(280, 10, 100, 300);

		g.setColor(Color.decode("#59392B"));
		g.drawRect(10, 10, 10, 500);
		g.fillRect(10, 10, 10, 500);

		Image img;
		try {
			img = ImageIO.read(new FileInputStream("src/flag1.png"));
			g.drawImage(img, 120, 110, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
