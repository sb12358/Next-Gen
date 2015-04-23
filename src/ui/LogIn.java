package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LogIn extends JPanel implements ActionListener{
	
	JPanel gridComponents;
	JTextField userNameField;
	JPasswordField userPasswordField;
	JButton submit, reset;
	JLabel unLabel, pwLabel;
	
	public LogIn(){
		//initializing all components
		gridComponents = new JPanel();
		userNameField = new JTextField();
		userPasswordField = new JPasswordField();
		submit = new JButton("Submit");
		reset = new JButton("Reset");
		unLabel = new JLabel("Username:", SwingConstants.RIGHT);
		pwLabel = new JLabel("Password:", SwingConstants.RIGHT);
		
		//customization
		submit.addActionListener(this);
		submit.setFocusable(false);
		reset.addActionListener(this);
		reset.setFocusable(false);
		
		userNameField.setPreferredSize(new Dimension(190,30));
		userPasswordField.setPreferredSize(new Dimension(190,30));
		
		//general layout
		this.setLayout(new BorderLayout());
		
		//CENTER component layout
		gridComponents.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints(); //used for positioning
		
		//un label
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		gridComponents.add(unLabel, c);
		
		//un field
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 2;
		gridComponents.add(userNameField, c);
		
		//pw label
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		gridComponents.add(pwLabel, c);
		
		//un field
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 2;
		gridComponents.add(userPasswordField, c);
		
		//submit button
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		gridComponents.add(submit, c);
		
		//reset button
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		gridComponents.add(reset, c);
		
		this.add(new Logo(), BorderLayout.NORTH);
		this.add(gridComponents, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		Object ae = e.getSource();
		if(ae.equals(submit)){
			String name = userNameField.getText();
			char[] pw = userPasswordField.getPassword();
			
			//checking if correct password
			Boolean login = isPasswordCorrect(pw);
			if(login){
				Menu.setState("Main Menu", Menu.STATE.MAINMENU);
				System.out.println("yay"); //successful login only based on PW, not usernae
			}
		}
		else if(ae.equals(reset)){
			userNameField.setText("");
			userPasswordField.setText("");
		}
	}
	
	//UPDATE BASED ON USERNAME AND PASS VERIFICATION
	private boolean isPasswordCorrect(char[] input){
		boolean isCorrect = true;
		char[] correctPassword = {'t', 'e', 's', 't'};
		
		if(input.length != correctPassword.length){
			isCorrect = false;
		}
		else{
			isCorrect = Arrays.equals(input, correctPassword);
		}
		
		Arrays.fill(correctPassword, '0');
		
		userNameField.setText("");
		userPasswordField.setText("");
		
		return isCorrect;
	}

}