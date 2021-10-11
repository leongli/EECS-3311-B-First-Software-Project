import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Draw extends JPanel{

	private ArrayList<Shape> shapes= new ArrayList<Shape>();

	public Draw(ArrayList<Shape> list)
	{
		for (Shape s: list)
		{
			if(s instanceof Circle) {
				Circle shape= new Circle(s.getX(),s.getY(),s.getWidth(),s.getHeight(),s.getColor());
				shapes.add(shape);
			}else if (s instanceof Square) {
				Square shape= new Square(s.getX(),s.getY(),s.getWidth(),s.getHeight(),s.getColor());
				shapes.add(shape);
			}else {
				Rectangle shape= new Rectangle(s.getX(),s.getY(),s.getWidth(),s.getHeight(),s.getColor());
				shapes.add(shape);
			}
		}
		if (!list.isEmpty())
			repaint();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int i=0;
		Color color;
		int x,y,width,height;
		while (i<6) {
			Graphics2D g2d= (Graphics2D) g;
			x=shapes.get(i).getX();
			y=shapes.get(i).getY();
			width=shapes.get(i).getWidth();
			height=shapes.get(i).getHeight();
			color=shapes.get(i).getColor();
			if (shapes.get(i) instanceof Circle) {
				g2d.setColor(color);
				g2d.fillOval(x, y, width, height);
			}else
			{
				g2d.setColor(color);
				g2d.fillRect(x, y, width, height);
			}
			i++;
		}
	}
}
