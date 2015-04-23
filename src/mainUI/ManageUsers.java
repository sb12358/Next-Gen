package mainUI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ui.BottomBar;
import ui.Menu;

public class ManageUsers extends JPanel{
	
	JLabel label = new JLabel("Manage Users");
	
	public ManageUsers(){
		this.setLayout(new BorderLayout());
		
		this.add(label);
		
		this.add(new BottomBar("Main Menu", Menu.STATE.MAINMENU), BorderLayout.SOUTH);
	}

}
