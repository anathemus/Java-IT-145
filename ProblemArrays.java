/*
Benjamin Burgess
5-4 Problem : Arrays

Write a program that declares an array "alpha" of 50 elements of type "double". 
Initialize the array so that the first 25 elements are equal to the square of 
the index variable and the last 25 elements are equal to three times the index 
variable. Output the array so that 10 elements per line are printed.
*/

// import the ability to make a dialog box
import javax.swing.JOptionPane;

public class ProblemArrays
{

   public static void main(String[] args)
   {
   /* Declare array to store 50 doubles.*/
   double[] alpha = new double [50];
   
   // set up output string
   String outputStr = "";    
   
   // for loop to iterate through index 0 - 24
   for (int i = 0; i < 25; i++)
   {
      alpha[i] = i * i;
   }
   
   //for loop for index 25-49
   for (int i = 25; i < 50; i++)
   {
      alpha[i] = i * 3;
   }
   
   // loop and if conditional statement to set up output string
   for (int i = 0; i < 50; i++)
   {
      outputStr = outputStr
                + alpha[i]
                + " ";
      if ((i != 0) && (i % 10) == 0)
      {
         outputStr = outputStr
                   + "\n";
      }
   }
      
   // Output the array
   JOptionPane.showMessageDialog(null, outputStr, "Answer",
               JOptionPane.INFORMATION_MESSAGE);
               
   System.exit(0);
   }
   
}