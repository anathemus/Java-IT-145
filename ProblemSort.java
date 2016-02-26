/*
Benjamin Burgess
3-3 Problem : Sort

Write a program that prompts the user to input three numbers. This program should then output the numbers in nondescending order.
*/

// import the ability to make a dialog box
import javax.swing.JOptionPane;

public class ProblemSort
{

   public static void main(String[] args)
   {
   // Declare variables to store the three numbers.
   double first;
   double second;
   double third;
   String outputStr;
    
   // initialize input dialogs to get the three numbers
      String firstString = JOptionPane.showInputDialog
                                    ("Enter the first number: ");
      String secondString = JOptionPane.showInputDialog
                                    ("Enter the second number: ");
      String thirdString = JOptionPane.showInputDialog
                                    ("Enter the third number: ");
   
   // Parse values from inputs
   first = Double.parseDouble(firstString);
   second = Double.parseDouble(secondString);
   third = Double.parseDouble(thirdString);
   
   // figure out which order to put the numbers in
   if (first >= second && first >= third)
   {
      if (second >= third)
      {
         // Set up the output string
         outputStr = (String.format
               ("Non-descending order: %.2f, %.2f, %.2f", third, second, first));
      }
      else
      {
         // Set up the output string
         outputStr = (String.format
               ("Non-descending order: %.2f, %.2f, %.2f", second, third, first));
      }
   }
   else if (second > first)
   {
      if (second > third && third >= first)
      {
         // Set up the output string
         outputStr = (String.format
               ("Non-descending order: %.2f, %.2f, %.2f", first, third, second));   
      }
      else if (second > third)
      {
         // Set up the output string
         outputStr = (String.format
               ("Non-descending order: %.2f, %.2f, %.2f", third, first, second));
      }
      else
      {
         // Set up the output string
         outputStr = (String.format
               ("Non-descending order: %.2f, %.2f, %.2f", first, second, third));
      }
   }
   else
   {
      // Set up the output string
         outputStr = (String.format
               ("Non-descending order: %.2f, %.2f, %.2f", second, first, third));
   }
      
   
   
   // Output the non-descending order rounded to two decimals
   JOptionPane.showMessageDialog(null, outputStr, "Answer",
               JOptionPane.INFORMATION_MESSAGE);
               
   System.exit(0);
   }
   
}