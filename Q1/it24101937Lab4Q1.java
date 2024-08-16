import java.util.Scanner;
    public class it24101937Lab4Q1 {
        public static void main (String [] args) {
            Scanner keyboard = new Scanner (System.in);
            
            System.out.println ("Entyer the number you want to compare: ");
            long compareNumber = keyboard.nextInt();
            
            if (compareNumber == 0)
            {
                System.out.println("The number you entered is zero");
            }
            else if (compareNumber < 0)
            {
                System.out.println("The number you entered is negative");
            }
            else
            {
                System.out.println("The number you entered is positive");
                
            }
        }
    }