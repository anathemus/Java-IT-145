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

public class Day
{
   public int dayInt; // store day as int
   public String dayStr; // store day as string
   public static String outputStr; // output string
      
   // Default constructor - defaults to Monday, the worst day of the week
   public Day()
   {
      setDay("Mon");
   }
   
   /*
   Constructor with paramaters, to set the day. The day is set according to
   the parameters. dayStr = day
   */
   public Day(String day)
   {
      setDay(day);
   }
   
   /*
   Method to set the day The day is set according to the parameters
   Monday = 0; Tuesday = 1; Wednesday = 2, etc.;
   */
   public void setDay(String day)
   {
      if (day.equalsIgnoreCase("mon"))
      {
         dayInt = 0;
      }
      
      else if (day.equalsIgnoreCase("tue"))
      {
         dayInt = 1;
      }
      
      else if (day.equalsIgnoreCase("wed"))
      {
         dayInt = 2;
      }
      
      else if (day.equalsIgnoreCase("thu"))
      {
         dayInt = 3;
      }
      
      else if (day.equalsIgnoreCase("fri"))
      {
         dayInt = 4;
      }
      
      else if (day.equalsIgnoreCase("sat"))
      {
         dayInt = 5;
      }
      
      else if (day.equalsIgnoreCase("sun"))
      {
         dayInt = 6;
      }
      
      else
      {
         System.out.print("Error! Day incorrectly entered. Please run program again.");
         System.exit(1);
      }
   }
   
   // Method to output the day selected
   public void printDay()
   {
      // checks dayInt to return correct dayStr
      switch (dayInt)
      {
         case 0: dayStr = "Mon";
         break;
    
         case 1: dayStr = "Tue";
         break;
    
         case 2: dayStr = "Wed";
         break;
    
         case 3: dayStr = "Thu";
         break;
    
         case 4: dayStr = "Fri";
         break;
    
         case 5: dayStr = "Sat";
         break;
    
         case 6: dayStr = "Sun";
         break;
    
         default: dayStr = "Invalid day";
         break;
      }

   
      outputStr = outputStr + dayStr;
      // Output the day
      JOptionPane.showMessageDialog(null, outputStr, "Day",
               JOptionPane.INFORMATION_MESSAGE);
   }
   
   /*
   Method to increment the day by one. If the before-increment day is Sunday,
   the day is reset to Monday
   */
   public void incrementDay()
   {
      dayInt++;
      
      if (dayInt > 6)
      {
         dayInt = 0;
      }
   }
   
   /*
   Method to decrement the day by one. If the before-decrement day is Monday,
   the day is reset to Sunday
   */
   public void decrementDay()
   {
      dayInt--;
      
      if (dayInt < 0)
      {
         dayInt = 6;
      }
   }
   
   /*
   Method to retrieve the day without opening the pane
   */
   public void getDay()
   {
      // checks dayInt to return correct dayStr
      switch (dayInt)
      {
         case 0: dayStr = "Mon";
         break;
    
         case 1: dayStr = "Tue";
         break;
    
         case 2: dayStr = "Wed";
         break;
    
         case 3: dayStr = "Thu";
         break;
    
         case 4: dayStr = "Fri";
         break;
    
         case 5: dayStr = "Sat";
         break;
    
         case 6: dayStr = "Sun";
         break;
    
         default: dayStr = "Invalid day";
         break;
      }
   }
   
      
}



