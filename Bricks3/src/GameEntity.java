
public abstract  class GameEntity {
	int x;
	int y;
	int w;
	int h;
	
	int gameW;
	int gameH;
	
	int dx;
	int dy;
	
	int speed;
	
	
	public  GameEntity(int gameW, int gameH, int x,int y, int w, int h, int speed) {
		this.x = x;
		this.y = y;
		
		this.w = w;
		this.h = h;
		
		this.gameH = gameH;
		this.gameW = gameW;
		
		this.speed = speed;
		
	}
	
	
	public void update(){	
		
		
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
