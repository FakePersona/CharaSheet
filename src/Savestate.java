import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Savestate {
	private JButton saveButton;
	private JButton loadButton;
	public JPanel savePanel;
	
	public Savestate() {
		saveButton = new JButton("Save!");
		loadButton = new JButton("Load");
		savePanel = new JPanel();
		
		saveButton.addActionListener(new save());
		
		savePanel.add(saveButton);
		savePanel.add(loadButton);
	}
	
	private void stringToFile( String text, String fileName ) {
		try {
			File file = new File( fileName );

			if ( ! file.exists( ) ) {
				file.createNewFile( );
			}

			FileWriter fw = new FileWriter( file.getAbsoluteFile( ) );
			BufferedWriter bw = new BufferedWriter( fw );
			bw.write( text );
			bw.close( );
		}
		catch( IOException e ) {
			System.out.println("Error: " + e);
			e.printStackTrace( );
		}
	}
	
	class save implements ActionListener{
	    
	    public void actionPerformed(ActionEvent e) {
	    	String s = "";
	    	s += Main.plop.statDock.strPanel.getStat() + "\n";
	    	s += Main.plop.statDock.dexPanel.getStat() + "\n";
	    	s += Main.plop.statDock.intPanel.getStat() + "\n";
	    	s += Main.plop.statDock.vitPanel.getStat() + "\n";
	    	s += Main.plop.statDock.perPanel.getStat() + "\n";
	    	s += Main.plop.statDock.wisPanel.getStat() + "\n";
	    	stringToFile(s,"test.txt");    
	    }
	  }  
}
