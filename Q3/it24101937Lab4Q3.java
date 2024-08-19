import java.util.Scanner;
    public class it24101937Lab4Q3 {
        public static void main (String [] args) {
            Scanner keyboard = new Scanner (System.in);
            
            System.out.println ("Enter the number you want to compare: ");
            int compareNumber = keyboard.nextInt();
            
            
            String store = compareNumber < 0 ?  "The number you entered is negative" :(compareNumber > 0)? "The number you entered is positive" : "the number would be zero" ;
            System.out.println (store);
            
        
            
            

            
        }
    }
