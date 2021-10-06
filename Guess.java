import java.util.Random;

public class Guess{
    private int upper = 100;
    public int newWord(){
        Random rand = new Random();
        int rnum = rand.nextInt(upper);
        return rnum;
    }
    
    public void checkWin(int users, int randoms){
        if(users == randoms){
            System.out.println("You won! The random number was " + randoms);
        }
        else{
            System.out.println("Sorry! You lose, the number was " + randoms);
        }
    }
}