package mainUI;

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

import ui.BottomBar;
import ui.Menu;

public class Setup extends JPanel implements ActionListener{

	JPanel panel;
	Font f;
	JLabel label;
	JButton add, delete, eoq, tracking;

	public Setup(){
		this.setLayout(new BorderLayout());

		//init
		panel = new JPanel();
		f = new Font("serrif", Font.BOLD, 36);
		label = new JLabel("Setup Inventory");
		add = new JButton("Add");
		delete = new JButton("Delete");
		eoq = new JButton("Set EOQ");
		tracking = new JButton("Set Tracking");

		//details
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		label.setFont(f);

		Dimension spacing = new Dimension(0,25);

		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		add.setAlignmentX(Component.CENTER_ALIGNMENT);
		delete.setAlignmentX(Component.CENTER_ALIGNMENT);
		eoq.setAlignmentX(Component.CENTER_ALIGNMENT);
		tracking.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		add.addActionListener(this);
		delete.addActionListener(this);
		eoq.addActionListener(this);
		tracking.addActionListener(this);

		//adding to MainMenu panel
		panel.add(Box.createRigidArea(spacing));
		panel.add(label);
		panel.add(Box.createRigidArea(spacing));
		panel.add(add);
		panel.add(Box.createRigidArea(spacing));
		panel.add(delete);
		panel.add(Box.createRigidArea(spacing));
		panel.add(eoq);
		panel.add(Box.createRigidArea(spacing));
		panel.add(tracking);
		
		this.add(panel, BorderLayout.CENTER);
		this.add(new BottomBar("Main Menu", Menu.STATE.MAINMENU), BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == add){
			Menu.setState("Add", Menu.STATE.ADD);
		}
		if(source == delete){
			Menu.setState("Delete", Menu.STATE.DELETE);
		}
		if(source == eoq){
			Menu.setState("Set EOQ", Menu.STATE.SETEOQ);
		}
		if(source == tracking){
			Menu.setState("Set Tracking", Menu.STATE.SETTRACKING);
		}


	}

}
