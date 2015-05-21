


public class Ball extends GameEntity {
		
	public Ball(int gameW, int gameH, int x, int y, int w, int h, int speed) {
		super(gameW, gameH, x, y, w, h, speed);	
		
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

	
	public void reverse(){
		this.dy = -speed;
	}


}