import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Dice {

	private JFrame frame;
	private JTextField textField;
	private JLabel label;
	private JLabel lblDiceGame;
	private JLabel lblNewLabel;
	private JLabel lblBetween;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice window = new Dice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnter = new JLabel("Guess the Number");
		lblEnter.setBounds(147, 55, 126, 33);
		frame.getContentPane().add(lblEnter);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(240, 121, -77, 20);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
		});
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dice = 1 + (int)(Math.random() * 6);
				String input = textField.getText();
				int number = Integer.parseInt(input);
				
				lblNewLabel.setText("Dice rolled a " + dice);
				
				if (number == dice)
				{
					label.setText("You guessed it");
				}
                else if (number > dice)
                {
                    if (number > 3)
                    {
                        label.setText("Too high. Try again");
                    }
                    else 
                    {
                        label.setText("Almost there");
                    }
                }
                else if (number < dice)
                {
                    if (number < 4)
                    {
                    	label.setText("Too Low.");
                    }
                    else 
                    {
                        label.setText("Almost there");
                    }
                }
			}
		});
		textField.setBounds(147, 110, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(147, 178, 126, 26);
		frame.getContentPane().add(label);
		
		lblDiceGame = new JLabel("Dice Game");
		lblDiceGame.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDiceGame.setBounds(135, 11, 126, 33);
		frame.getContentPane().add(lblDiceGame);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(147, 141, 93, 26);
		frame.getContentPane().add(lblNewLabel);
		
		lblBetween = new JLabel("Between 1 - 6");
		lblBetween.setBounds(147, 84, 114, 14);
		frame.getContentPane().add(lblBetween);
	}
}
