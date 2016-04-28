/*
Benjamin Burgess
8-4 Problem : Final

Design and implement the class Day that implements the day of the week in a 
program.  The class Day should store the day, such as Sun for Sunday.  The 
program should be able to perform the following operations on an object of type 
Day:
 
Set the day.
Print the day.
Return the day.
Return the next day.
Return the previous day.
Calculate and return the day by adding certain days to the current day.  For 
example, if the current day is Monday and we add four days, the day to be 
returned is Friday.  Similarly, if today is Tuesday and we add 13 days, the day 
to be returned is Monday.
Add the appropriate constructors.
Write the definitions of the methods to implement the operations for the class 
Day, as defined in A through G.
Write a program to test various operations on the class Day.
*/

// import the ability to make a dialog box
import javax.swing.JOptionPane;

public class ProblemFinal
{

   // Main test program
   public static void main(String[] args)
   {
   
      // initialize input dialog to get the day
      String inputDay = JOptionPane.showInputDialog
                        ("Enter the day of the week (Sun, Mon, Tue, Wed, Thu, Fri, Sat):");
      
      // initialize Day
      Day myDay = new Day(inputDay);
      
      myDay.outputStr = "You picked ";
      myDay.printDay();
      myDay.outputStr = "Previous day is ";
      myDay.decrementDay();
      myDay.printDay();
      
      // increment twice to get to the next day
      myDay.outputStr = "Next day is ";
      myDay.incrementDay();
      myDay.incrementDay();
      myDay.printDay();
      
      
      // get number of days to move forward from user
      String inputNum = JOptionPane.showInputDialog("Enter num:");
      
      // Parse values from inputs
      int inputDigit = Integer.parseInt(inputNum);
      
      myDay.outputStr = inputDigit + " day(s) from "; 
      
      // return to original day
      myDay.decrementDay();
      myDay.getDay();
      
      myDay.outputStr = myDay.outputStr + myDay.dayStr;
      
      // increment days by input number
      for (int i = 0; i < inputDigit; i++)
      {
         myDay.incrementDay();
      }
      
      myDay.outputStr = myDay.outputStr + " is ";
      myDay.printDay();
      
      System.exit(0);             
   }


}
