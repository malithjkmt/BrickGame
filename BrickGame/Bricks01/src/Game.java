/**
 * Description	:Engine for the brick game
 * Copyright	:Copyright (c) 2014
 * Company		:Embla Software Innovations (Pvt) Ltd
 * Created on	:2014.09.01
 * @author 		:Chandimal
 * @version 	:1.0
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Game extends Canvas {

	private static final long serialVersionUID = 1L;

	BufferedImage buffer; // Create the buffer

	/**
	 * Create the game using the width and the height specified
	 */
	public Game(Dimension dim) {
		buffer = new BufferedImage(dim.width, dim.height,
				BufferedImage.TYPE_INT_RGB);
		this.setIgnoreRepaint(true); // Ignore repainting as we are doing all
										// the drawing stuff
	}

	/**
	 * Start the game
	 */
	public void Start() {

		while (true) {
			// Draw the buffer
			drawBuffer();
			// Paint the buffer on screen
			drawScreen();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Draw the image buffer
	 */
	public void drawBuffer() {
		Graphics2D b = buffer.createGraphics();
		
		// Random color background
		Color c = new Color(new Random().nextInt());
		b.setColor(c);
		b.fillRect(0, 0, buffer.getWidth(), buffer.getHeight());
	}

	/**
	 *  Update it to the screen
	 */
	public void drawScreen() {
		Graphics2D g = (Graphics2D) this.getGraphics();
		g.drawImage(buffer, 0, 0, this);
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}

}
