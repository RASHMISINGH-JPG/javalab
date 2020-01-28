import java.util.Scanner;
import java.lang.*;
class Calculatortwo{
public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input value first");
	// String str = sc.nextLine();
	//float b = sc.nextFloat();
	double a = sc.nextFloat();
	System.out.println("Enter value second");
	double b = sc.nextFloat();
	
  char choice = sc.next().charAt(0);
  switch(choice)
  {
  case '+':System.out.println("Addition is"+(a+b));
                 break;
  case '-':System.out.println("sub is"+(b-a));
                    break;
  case '*':System.out.println("multiplication is"+(a*b));
                   break;
  case '/':System.out.println("div is"+(b/a));
                 break;
   default:System.out.println("no valid option");
  }
  
  }} 