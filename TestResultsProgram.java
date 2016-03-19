/*
Benjamin Burgess
5-4 Problem : GUI

Design a GUI program to find the weighted average of four test scores. The four 
test scores and their respective weights are given in the following format:

testscore1 weight1
...

For example, the sample data is as follows:

75 0.20
95 0.35
85 0.15
65 0.30

The user is supposed to enter the data and press a Calculate button. The program
 must display the weighted average.

Remember to follow proper form and design in your response.
*/

// for the dialogue window
import javax.swing.*;
import java.awt.*;

// for the ActionListener
import java.awt.event.*;

public class TestResultsProgram extends JFrame
{
   // set up the labels
   private JLabel testScoreL, testWeightL, testOneL, testTwoL, testThreeL, 
   testFourL, averageL;
   
   // text fields set up
   private JTextField scoreOneTF, weightOneTF, scoreTwoTF, weightTwoTF,
   scoreThreeTF, weightThreeTF, scoreFourTF, weightFourTF, averageTF;
   
   // set up buttons
   private JButton calculateB, exitB;
   
   // set up event listeners for buttons
   private CalculateButtonHandler cbHandler;
   private ExitButtonHandler ebHandler;
   
   // width and height of window
   private static final int WIDTH = 400;
   private static final int HEIGHT = 300;
   
   // main program
   public TestResultsProgram()
   {
      // Create the labels
      testScoreL = new JLabel("Test Score", SwingConstants.CENTER);
      testWeightL = new JLabel("Test Weight", SwingConstants.CENTER);
      testOneL = new JLabel("Test #1 ", SwingConstants.RIGHT);
      testTwoL = new JLabel("Test #2 ", SwingConstants.RIGHT);
      testThreeL = new JLabel("Test #3 ", SwingConstants.RIGHT);
      testFourL = new JLabel("Test #4 ", SwingConstants.RIGHT);
      averageL = new JLabel("Calculated Average ", SwingConstants.RIGHT);
      
      // Create the text fields
      scoreOneTF = new JTextField(10);
      weightOneTF = new JTextField(10);
      scoreTwoTF = new JTextField(10);
      weightTwoTF = new JTextField(10);
      scoreThreeTF = new JTextField(10);
      weightThreeTF = new JTextField(10);
      scoreFourTF = new JTextField(10);
      weightFourTF = new JTextField(10);
      averageTF = new JTextField(10);
      
      // Create Calculate Button
      calculateB = new JButton("Calculate");
      cbHandler = new CalculateButtonHandler();
      calculateB.addActionListener(cbHandler);
      
      // Create Exit Button
      exitB = new JButton("Exit");
      ebHandler = new ExitButtonHandler();
      exitB.addActionListener(ebHandler);
      
      // Set window title
      setTitle("Calculate Weighted Average");
      
      // Get the window/container
      Container pane = getContentPane();
      
      // Set the layout of the window/container
      pane.setLayout(new GridLayout(7,3));
      
      // Add components to the pane
      pane.add(new JLabel(""));
      pane.add(testScoreL);
      pane.add(testWeightL);
      pane.add(testOneL);
      pane.add(scoreOneTF);
      pane.add(weightOneTF);
      pane.add(testTwoL);
      pane.add(scoreTwoTF);
      pane.add(weightTwoTF);
      pane.add(testThreeL);
      pane.add(scoreThreeTF);
      pane.add(weightThreeTF);
      pane.add(testFourL);
      pane.add(scoreFourTF);
      pane.add(weightFourTF);
      pane.add(averageL);
      pane.add(averageTF);
      pane.add(new JLabel(""));
      pane.add(calculateB);
      pane.add(new JLabel(""));
      pane.add(exitB);
      
      // Set window size and display it
      setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   private class CalculateButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Declare variables for the scores, weights, and average
         double scoreOne, weightOne, scoreTwo, weightTwo, scoreThree, 
         weightThree, scoreFour, weightFour, average;
         
         // Parse scores from Text Fields
         scoreOne = Double.parseDouble(scoreOneTF.getText());
         weightOne = Double.parseDouble(weightOneTF.getText());
         scoreTwo = Double.parseDouble(scoreTwoTF.getText());
         weightTwo = Double.parseDouble(weightTwoTF.getText());
         scoreThree = Double.parseDouble(scoreThreeTF.getText());
         weightThree = Double.parseDouble(weightThreeTF.getText());
         scoreFour = Double.parseDouble(scoreFourTF.getText());
         weightFour = Double.parseDouble(weightFourTF.getText());
         
         // math operations to get average
         average = ((scoreOne * weightOne) + (scoreTwo * weightTwo) +
         (scoreThree * weightThree) + (scoreFour * weightFour));
         
         averageTF.setText("" + average);
         
      }
   }
   
   private class ExitButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   
   public static void main(String[] args)
   {
      TestResultsProgram rectObject = new TestResultsProgram();
   }
   
}

