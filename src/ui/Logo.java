package ui;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Logo extends JPanel{
	
	public Logo(){
		try {
			BufferedImage logo = ImageIO.read(new File("ngp.png"));
			Image dimg = logo.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
			JLabel picLabel = new JLabel(new ImageIcon(dimg), SwingConstants.LEFT);
			this.add(picLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
