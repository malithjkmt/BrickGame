


public class Ball {
	
	int x;
	int y;
	int w;
	int h;
	
	int gameW;
	int gameH;
	
	int dx;
	int dy;
	
	int speed;
	
	
	public Ball(int gameW, int gameH, int x, int y, int w, int h, int speed) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
		this.gameH = gameH;
		this.gameW = gameW;
		
		this.speed = speed;
		
		this.dx = speed;
		this.dy = speed;
		
		
	}

	public void update(){
		this.x = x + dx;
		this.y = y + dy;
		
		if(y > gameH-h){
			dy = -dy;
		}
		if(x > gameW-w){
			dx = -dx;
		}
		
		if(y < 0){
			dy = -dy;
		}
		if(x < 0){
			dx = -dx;
		}
		
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
	
	public void reverse(){
		dy = -speed;
	}


}