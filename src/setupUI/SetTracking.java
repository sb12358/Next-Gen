package setupUI;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import ui.BottomBar;
import ui.Menu;

public class SetTracking extends JPanel{

	public SetTracking(){
		this.setLayout(new BorderLayout());
		
		this.add(new BottomBar("Setup", Menu.STATE.SETUP), BorderLayout.SOUTH);
	}
	
}
