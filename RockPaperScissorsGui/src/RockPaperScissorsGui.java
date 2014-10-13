import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JLabel;


public class RockPaperScissorsGui {

	private JFrame frmGame;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissorsGui window = new RockPaperScissorsGui();
					window.frmGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RockPaperScissorsGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGame = new JFrame();
		frmGame.setTitle("Game");
		frmGame.setBounds(100, 100, 450, 300);
		frmGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGame.getContentPane().setLayout(null);
		
	

		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Rock");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNum;
				int users = 1;
				randomNum = 1 + (int)(Math.random() * 3);
				
				if (users == randomNum)
				{
					lblNewLabel.setText("Tied");
				}
				else if (users < randomNum && randomNum != 3)
				{
					lblNewLabel.setText("Paper beats rock. You loose");
				}
				else 
				{
					lblNewLabel.setText("Rock beats scissors. You win");
				}
			}
		});
		rdbtnNewRadioButton.setBounds(22, 53, 109, 23);
		frmGame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Paper");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNum;
				int users = 2;
				randomNum = 1 + (int)(Math.random() * 3);
				
				if (users == randomNum)
				{
					lblNewLabel.setText("Tied");
				}
				else if (users < randomNum)
				{
					lblNewLabel.setText("Scissors beats paper. You loose");
				}
				else if (users > randomNum)
				{
					lblNewLabel.setText("Paper beats rock. You win");
				}
				
			}
		});
		rdbtnNewRadioButton_1.setBounds(22, 79, 109, 23);
		frmGame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Scissor");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNum;
				int users = 3;
				randomNum = 1 + (int)(Math.random() * 3);
				
				if (users == randomNum)
				{
					lblNewLabel.setText("Tied");
				}
				else if (randomNum == 2)
				{
					lblNewLabel.setText("Scissors beats paper. You win");
				}
				else 
				{
					lblNewLabel.setText("Rock beats Scissors. You loose");
				}
			}
		});
		rdbtnNewRadioButton_2.setBounds(22, 105, 109, 23);
		frmGame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JLabel lblChooseRockPaper = new JLabel("Choose Rock Paper or Scissors");
		lblChooseRockPaper.setBounds(10, 23, 208, 23);
		frmGame.getContentPane().add(lblChooseRockPaper);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(195, 95, 193, 75);
		frmGame.getContentPane().add(lblNewLabel);
	}
}
