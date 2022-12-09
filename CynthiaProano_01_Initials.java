/*
 Program name:  Initials
 Description:   In the beginning of the script it takes the users first, middle and last name input. It then it grabs the first initial of each name. Then 
                  output the full name and first letter of the first, middle and last name ....   
 Author:       Cynthia
 Date:         09/15/21
 Version: 01
*/

import java.util.Scanner;

class CynthiaProano_01_Initials
{
   public static void main(String[] args)
   {
   
   //instantiate a new scanner and assign it to variable 'keyboard'
   Scanner keyboard = new Scanner(System.in);
   
   // Prompt user here
   System.out.println("Enter your First name: ");
   String firstName = keyboard.nextLine ();
   
   System.out.println("Enter your Middle name: ");
   String middleName = keyboard.nextLine ();
   
   System.out.println("Enter your Last name: ");
   String lastName = keyboard.nextLine ();
   
   
   char firstInitial = firstName.charAt(0);
   char middleInitial = middleName.charAt(0);
   char lastInitial = lastName.charAt(0);
   
   System.out.println("Your name is: " + firstName + " " + middleName + " " + lastName);
   System.out.println("Your initials are: " + firstInitial + ". " + middleInitial + ". " + lastInitial + ".");
   
   }

}