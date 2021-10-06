import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Guess guess = new Guess();
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you think the number is? (1-100):");
        int userguess = scan.nextInt();
        int randomnum = guess.newWord();
        guess.checkWin(userguess, randomnum);

    }
}