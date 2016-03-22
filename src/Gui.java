import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Gui {
	public JFrame gui;
	public StatDock statDock;
	private Savestate savestate;
	public HeaderPanel header;
	private int width = 400;
	private int height = 600; 
	
	public Gui() {
		gui = new JFrame();
		
		gui.getContentPane().setLayout(new BorderLayout());
		
		gui.setSize(width, height);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		statDock = new StatDock();

		gui.add(statDock.main,BorderLayout.WEST);
		
		savestate = new Savestate();
		gui.add(savestate.savePanel,BorderLayout.SOUTH);
		
		header = new HeaderPanel();
		gui.add(header.nameField,BorderLayout.NORTH);
		
		gui.setVisible(true);
	}
}
