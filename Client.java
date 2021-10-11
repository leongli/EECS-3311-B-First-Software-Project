import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {
	protected static ArrayList <Shape> shapes= new ArrayList<Shape>();
	protected static JFrame frame = new JFrame("Display shapes");	
	public static void main(String[] args) {		

		JPanel ini = new JPanel();
		JButton load= new JButton();		
		JButton sort= new JButton();
		load.setText("Load Shapes");
		sort.setText("Sort Shapes");
		ini.add(load);
		ini.add(sort);
		frame.add(ini);

		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShapeFactory make= new ShapeFactory();
				shapes=make.getShapes();
//				System.out.println(shapes.isEmpty());
				Draw panel= new Draw(shapes);
				panel.add(load);
				panel.add(sort);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(900, 600);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MergeSort ms= new MergeSort(shapes);
				shapes=ms.getSortedShapes();
				Draw panel= new Draw(shapes);
				panel.add(load);
				panel.add(sort);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(900, 600);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
