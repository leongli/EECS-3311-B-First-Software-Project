import java.util.ArrayList;

public class MergeSort {
	private ArrayList<Shape> shapes= new ArrayList<Shape>();
	public MergeSort(ArrayList<Shape>shapes) {
		int x=10,y=10;
		mergeSort(shapes, shapes.size());
		for (int i=0;i<shapes.size();i++)
		{
			Shape s = shapes.get(i);
			if(s instanceof Circle)
			{
				Circle c= new Circle(x,y,s.getWidth(),s.getHeight(),s.getColor());
				this.shapes.add(c);
			}else if (s instanceof Square)
			{
				Square sq= new Square(x,y,s.getWidth(),s.getHeight(),s.getColor());
				this.shapes.add(sq);
			}else
			{
				Rectangle r= new Rectangle(x,y,s.getWidth(),s.getHeight(),s.getColor());
				this.shapes.add(r);
			}
			x=x+s.getWidth()+20;
			y=y+s.getHeight()+20;
		}
	}

	public ArrayList<Shape> getSortedShapes(){
		return shapes;
	}
	public void mergeSort(ArrayList<Shape> shapes, int n) {
		if (n<2) {
			return;
		}
		int mid=n/2;
		ArrayList<Shape> left= new ArrayList<Shape>();
		ArrayList<Shape> right= new ArrayList<Shape>();
		for (int i=0; i<mid; i++)
		{
			left.add(shapes.get(i));
		}
		for (int i=mid; i<n; i++)
		{
			right.add(shapes.get(i));
		}
		mergeSort(left,mid);
		mergeSort(right,n-mid);
		merge(shapes,left,right,mid,n-mid);

	}
	public void merge(ArrayList<Shape> shapes,ArrayList<Shape> left, ArrayList<Shape> right, int l, int r) {
		int i=0, j=0,k=0;
		while (i<l && j< r) {
			if (left.get(i).compareTo(right.get(j))!=1) {
				shapes.add(k, left.get(i));
				shapes.remove(k+1);
				k++;
				i++;
			}else {
				shapes.add(k, right.get(j));
				shapes.remove(k+1);
				k++;
				j++;
			}
		}
		while (i<l) {
			shapes.add(k, left.get(i));
			shapes.remove(k+1);
			k++;
			i++;
		}
		while (j<r) {
			shapes.add(k, right.get(j));
			shapes.remove(k+1);
			k++;
			j++;
		}
	}

}//end MergeSort
