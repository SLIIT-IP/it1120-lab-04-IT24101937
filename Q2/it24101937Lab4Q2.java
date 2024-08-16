import java.util.Scanner;
    public class it24101937Lab4Q2 {
        public static void main (String [] args) {
            Scanner keyboard = new Scanner (System.in);
            
            System.out.println ("Enter the exam marks: ");

            int examMarks = keyboard.nextInt();
            if (examMarks > 100 || examMarks < 0)
            {
                System.out.println("The exam marks are invalid");
            }
            else
            {
                System.out.println("Enter the submission marks: ");
                int submissionMarks = keyboard.nextInt();
                
                if (submissionMarks > 100 || submissionMarks < 0)
                {
                    System.out.println("The lab marks are invalid");
                }
                else
                {
                    
                    
                    
                    System.out.println("Enter the exam percentage mark:");
                    int examPercentage = keyboard.nextInt();
                    System.out.println("Enter the lab persantage:");
                    int labPercentage = keyboard.nextInt();
                    double finalExamMarks = examMarks * examPercentage/100;
                    double fianlLabMArks = submissionMarks * labPercentage / 100;
                    double totalMarks = finalExamMarks + fianlLabMArks ;

                    if (totalMarks <= 100)
                    {
                        System.out.println("Final marks are:" + totalMarks);
                    }
                    else
                    {
                        System.out.println("The pecentage does not add up");
                    }
                
                
                
                }


                    

                
            
            }

        }
    }