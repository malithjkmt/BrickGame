
public class Bat extends GameEntity {
	
	public Bat(int gameW, int gameH, int x,int y, int w, int h, int speed) {
		super(gameW, gameH, x, y, w, h, speed);	
		this.dx = speed;
	}
	
	public void setLeft(){
		this.dx = -(this.speed);
	}
	public void setRight(){
		this.dx = (this.speed);
	}

	public void update(){
		x = x + dx;
		dx = 0;
	}

}
