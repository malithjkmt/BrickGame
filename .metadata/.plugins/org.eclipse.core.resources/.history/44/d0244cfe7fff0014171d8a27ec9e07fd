
public class Bat {
	int x;
	int y;
	int w;
	int h;
	
	int gameW;
	int gameH;
	
	int dx;
	
	int speed;
	
	
	public Bat(int gameW, int gameH, int x,int y, int w, int h, int speed) {
		this.x = x;
		this.y = y;
		
		this.w = w;
		this.h = h;
		
		this.gameH = gameH;
		this.gameW = gameW;
		
		this.speed = speed;
		
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

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}


	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}
	
	


}
