//******************************************************************************
//   About.java       Java Foundations
//  Author: Miguel A Rodriguez
//  Date: 12/15/2015
//  Course: CSC 112-001
//  Description:
//         This is the about tab in the GUI.
//
//
//******************************************************************************
//         UML Diagram for main Application
//         ************************************************************************************
//           Application Class
//          ***********************************************************************************
//Class:      About.java
//          ***********************************************************************************
//Variables&Objects:
//
//          ************************************************************************************
//Methods:   main(String[] args)
//
//          *************************************************************************************

//   ********************************************************************************************
//       Program Logic:
//                     1) Helper class
//                     2) creates a about tab
//
//
//  **********************************************************************************************

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setTitle("About");
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JTextArea txtrAuthorMiguelRodriguez = new JTextArea();
		txtrAuthorMiguelRodriguez.setEnabled(false);
		txtrAuthorMiguelRodriguez.setWrapStyleWord(true);
		txtrAuthorMiguelRodriguez.setEditable(false);
		txtrAuthorMiguelRodriguez.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAuthorMiguelRodriguez.setForeground(Color.WHITE);
		txtrAuthorMiguelRodriguez.setBackground(Color.BLACK);
		txtrAuthorMiguelRodriguez.setText("           \r\n       Author: Miguel Rodriguez\r\n       Version: 5.0\r\n       Release Date: 12/04/15\r\n       miguelrdrgz47@gmail.com\r\n       @all rights reserved\r\n                                 ");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(txtrAuthorMiguelRodriguez, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(txtrAuthorMiguelRodriguez, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
