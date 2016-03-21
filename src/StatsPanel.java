import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StatsPanel {
	
	public JPanel main;
	
	private int stat = 0;
	private int bonus = 0;
	private JLabel namePanel;
	private JTextField statField;
	private JLabel bonusPanel;
	
	public void setStat(int n) {
		stat = n;
		update();
	}
	
	public void setBonus(int n) {
		bonus = 0;
		update();
	}
	
	public void update() {
		statField.setText(Integer.toString(stat));
		bonusPanel.setText(" + " + bonus);
	}
	
	public StatsPanel(String name) {
		main = new JPanel();
		namePanel = new JLabel(name);
		statField = new JTextField(Integer.toString(stat));
		bonusPanel = new JLabel(" + " + bonus);
		
		main.add(namePanel);
		main.add(statField);
		main.add(bonusPanel);
	}
}
