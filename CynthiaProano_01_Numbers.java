/*
 Program name:  Numbers
 Description:   The beginning of the scripts takes the users input. Then it calculates the sum, subtraction, multiplication
                 division, and remainder. Then outputs each of those calculations.   
 Author:       Cynthia
 Date:         09/15/21
 Version: 01
*/




import java.util.Scanner;

class CynthiaProano_01_Numbers
{
   public static void main(String[] args)
   {
    //instantiate a new scanner and assign it to variable 'keyboard' 
    Scanner keyboard = new Scanner(System.in);  
   
   //intialize both operands to 0;
   int firstNumber = 0;
   int secondNumber = 0;
   
    // Prompt the user to get the first operand then read in an integer
   System.out.print("Enter the first number: ");
   firstNumber = keyboard.nextInt();
   
   //Prompts user to get the second operand then read in an integer
   System.out.print("Enter the second number: ");
   secondNumber = keyboard.nextInt();

   //Calculating output based on the users input
   int sumNumber = firstNumber + secondNumber;
   int subNumber = firstNumber - secondNumber;
   int multiNumber = firstNumber * secondNumber;
   int divNumber = firstNumber / secondNumber;
   int remNumber = firstNumber % secondNumber;
   
   //Outputs to user
   System.out.println("Your numbers are: " + firstNumber + " and " + secondNumber + ".");
   System.out.println("Sum: " + sumNumber);
   System.out.println("Subtraction: " + subNumber);
   System.out.println("Multiplication: " + multiNumber);
   System.out.println("Division: " + divNumber);
   System.out.println("Remainder of Division: " + remNumber);
   
   }
}