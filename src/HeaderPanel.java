import javax.swing.JPanel;
import javax.swing.JTextField;


public class HeaderPanel {
	public JPanel main;
	
	public JTextField nameField;
	
	public String getName() {
		return nameField.getText();
	}
	
	public HeaderPanel() {
		main = new JPanel();
		
		nameField = new JTextField();
		
		main.add(nameField);
	}
}
