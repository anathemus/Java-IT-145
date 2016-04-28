/*
Benjamin Burgess
7-3 Problem : reverseDigit

Write a method, reverseDigit, that takes an integer as a parameter and returns 
the number with its digits reversed. For example, the value of 
reverseDigit(12345) is 54321. Also, write a program to test your method.
*/

// import the ability to make a dialog box
import javax.swing.JOptionPane;

public class ProblemReverseDigit
{

   public static void main(String[] args)
   {
   /* Declare variables to store the number, reverse the number
   due to modulo outputting smallest digits first,
   separate numbers and the sum.*/
   int inputDigit;
   String reversedDigit;
   
   String outputStr;
    
   
   
    
   // initialize input dialog to get the number
      String userInputString = JOptionPane.showInputDialog
                                    ("Enter an integer: ");
   
   // Parse values from inputs
   inputDigit = Integer.parseInt(userInputString);
   
   reversedDigit = reverseDigit(inputDigit);
   
   // Begin set up of output string
   outputStr = "Reversed number: " + reversedDigit;
      
   // Output the reversed number
   JOptionPane.showMessageDialog(null, outputStr, "Answer",
               JOptionPane.INFORMATION_MESSAGE);
               
   System.exit(0);
   }
   
   //method reverseDigit
   public static String reverseDigit(int inputDigit)
   {
      String reverseDigit = "";
      while((inputDigit % 10) != 0)
      {
         reverseDigit += inputDigit %10;
         inputDigit = inputDigit / 10;
      }
   return reverseDigit;
   
   }
   
}