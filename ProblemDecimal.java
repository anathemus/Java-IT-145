/******************
1-3 Computer Programming:Programming Problem
******************/

import java.util.*;

public class ProblemDecimal
{

   public static void main(String[] args)
   {
   
      // declare the necessary variables to store user input and the 
      // rounded result.
      float decimal;
      float storageBin;
      int rounded;
      
      // Prompt the user for the input of a number including a decimal.
      System.out.println("Please enter a number with a decimal.\n");
      
      // prepare and get user input
      Scanner console = new Scanner(System.in);
      decimal = console.nextFloat();
      
      // convert the decimal input to an integer, remembering
      // that everything after the . simply is cut off
      rounded = (int)decimal;
      
      // figure out what's left after the . by using my
      // storageBin variable.
      storageBin = decimal;
      storageBin -= (float)rounded;
      
      // if the remaining decimal is 0.5 or greater,
      // round up, else leave the final result as is.
      if(storageBin >= 0.5)
      {
         rounded++;
      }
      
      System.out.println("The rounded result is:\n" + rounded);
   
   }

}