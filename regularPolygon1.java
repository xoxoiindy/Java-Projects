mport java.util.Scanner;

public class regularPolygon 
   {
    public static void main(String[] args) 
      {
        Scanner input = new Scanner(System.in);
      

        do

        {

              System.out.print("Enter the number of sides of a regular polygon: ");
              int numberOfSides = input.nextInt();

               int measureAngles = (numberOfSides – 2) * 180

              System.out.println(measureAngles);  

       }

         while(numberOfSides >2);