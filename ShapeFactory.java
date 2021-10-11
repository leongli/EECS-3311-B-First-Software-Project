import java.awt.Color;
import java.util.ArrayList;

public class ShapeFactory {
	private ArrayList<Shape> shapes;
	public ShapeFactory() {
		shapes= new ArrayList<Shape>();
		int i=0,rand,x=10,y=10,width=0,height=0,r,g,b;
		Color color;
		final int range=80;

		while(i<6)
		{
			rand=(int)(Math.random()*4)+1; //random val to pick which shape
			r=(int)((Math.random()*254)+1);
			g=(int)((Math.random()*254)+1);
			b=(int)((Math.random()*254)+1);
			color=new Color(r,g,b);
			if (rand==1) {//Circle
				width=(int)((Math.random()*range)+10);
				height=width;
//				System.out.println("Shape "+i+" C "+x+" "+y+" "+width+" "+height+" "+((int)(Math.PI*width*height)));
				shapes.add(new Circle(x,y,width,height,color));
			}else if (rand==2) {//Square
				width=(int)((Math.random()*range)+10);
				height=width;
//				System.out.println("Shape "+i+" SQ "+x+" "+y+" "+width+" "+height+" "+(width*height));
				shapes.add(new Square(x,y,width,height,color));
			}else {//Rectangle
				width=(int)((Math.random()*range)+10);
				height=(int)((Math.random()*range)+10);
//				System.out.println("Shape "+i+" R "+x+" "+y+" "+width+" "+height+" "+(width*height));
				shapes.add(new Rectangle(x,y,width,height,color));
			}
			i++;
			x=x+width+20;
			y=y+height+20;
			height=0;
			width=0;
		}
	}

	public ArrayList<Shape> getShapes(){
		ArrayList <Shape> shapes= new ArrayList<Shape>();
		for (Shape s: this.shapes)
		{
			if(s instanceof Circle)
			{
				Circle c= new Circle(s.getX(),s.getY(),s.getWidth(),s.getHeight(),s.getColor());
				shapes.add(c);
			}else if (s instanceof Square)
			{
				Square sq= new Square(s.getX(),s.getY(),s.getWidth(),s.getHeight(),s.getColor());
				shapes.add(sq);
			}else
			{
				Rectangle r= new Rectangle(s.getX(),s.getY(),s.getWidth(),s.getHeight(),s.getColor());
				shapes.add(r);
			}
		}
		return shapes;
	}
	
}
