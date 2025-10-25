import java.util.*;
class Calculator
{
   public static void main (String[] args)
   {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("This is a Calculator Program!");
           int res ;
         do {
           System.out.println("Enter Your Choice..");
           System.out.println("Press 1 for advanced calculation and 2 for basic calculation..");
           int c = sc.nextInt();
           if (c==1) {
               System.out.println("Press 1 for Roots and 2 for Powers..");
               int d = sc.nextInt();
              if (d==1) {
                  System.out.println("Press 1 for Square Roots and 2 for Cube Roots..");
                  int e = sc.nextInt();
                  if (e==1) {
                    System.out.println("Enter a number..");
                     int f = sc.nextInt(); 
                     System.out.println(Math.sqrt(f));
                  } else {
                    System.out.println("Enter a number..");
                     int g = sc.nextInt(); 
                     System.out.println(Math.cbrt(g));
                  }
              } else {
                 System.out.println("Enter a number..");
                 int h = sc.nextInt(); 
                 System.out.println("Enter Power..");
                 int i = sc.nextInt(); 
                 double r = Math.pow(h, i);
                 System.out.println(r+"");
              }
           } else {
           System.out.println("Enter a number - An operator - Another number:");
           int a = sc.nextInt();
           char op = sc.next().charAt(0);
           int b = sc.nextInt();
           switch (op) {
               case '+' -> System.out.println((a + b)+"");
               case '-' -> System.out.println((a - b)+"");     
                case '*' -> System.out.println((a * b)+"");
                case '/' -> System.out.println((a / b)+"");
                case '%' -> System.out.println((a % b)+"");
               default -> throw new AssertionError();
           }
        }
        System.out.println("Do you wish to continue further again?.. Press 1 for Yes and 0 for No");
           res = sc.nextInt();
    } while (res ==1) ; 
       }
   }
}