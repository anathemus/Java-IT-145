/*
Benjamin Burgess
4-4 Problem : Sum

Write a program that prompts the user to input an integer and then outputs 
both the individual digits of the number and the sum of the digits. For example,
the program should: ouput the individual digits of 3456 as 3 4 5 6 and the sum 
as 18, output the individual digits of 8030 as 8 0 3 0 and the sum as 11, output
the individual digits of 2345526 as 2 3 4 5 5 2 6 and the sum as 27, output the 
individual digits of 4000 as 4 0 0 0 and the sum as 4, and output the individual
digits of -2345 as 2 3 4 5 and the sum as 14.
*/

// import the ability to make a dialog box
import javax.swing.JOptionPane;

public class ProblemSum
{

   public static void main(String[] args)
   {
   /* Declare variables to store the number, reverse the number
   due to modulo outputting smallest digits first,
   separate numbers and the sum.*/
   int inputNum;
   int separateNum;
   int sum;
   int reverseInputNum;
   int counter;
   String reverseInputStr;
   String outputStr;
    
   
   // initialize sum
   sum = 0;
    
   // initialize input dialog to get the number
      String userInputString = JOptionPane.showInputDialog
                                    ("Enter an integer: ");
   
   // Parse values from inputs
   inputNum = Integer.parseInt(userInputString);
   
   // Begin set up of output string
   outputStr = (String.format("Separated numbers:"));
   reverseInputStr = "";
   reverseInputNum = 0;
   
   while((inputNum % 10) != 0)
   {
      separateNum = inputNum %10;
      reverseInputStr = reverseInputStr
                      + separateNum;
      sum = sum
          + separateNum;
          
     inputNum = inputNum / 10;
   }
   
   // Convert reverseInputStr to reverseInputNum, rinse and repeat
   reverseInputNum = Integer.parseInt(reverseInputStr);
   
   while((reverseInputNum % 10) != 0)
   {
      separateNum = reverseInputNum % 10;
      outputStr = outputStr
                + " "
                + separateNum;
                
      reverseInputNum = reverseInputNum / 10;
   }
   
   // Finish output string
   
   outputStr = outputStr
             + " Total sum of separated numbers: "
             + sum;
   
   // Output the non-descending order rounded to two decimals
   JOptionPane.showMessageDialog(null, outputStr, "Answer",
               JOptionPane.INFORMATION_MESSAGE);
               
   System.exit(0);
   }
   
}