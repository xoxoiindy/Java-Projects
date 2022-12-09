/*
 * Program = My Calculator
 * Author = 
 * Date = 
 * Description = A simple calculator that can solve basic mathmatical equations
 * Assumptions and Limitations = 
 */

import java.util.Scanner;


class myCalculator
{
   int addition;
   int subtraction;
   int multiplication;
   int division;
   int total;
   
   //Constructor that initializes counters to 0
   public myCalculator()
   {
      addition = 0;
      subtraction = 0;
      multiplication = 0;
      division = 0;
      total = 0;
   }
   
   //Prints intro to user
   public void printIntro()
   {
      System.out.println("My Calculator");
      System.out.println("This program can solve basic mathmatical equations");
      System.out.println("1 = Addition");
      System.out.println("2 = Subtraction");
      System.out.println("3 = Multiplication");
      System.out.println("4 = Division");
   }
         
   //Calucations method
   public void calculation()
   {
      int select;
      int operation;
      int firstNum;
      int secondNum;
   
      Scanner input = new Scanner(System.in);
      
      // Do While loop. Takes the users operation selected and performs operation from the first and second number the users input
      do{
         printIntro();
         
         System.out.println("Please enter the operation you want to perform: ");
         operation = input.nextInt();
                  
         if(operation == 1)
         {
            System.out.println("You selected addition.");   
            
            System.out.println("Please enter your first integer: ");
            firstNum = input.nextInt();
    
            System.out.println("Please enter your second integer: ");
            secondNum = input.nextInt();   
                  
            System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
            addition++;
         }
         else if(operation == 2)
         {
            System.out.println("You selected subtraction.");
            
            System.out.println("Please enter your first integer: ");
            firstNum = input.nextInt();
    
            System.out.println("Please enter your second integer: ");
            secondNum = input.nextInt();  
            
            System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
            subtraction++;
         }
         else if(operation == 3)
         {
         
            System.out.println("You selected multiplication.");
            
            System.out.println("Please enter your first integer: ");
            firstNum = input.nextInt();
    
            System.out.println("Please enter your second integer: ");
            secondNum = input.nextInt();  
            
            System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
            multiplication++;
         }
         else if(operation == 4)
         {
            System.out.println("You selected division.");
            
            System.out.println("Please enter your first integer: ");
            firstNum = input.nextInt();
    
            System.out.println("Please enter your second integer: ");
            secondNum = input.nextInt();  

            System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
            division++;
         }
         else
         {
            System.out.println("You entered an invalid operation, please try again" );
         }
         
         System.out.println("Would you like to do another problem? ");
         System.out.println("1 = Yes");
         System.out.println("Anything other number than the number 1 will end the program");
         select = input.nextInt();     
      
        }while(select == 1);
       
   printReport(addition,subtraction,multiplication,division);
   }
   
   //Prints out the users output in a detailed summary
   public void printReport(int addition, int subtraction, int multiplication, int division)
   {     
      total = addition + subtraction + multiplication + division;
      System.out.println("Addition Problems: " + addition);
      System.out.println("Subtraction Problems: " + subtraction);
      System.out.println("Multiplication Problems: " + multiplication);
      System.out.println("Division Problems: " + division);
      System.out.println("Total number of problems solved: " + total);    
   }
}   
// Main Method 
class Main
{
   public static void main(String[] args) 
   {
      
      myCalculator c = new myCalculator();
      c.calculation();

   }
   
}         