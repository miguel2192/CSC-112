//******************************************************************************
//  AppWindow.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 12/15/2015
//  Course: CSC 112-001
//  Description:
//         This the GUI class that calls the main program and runs it.
//
//
//******************************************************************************
//         UML Diagram for main Application
//         ************************************************************************************
//           Application Class
//          ***********************************************************************************
//Class:      AppWindow.java
//          ***********************************************************************************
//Variables&Objects:
//
//          ************************************************************************************
//Methods:   main(String[] args)
//
//          *************************************************************************************

//   ********************************************************************************************
//       Program Logic:
//                     1) Helper class window
//                     2) creates the main GUI
//
//
//  **********************************************************************************************
import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

public class AppWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}
	
	//Program program = new Program();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AppWindow.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 582, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblWelcomeToLibrary = new JLabel("Welcome to Library Manager");
		lblWelcomeToLibrary.setForeground(SystemColor.desktop);
		lblWelcomeToLibrary.setFont(new Font("Airstrike", Font.BOLD, 29));
		
		JButton btnNewButton = new JButton("Enter Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{//catch IOException
					  LibManager.main();//calls the main program
					}catch(IOException e){
					  e.printStackTrace();
					}
			}
		});
		btnNewButton.setFont(new Font("Airstrike", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(158)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(172, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(374, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(200))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(554, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(lblWelcomeToLibrary, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWelcomeToLibrary, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.setForeground(UIManager.getColor("Button.darkShadow"));
		menuBar.setBackground(new Color(0, 0, 0));
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setForeground(new Color(255, 255, 255));
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnFile);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(btnExit);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setForeground(new Color(255, 255, 255));
		mnAbout.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnAbout);
		
		JButton btnAbout = new JButton("About");
		mnAbout.add(btnAbout);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = new About();
				about.setVisible(true);
				
			
			}
		});
	}
}
