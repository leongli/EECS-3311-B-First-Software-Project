/*
* Leong Li, 217270380
*/
import java.awt.Color;

public abstract class Shape implements Comparable<Shape>{
	public int x;
	public int y;
	public int width;
	public int height;
	public Color color;

	public Shape(int x, int y, Color color){
		this.x=x;
		this.y=y;
		this.color=color;
	}
	public abstract int getSurfaceArea();
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}
	public int compareTo(Shape o) {
		if (this.getSurfaceArea()> o.getSurfaceArea())
		{
			return 1;
		}else if (this.getSurfaceArea()< o.getSurfaceArea())
		{
			return -1;
		}
		else return 0;
	}
}
