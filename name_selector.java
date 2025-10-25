import java.util.*;
class name_selector {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("This is a name selector program!");
            System.out.println("Enter number of people taking part...");
            int n = sc.nextInt();
            ArrayList<String> names = new ArrayList<>();
            System.out.println("Enter names...");
             for (int i = 0; i < n; i++) {
                String s = sc.next();
                names.add(s);
            }   
            int a = (int) (Math.random()*n);
            System.out.println("The person selected is " + names.get(a) + "!");
        }
    }
}