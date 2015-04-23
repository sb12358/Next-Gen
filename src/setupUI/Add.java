package setupUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ui.*;

public class Add extends JPanel implements ActionListener{

	JPanel panel;
	Font f;
	JLabel label;

	JPanel addPanel;
	JTextField itemNumber, 
		itemName,
		itemEOQ,
		itemSize,
		itemPackage,
		itemLocation,
		itemQuantity;
	JLabel itemNumberLabel,
		itemNameLabel,
		itemEOQLabel,
		itemSizeLabel,
		itemPackageLabel,
		itemLocationLabel,
		itemQuantityLabel;
	
	JButton clear, submit;

	public Add(){
		this.setLayout(new BorderLayout());

		//init
		addPanel = new JPanel();

		itemNumber = new JTextField();
		itemName = new JTextField();
		itemEOQ = new JTextField();
		itemSize = new JTextField();
		itemPackage = new JTextField();
		itemLocation = new JTextField();
		itemQuantity = new JTextField();

		itemNumberLabel = new JLabel("Item Number: ", SwingConstants.RIGHT);
		itemNameLabel = new JLabel("Item Name: ", SwingConstants.RIGHT);
		itemEOQLabel = new JLabel("Item EOQ: ", SwingConstants.RIGHT);
		itemSizeLabel = new JLabel("Size: ", SwingConstants.RIGHT);
		itemPackageLabel = new JLabel("Package Count: ", SwingConstants.RIGHT);
		itemLocationLabel = new JLabel("Location: ", SwingConstants.RIGHT);
		itemQuantityLabel = new JLabel("Initial Quantity: ", SwingConstants.RIGHT);
		
		clear = new JButton("Clear");
		submit = new JButton("Submit");

		//details
		addPanel.setLayout(new GridBagLayout());

		itemNumber.setActionCommand("Item Number");
		itemName.setActionCommand("Item Name");
		itemEOQ.setActionCommand("Item EOQ");
		itemSize.setActionCommand("Item Size");
		itemPackage.setActionCommand("Item Package");
		itemLocation.setActionCommand("Item Location");
		itemQuantity.setActionCommand("Item Quantity");
		
		itemNumber.setPreferredSize(new Dimension(200,30));
		itemName.setPreferredSize(new Dimension(200,30));
		itemEOQ.setPreferredSize(new Dimension(200,30));
		itemSize.setPreferredSize(new Dimension(200,30));
		itemPackage.setPreferredSize(new Dimension(200,30));
		itemLocation.setPreferredSize(new Dimension(200,30));
		itemQuantity.setPreferredSize(new Dimension(200,30));

		itemNumberLabel.setLabelFor(itemNumber);
		itemNameLabel.setLabelFor(itemName);
		itemEOQLabel.setLabelFor(itemEOQ);
		itemSizeLabel.setLabelFor(itemSize);
		itemPackageLabel.setLabelFor(itemPackage);
		itemLocationLabel.setLabelFor(itemLocation);
		itemQuantityLabel.setLabelFor(itemQuantity);
		
		clear.setForeground(new Color(0xCC, 0x1F, 0x00));
		submit.setForeground(new Color(0x38, 0xA3, 0x1C));
		
		clear.addActionListener(this);
		submit.addActionListener(this);
		
		//Adding to GBC layout
		GridBagConstraints gbc;
		
		gbc = createGbc(0,0);
		addPanel.add(itemNumberLabel, gbc);
		gbc = createGbc(1,0);
		gbc.gridwidth = 2;
		addPanel.add(itemNumber, gbc);
		
		gbc = createGbc(0,1);
		addPanel.add(itemNameLabel, gbc);
		gbc = createGbc(1,1);
		gbc.gridwidth = 2;
		addPanel.add(itemName, gbc);
		
		gbc = createGbc(0,2);
		addPanel.add(itemEOQLabel, gbc);
		gbc = createGbc(1,2);
		gbc.gridwidth = 2;
		addPanel.add(itemEOQ, gbc);
		
		gbc = createGbc(0,3);
		addPanel.add(itemSizeLabel, gbc);
		gbc = createGbc(1,3);
		gbc.gridwidth = 2;
		addPanel.add(itemSize, gbc);
		
		gbc = createGbc(0,4);
		addPanel.add(itemPackageLabel, gbc);
		gbc = createGbc(1,4);
		gbc.gridwidth = 2;
		addPanel.add(itemPackage, gbc);
		
		gbc = createGbc(0,5);
		addPanel.add(itemLocationLabel, gbc);
		gbc = createGbc(1,5);
		gbc.gridwidth = 2;
		addPanel.add(itemLocation, gbc);
		
		gbc = createGbc(0,6);
		addPanel.add(itemQuantityLabel, gbc);
		gbc = createGbc(1,6);
		gbc.gridwidth = 2;
		addPanel.add(itemQuantity, gbc);
		
		gbc = createGbc(1,7);
		addPanel.add(clear, gbc);
		gbc = createGbc(2,7);
		addPanel.add(submit, gbc);

		this.add(new TitlePanel("Add Inventory Item"), BorderLayout.NORTH);
		this.add(addPanel, BorderLayout.CENTER);
		this.add(new BottomBar("Setup", Menu.STATE.SETUP), BorderLayout.SOUTH);
	}

	private GridBagConstraints createGbc(int x, int y) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.insets = new Insets(1,1,1,1);

		return gbc;
	}

	public void actionPerformed(ActionEvent ae) {
		Object source = ae.getSource();
		int input = 999; //for compiler
		if(source == submit){
			//SUBMIT FIELDS TO DATABASE
			//such as sending... itemNumberLabel.getText();,...
			//BIN SHAO
		}
		if(source == clear){
			input = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear?", "Clear", JOptionPane.YES_NO_OPTION);
			if(input == 0){
				clearFields();
			}
		}
	}
	
	public void clearFields(){
		itemNumber.setText("");
		itemName.setText("");
		itemEOQ.setText("");
		itemSize.setText("");
		itemPackage.setText("");
		itemLocation.setText("");
		itemQuantity.setText("");
	}
	
}
