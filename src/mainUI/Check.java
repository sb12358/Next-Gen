package mainUI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ui.BottomBar;
import ui.Menu;

public class Check extends JPanel{
	
	//COMMENT TESTING
	
	//TEST #2
	
	JLabel label = new JLabel("Check");
	
	public Check(){
		this.setLayout(new BorderLayout());
		
		this.add(label);
		
		this.add(new BottomBar("Main Menu", Menu.STATE.MAINMENU), BorderLayout.SOUTH);
	}

}
