import processing.core.PApplet;

public class MazeGenerator extends PApplet{
	
	public void drawHorizontalWall(float minX, float maxX, float y, int hole_size) {
		//base case
		float randX1 = (float)(1+Math.random()*minX);
		float randX2 = (float)(1+Math.random()*maxX);
		//float randY = (float)(1+Math.random()*y);
		
	}

}
