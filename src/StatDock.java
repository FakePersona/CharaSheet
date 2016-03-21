import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatDock {
	public JPanel main;
	
	private JLabel titleLabel = new JLabel("Statistiques");
	private JPanel titlePanel;
	
	public StatsPanel strPanel;
	public StatsPanel dexPanel;
	public StatsPanel intPanel;
	public StatsPanel vitPanel;
	public StatsPanel perPanel;
	public StatsPanel wisPanel;
	
	public StatDock() {
		
		main = new JPanel();
		main.setLayout(new GridLayout(7,1));
		
		titlePanel = new JPanel();
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Serif", Font.BOLD, 40));
		
		strPanel = new StatsPanel("Force");
		dexPanel = new StatsPanel("Dextérité");
		intPanel = new StatsPanel("Intelligence");
		vitPanel = new StatsPanel("Vitalité");
		perPanel = new StatsPanel("Perception");
		wisPanel = new StatsPanel("Sagesse");

		titlePanel.add(titleLabel);
		titlePanel.setBackground(Color.DARK_GRAY);
		main.add(titlePanel);
		
		main.add(strPanel.main);
		main.add(dexPanel.main);
		main.add(intPanel.main);
		main.add(vitPanel.main);
		main.add(perPanel.main);
		main.add(wisPanel.main);
	}
}
