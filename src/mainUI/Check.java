package mainUI;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check extends JFrame  {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 * test
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check frame = new Check();
					
					frame.setVisible(true);
					frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Check() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton loadBut = new JButton("Load Inventory");
		loadBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
		        PreparedStatement pstmt = null;
		        try {
		        	Class.forName("com.mysql.jdbc.Driver");
		            conn = DriverManager.getConnection("jdbc:mysql://localhost/IniSys","root","s753b951");
		            pstmt = conn.prepareStatement("SELECT * FROM InventoryRoom");
		            ResultSet rs = pstmt.executeQuery();
		            table.setModel(DbUtils.resultSetToTableModel(rs));
		            
		            
		        
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		contentPane.add(loadBut, BorderLayout.NORTH);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
	}

}
