import javax.swing.JOptionPane;

public class Games {
    public static void main(String[] args) {
    	int randomNum;
        
        JOptionPane.showMessageDialog(null,"Lets Play Rock Papers or Scissors");
      
        String users =
                JOptionPane.showInputDialog("Press 1 for Rock\nPress 2 for Paper\nPress 3 for Scissors");
        
        int user =Integer.parseInt(users);
        
        
        RandomNumber games = new RandomNumber();
        
        randomNum = games.GetRandom();
        
        
        if (user == randomNum)
        {
            JOptionPane.showMessageDialog(null,"Tied");
        }
        else if (user == 1 )
        {
            if (user < randomNum && randomNum != 3)
            {
                JOptionPane.showMessageDialog(null,"Paper beats rock. You loose");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Rock beats scissors. You win");
            }
        }
        else if (user == 2)
        {
            if (user < randomNum)
            {
                JOptionPane.showMessageDialog(null,"Scissors beats paper. You loose");
            }
            else if (user > randomNum)
            {
                JOptionPane.showMessageDialog(null,"Paper beats rock. You win");
            }
        }
        else if (user == 3)
        {
            if (randomNum == 2)
            {
                JOptionPane.showMessageDialog(null,"Scissors beats paper. You win");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Rock beats Scissors. You loose");
            }
        }
        
    }
}

