import processing.core.PApplet;

public class Main extends PApplet {

	public void setup() {
		size(600, 600);
		background(255);
		rectMode(CORNERS);

		drawHorizontalWall(0, 600, 200, 10, 10);
		drawVerticalWall(0, 600, 300, 10, 10);
	}

	public void drawMaze(int n) {
		if (n <= 1) {
			//drawVerticalWall();
			return;
		}
		
		
	}
	
	private void drawVerticalWall(int startY, int endY, int x, int thickness, int gap_size) {
		float gap_y = getRandom(startY + gap_size, endY - gap_size);

		rect(x, startY, x + thickness, gap_y - gap_size / 2);
		rect(x, gap_y + gap_size / 2, x + thickness, endY);
	}

	private void drawHorizontalWall(int startX, int endX, int y, int thickness, int gap_size) {
		float gap_x = getRandom(startX + gap_size, endX - gap_size);

		rect(startX, y, gap_x - gap_size / 2, y + thickness);
		rect(gap_x + gap_size / 2, y, endX, y + thickness);
	}

	public float getRandom(float min, float max) {
		return min + (float) (Math.random() * (max - min));
	}
}
