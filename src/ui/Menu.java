package ui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import setupUI.*;
import mainUI.*;

public class Menu extends JFrame{
	
	static JPanel cardHolder;
	static CardLayout cards;
	final static String lButton = "Log In";
	final static String mmButton = "Main Menu";
	//mainUI
	final static String sButton = "Setup";
	final static String cButton = "Check";
	final static String rButton = "Receive";
	final static String muButton = "Manage Users";
	//setupUI
	final static String aButton = "Add";
	final static String dButton = "Delete";
	final static String seButton = "Set EOQ";
	final static String stButton = "Set Tracking";
	
	public enum STATE{
		LOGIN,
		MAINMENU,
		//mainUI
		SETUP,
		CHECK,
		RECEIVE,
		MANAGEUSERS,
		//setupUI
		ADD,
		DELETE,
		SETEOQ,
		SETTRACKING
	};
	
	static STATE State = STATE.LOGIN;
	
	public Menu(){
		//CardLayout
		cardHolder = new JPanel();
		cards = new CardLayout();
		cardHolder.setLayout(cards);
			
		//cardHolder.add(mainMenu, mmButton);
		cardHolder.add(new LogIn(), lButton);
		cardHolder.add(new MainMenu(), mmButton);
		cardHolder.add(new Setup(), sButton);
		cardHolder.add(new Check(), cButton);
		cardHolder.add(new Receive(), rButton);
		cardHolder.add(new ManageUsers(), muButton);
		cardHolder.add(new Add(), aButton);
		cardHolder.add(new Delete(), dButton);
		cardHolder.add(new SetEOQ(), seButton);
		cardHolder.add(new SetTracking(), stButton);
				
		this.add(cardHolder);

		//JFrame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Next Generation Pediatrics");
		this.setResizable(true);
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void setState(String buttonName, STATE stateName){
		System.out.println(buttonName + " " + stateName);
		cards.show(cardHolder, buttonName);
		State = stateName;
	}
}
