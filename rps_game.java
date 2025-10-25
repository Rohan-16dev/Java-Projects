import java.util.*;
public class rps_game {
    public static void main(String[] args) {
       try ( Scanner sc = new Scanner(System.in);)
       { System.out.println("This is a Rock Papers Scissors Game!");
        System.out.println("You Ready?");
        //String op[] = {"Rock","Paper","Scissor"};
        int t=5;
        int com = 0;
        int user=0;
        do { 
            int c = (int)(Math.random()*3);
            System.out.println("Enter R for Rock, P for Paper and S for Scissors!");
            System.out.println("Press 0 to END!");
            char ch = sc.next().charAt(0);
           switch (ch) {
               case 'R' -> {
                   switch (c) {
                       case 0 -> {
                           System.out.println("The computer chose Rock!");
                           System.out.println("Its a tie!");
                       }
                       case 1 -> {
                           System.out.println("The computer chose Paper!");
                           System.out.println("Computer won!");
                           com++;
                       }
                       default -> {
                           System.out.println("The computer chose Scissors!");
                           System.out.println("You won!");
                           user++;
                       }
                   }
               }


               case 'P' -> {
                switch (c) {
                    case 0 -> {
                        System.out.println("The computer chose Rock!");
                        System.out.println("You won!");
                        user++;
                    }
                    case 1 -> {
                        System.out.println("The computer chose Paper!");
                        System.out.println("Its a tie!");
                    }
                    default -> {
                        System.out.println("The computer chose Scissors!");
                        System.out.println("Computer won!");
                        com++;
                    }
                }
               }
               case 'S' -> {
                switch (c) {
                    case 0 -> {
                        System.out.println("The computer chose Rock!");
                        System.out.println("Computer won!");
                        com++;
                    }
                    case 1 -> {
                        System.out.println("The computer chose Paper!");
                        System.out.println("You won!");
                        user++;
                    }
                    default -> {
                        System.out.println("The computer chose Scissors!");
                        System.out.println("Its a tie!");
                    }
                }
               }
               case '0' -> t++;
               default -> System.out.println("Invalid Input!");
           }
         System.out.println("Computer:"+ com +", You:"+ user);
      } while (t==5);
      sc.close();
    } 
      }
 }