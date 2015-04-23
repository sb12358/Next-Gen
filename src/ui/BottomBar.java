package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import ui.Menu.STATE;

public class BottomBar extends JPanel implements ActionListener{
	
	JButton back, logout;
	String buttonName;
	STATE stateName;
	
	public BottomBar(){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		logout = new JButton("Logout");
		
		logout.addActionListener(this);
		
		this.add(Box.createHorizontalGlue());
		this.add(logout);
	}
	
	public BottomBar(String buttonName, STATE stateName){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.buttonName = buttonName;
		this.stateName = stateName;
		
		back = new JButton("Back");
		logout = new JButton("Logout");
		
		back.addActionListener(this);
		logout.addActionListener(this);
		
		this.add(back);
		this.add(Box.createHorizontalGlue());
		this.add(logout);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == back){
			Menu.setState(buttonName, stateName);
		}
		if(source == logout){
			Menu.setState("Log In", Menu.STATE.LOGIN);
		}
	}

}
