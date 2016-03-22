import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Gui {
	public JFrame gui;
	public StatDock statDock;
	private Savestate savestate;
	private int width = 400;
	private int height = 600; 
	
	public Gui() {
		gui = new JFrame();
		
		gui.getContentPane().setLayout(new BorderLayout());
		
		gui.setSize(width, height);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		statDock = new StatDock();
		statDock.strPanel.setStat(5);
		gui.add(statDock.main,BorderLayout.CENTER);
		
		savestate = new Savestate();
		gui.add(savestate.savePanel,BorderLayout.SOUTH);
		
		gui.setVisible(true);
	}
}
