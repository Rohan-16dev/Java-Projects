import java.util.*;
class num_guess_game
{
    public static void main(String[] args)
    {
       try{ Scanner sc = new Scanner(System.in);
        System.out.println("This is a number guessing game!");
        System.out.println("Guess a number between 0 and 100.");
        int num = (int) (Math.random() * 100);
        System.out.println("Guess a number:");
        int t = 0;
        do{ int n = sc.nextInt();
        if (n>num) {
            System.out.println("Too large");
        } else if (n<num){
            System.out.println("Too small");
        }
        else {
            System.out.println("Bingo! The number was "+ num+".");
            t=1;
            sc.close();
        }
    } while(t==0);
   }
   finally { System.out.println(" ");}
 }
}