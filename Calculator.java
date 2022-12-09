import java.util.Scanner;
class Calculator
{
int a,s,m,d;
  
// Constructor
public Calculator()
{
   a=0;
   s=0;
   m=0;
   d=0;
}
  
// printIntro Method For Description
public void printIntro()
{
System.out.println("********** Simple Calculator **********");
System.out.println("1 -> Addition");
System.out.println("2 -> Substratcion");
System.out.println("3 -> Multiplication");
System.out.println("4 -> Division");
}
  
// Calculate Method to perform Operations(+,-,*,/)
public void calculate()
{
String option;
int choice,num1,num2;
  
Scanner input = new Scanner(System.in);
  
do{
printIntro();
  
System.out.println("Enter your Choice:");
choice = input.nextInt();
  
System.out.println("Enter Number 1:");
num1 = input.nextInt();
  
System.out.println("Enter Number 2:");
num2 = input.nextInt();
  
if(choice == 1)
{
System.out.println(num1+" + "+num2+" = "+(num1+num2));
a++;
}
else if(choice == 2)
{
System.out.println(num1+" - "+num2+" = "+(num1-num2));
s++;
}
else if(choice == 3)
{
System.out.println(num1+" * "+num2+" = "+(num1*num2));
m++;
}
else if(choice == 4)
{
System.out.println(num1+" / "+num2+" = "+(num1/num2));
d++;
}
else
{
System.out.printf("\nYou have entered wrong option\n");
}
  
System.out.println("Do you want to perform Another Operation. Press Y to continue:");
option = input.next();
  
}while(option.equals("y") || option.equals("Y"));
  
printReport(a,s,m,d);
}
  
// printReport Method to print the Detailed report
public void printReport(int a,int s,int m,int d)
{
System.out.println("Addition Problems: "+a);
System.out.println("Substratcion Problems: "+s);
System.out.println("Multiplication Problems: "+m);
System.out.println("Division Problems: "+d);
}
  
}

// Driver Class

class Calculator2{
  
public static void main(String[] args) {
  
Calculator c = new Calculator();
  
c.calculate();
}
}