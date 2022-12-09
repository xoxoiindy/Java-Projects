/*
 Program name:  Nested loops
 Description:   Prompts the user for a number and prints output of each challenge to the length from the input.
 Author:       Cynthia
 Date:         09/24/21
 Version: 01
1) Challenge 1

*  
**  
***  

2) Challenge 2:
         *  
       * * *  
     * * * * *  

3) Challenge 3:
         *  
       * * *  
     * * * * *  
        000 
        000  
        000  
        000  
        000
*/

import java.util.Scanner;


public class CynthiaProano_Nested_Loops
{

   public static void main(String[] args)
   {
         //instantiate a new scanner and assign it to variable 'keyboard' 
      Scanner keyboard = new Scanner(System.in);
    
      
      //prompting user for size of the output
      int num = 0;
      System.out.println("Input a number: ");
      num = keyboard.nextInt();
      
      //Challenge 1
      System.out.println("This is the first challege output:");
      //for loop for the number of rows
      for (int row = 1; row <= num; row++)
     
      {
         //for loop for the number of colums
         for (int col = 1; col <= row; col++)     
         {
            System.out.print("*");
         }  
         System.out.println();
      }
         
      //Challenge 2
      System.out.println("");
      System.out.println("This is the second challege output:");
      for (int row = 1; row <=num; row++)
      
      {
         //for loop for the number of spaces
         for (int space = 1; space <= num - row; space++)
            {
            System.out.print(" ");
            }
            
         //for loop for the number of colums   
         for (int col = 2; col < (2 * row + 1); col++)
            {
            System.out.print("*");
            }
         System.out.println();   
      }  
      
      
      //Challenge 3
      System.out.println("");
      System.out.println("This is the third challege output:");
      for (int row = 1; row <=num; row++)
      
      {
         //for loop for the number of spaces
         for (int space = 1; space <= num - row; space++)
            {
            System.out.print(" ");
            }
         //for loop for the number of colums   
         for (int col = 2; col < (2 * row + 1); col++)
            {
            System.out.print("*");
            }
         System.out.println();   
      }  
      //for loop for the number of trunkrows & trunkspaces      
      for (int trunkrow = 1; trunkrow <=num; trunkrow++)
         {
        for (int trunkspace = 1; trunkspace <= ((num/2)+1); trunkspace++)
            {
               System.out.print(" ");
            }
        //for loop to print out the trunk    
        for (int trunk = 1; trunk <= 1; trunk++)
            {
               System.out.print("000");
            }
         System.out.println();
         }
         

   }
}
