/*
 Program name:  Numbers
 Description:   The beginning of the scripts takes the users input. Then it calculates the sum, subtraction, multiplication
                 division, and remainder. Then outputs each of those calculations.   
 Author:       Cynthia
 Date:         09/15/21
 Version: 01
*/

import java.util.Scanner;

class CynthiaProano_01_PACE
   {
   public static void main(String[] args)
      {
   //instantiate a new scanner and assign it to variable 'keyboard' 
   Scanner keyboard = new Scanner(System.in);
      
   //initialize both operands to 0?
   String foodName = " ";
   Double calorieNumber = 0.0;
      
   //Prompt user
   System.out.print("Food: ");
   foodName = keyboard.nextLine();
   
   System.out.print("Calories: ");
   calorieNumber = keyboard.nextDouble();
   
   //Formula that calucates the number of minutes needed to walk
   Double walkTime = (calorieNumber / 5.4);
   
   // Convert the variable from double to an integer 
   int newWalkTime = walkTime.intValue();
   
   
   //Output
   System.out.print("Minutes you need to walk to burn off calories: " + newWalkTime);

      
   }     
}