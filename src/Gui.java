import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
	private JFrame gui;
	private StatDock statDock;
	private int width = 400;
	private int height = 600;
	
	public Gui() {
		gui = new JFrame();
		
		gui.setSize(width, height);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		statDock = new StatDock();

		statDock.strPanel.setStat(5);
		
		gui.add(statDock.main);
		
		gui.setVisible(true);
	}
}
