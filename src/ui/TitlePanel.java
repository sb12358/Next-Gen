package ui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel{

	Font f;
	JLabel label;

	public TitlePanel(String title){
		f = new Font("serrif", Font.BOLD, 30);
		label = new JLabel(title);

		//details
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		label.setFont(f);

		Dimension spacing = new Dimension(0,10);

		label.setAlignmentX(Component.CENTER_ALIGNMENT);

		this.add(Box.createRigidArea(spacing));
		this.add(label);
	}

}
