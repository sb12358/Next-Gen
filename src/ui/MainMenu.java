package ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel implements ActionListener{

	JPanel panel;
	Font f;
	JLabel label;
	JButton setup, check, receive, manageUsers;

	public MainMenu(){		
		this.setLayout(new BorderLayout());
		
		//init
		panel = new JPanel();
		f = new Font("serrif", Font.BOLD, 36);
		label = new JLabel("Main Menu");
		setup = new JButton("Setup Inventory");
		check = new JButton("Check Inventory");
		receive = new JButton("Receive Inventory");
		manageUsers = new JButton("Manage Users");

		//details
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		label.setFont(f);

		Dimension spacing = new Dimension(0,25);

		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		setup.setAlignmentX(Component.CENTER_ALIGNMENT);
		check.setAlignmentX(Component.CENTER_ALIGNMENT);
		receive.setAlignmentX(Component.CENTER_ALIGNMENT);
		manageUsers.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		setup.addActionListener(this);
		check.addActionListener(this);
		receive.addActionListener(this);
		manageUsers.addActionListener(this);
		
		//adding to MainMenu panel
		panel.add(Box.createRigidArea(spacing));
		panel.add(label);
		panel.add(Box.createRigidArea(spacing));
		panel.add(setup);
		panel.add(Box.createRigidArea(spacing));
		panel.add(check);
		panel.add(Box.createRigidArea(spacing));
		panel.add(receive);
		panel.add(Box.createRigidArea(spacing));
		panel.add(manageUsers);

		this.add(panel, BorderLayout.CENTER);
		this.add(new BottomBar(), BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == setup){
			Menu.setState("Setup", Menu.STATE.SETUP);
		}
		if(source == check){
			Menu.setState("Check", Menu.STATE.CHECK);
		}
		if(source == receive){
			Menu.setState("Receive", Menu.STATE.RECEIVE);
		}
		if(source == manageUsers){
			Menu.setState("Manage Users", Menu.STATE.MANAGEUSERS);
		}

	}

}
