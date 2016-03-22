import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		loadButton.addActionListener(new load());
		
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
	    	stringToFile(s,Main.plop.header.getName() + ".txt");    
	    }
	  }  
	
	public String[] readLines(String filename) {
		List<String> lines = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			bufferedReader.close();
		} catch (IOException x) {
		    System.err.println(x);
		} finally {
			return lines.toArray(new String[lines.size()]);
		}
    }
	
	class load implements ActionListener{
	    
	    public void actionPerformed(ActionEvent e) {
	    	String[] s = readLines(Main.plop.header.getName() + ".txt");
	    	Main.plop.statDock.strPanel.setStat(Integer.valueOf(s[0]));
	    	Main.plop.statDock.dexPanel.setStat(Integer.valueOf(s[1]));
	    	Main.plop.statDock.intPanel.setStat(Integer.valueOf(s[2]));
	    	Main.plop.statDock.vitPanel.setStat(Integer.valueOf(s[3]));
	    	Main.plop.statDock.perPanel.setStat(Integer.valueOf(s[4]));
	    	Main.plop.statDock.wisPanel.setStat(Integer.valueOf(s[5]));
	    }
	  }  
}
