import javax.swing.JOptionPane;

public class Games {
    public static void main(String[] args) {
    	int randomNum;
        
        JOptionPane.showMessageDialog(null,"Lets Play Rock Papers or Scissors");
        String low =
                JOptionPane.showInputDialog("How low you want the random number: (Can't go below 1)");
        String high =
                JOptionPane.showInputDialog("How high you want the random number: (Can't go above 10)");
        String users =
                JOptionPane.showInputDialog("Press 1,4,7, or 10 for Rock\nPress 2,5, or 8 for Paper\nPress 3,6 or 9 for Scissors");
        
        int user =Integer.parseInt(users);
        int lo =Integer.parseInt(low);
        int hi =Integer.parseInt(high);
        
        RandomNumber games = new RandomNumber(lo, hi);
        
        randomNum = games.SendANumber();
        
        
        if (user == 4 || user == 7 || user == 10)
        	user = 1;
        else if (user == 5 || user == 8)
        	user = 2;
        else if (user == 6 || user == 9)
        	user = 3;
        
        if (randomNum == 4 || randomNum == 7 || randomNum == 10)
        	randomNum = 1;
        else if (randomNum == 5 || randomNum == 8)
        	randomNum = 2;
        else if (randomNum == 6 || randomNum == 9)
        	randomNum = 3;
        
        
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

