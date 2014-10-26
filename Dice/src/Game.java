
public class Game {
   
    private int userDice;
    private int histories[] = new int [userDice + 1];
   
    public Game(int dices)
    {
        userDice = dices;
    }
   
    public int Throw ()
    {
        int totals = 0;
        int roll;        
       
        for (int i = 0; i < userDice; i++)
        {
            roll = 1 + (int)(Math.random() * 6);
            System.out.print(roll);
            System.out.print(", ");
            totals += roll;           
        }
        System.out.println();
        return totals;
    }

    public int Value ()
    {
        return Throw();
    }
}