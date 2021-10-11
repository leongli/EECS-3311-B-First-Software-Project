import java.awt.Color;


public class Square extends Shape{
	public int width;
	public int height;
	public Square(int x,int y,int width,int height,Color color) {
		super (x,y,color);
		this.height=height;
		this.width=width;
	}
	public int getSurfaceArea()
	{
		return (width*height);
	}
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
