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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements KeyListener {

	private static final long serialVersionUID = 1L;

	BufferedImage buffer; // Create the buffer
	Ball ball;
	Bat bat;
	
	boolean isKeyLeft;
	boolean isKeyRight;
	

	/**
	 * Create the game using the width and the height specified
	 */
	public Game(Dimension dim) {
		buffer = new BufferedImage(dim.width, dim.height,
				BufferedImage.TYPE_INT_RGB);
		this.setIgnoreRepaint(true); // Ignore repainting as we are doing all
										// the drawing stuff
		ball = new Ball(dim.width,dim.height,0,0,25,25,10);
		bat = new Bat(dim.width, dim.height,0, dim.height - 150, 100, 10, 10);
	}

	/**
	 * Start the game
	 */
	public void Start() {

		while (true) {
			
			if (isKeyLeft && (bat.getX() > 0)) bat.setLeft();
			if (isKeyRight && (bat.getX() < 400 - bat.getW() )) bat.setRight();
			
			ball.update();
			bat.update();
			// Draw the buffer
			drawBuffer();
			// Paint the buffer on screen
			drawScreen();

			try {
				Thread.sleep(10);
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
		Color c = Color.BLACK;
		b.setColor(c);
		b.fillRect(0, 0, buffer.getWidth(), buffer.getHeight());
		
		c = Color.WHITE;
		//Color d = new Color(new Random().nextInt());
		b.setColor(c);
		b.fillOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
		
		b.fillRect(bat.getX(), bat.getY(), bat.getW(), bat.getH());
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

	@Override
	public void keyPressed(KeyEvent evt) {
		if ( evt.getKeyCode() == 37){
			isKeyLeft = true;
		}
		if ( evt.getKeyCode() == 39){
			isKeyRight = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent evt) {
		if ( evt.getKeyCode() == 37){
			isKeyLeft = false;
		}
		if ( evt.getKeyCode() == 39){
			isKeyRight = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent evt) {
		// TODO Auto-generated method stub
		
	}

}
