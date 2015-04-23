package test;

import javax.swing.JFrame;

import setupUI.Add;

public class SingleFrame extends JFrame{

	public SingleFrame(){
		//testing component
		this.add(new Add());

		//JFrame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Next Generation Pediatrics");
		this.setResizable(true);
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args){
		new SingleFrame();
	}

}
