import javax.swing.JOptionPane;

public class Games {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Lets Play Rock Papers or Scissors");
		String users =
				JOptionPane.showInputDialog("Press 1 for Rock\nPress 2 for Paper\nPress 3 for Scissors");
		
		int user =Integer.parseInt(users);
		
		Game games = new Game(user);
		
		games.display();
		
	}
}
