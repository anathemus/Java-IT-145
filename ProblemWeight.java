/*
Benjamin Burgess
2-3 Problem : Weight

Write a program that prompts the user to enter the mass of a person in kilograms
and outputs the equivalent weight in pounds.  Output both the mass and the weight
rounded to two decimal places. (Note that for standard Earth gravity, 1 kilogram
 = 2.2 pounds.) Format your output with two decimal places.  

Your answer should use dialog boxes for the input/output statements.
*/

// import the ability to make a dialog box
import javax.swing.JOptionPane;

public class ProblemWeight
{

   public static void main(String[] args)
   {
   // Declare variables to store weight in kilograms and pounds
   double kilos;
   double lbs;
   
    
   // initialize an input dialog to get weight in kilograms and store 
   // in variable
   String kiloString = JOptionPane.showInputDialog
                                    ("Enter the weight in kilograms: ");
   
   // Parse kilos value from input
   kilos = Double.parseDouble(kiloString);
   
   // Convert kilos to pounds
   lbs = kilos * 2.2;
   
   // Set up the output string
   String outputStr = (String.format
               ("Kilograms: %.2f Pounds: %.2f", kilos, lbs));
   
   // Output the weight in kilograms and pounds rounded to two decimals
   JOptionPane.showMessageDialog(null, outputStr, "Weight",
               JOptionPane.INFORMATION_MESSAGE);
               
   System.exit(0);
   }
   
}