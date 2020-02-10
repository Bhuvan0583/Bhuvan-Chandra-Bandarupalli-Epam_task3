import java.util.*;
import Calci.*;
public class Calculator {
	public static void main(String args[])
	{
		int a,b;
		int m;
		Scanner s=new Scanner(System.in);
		Calculatoroperations c=new Calculatoroperations();
		System.out.println("Enter a value");
		a=s.nextInt();
		System.out.println("Enter b value");
		b=s.nextInt();
		System.out.println("Choose your Option:\n1.Add\n2.Subsract\n3.Multiply\n4.Divide\n5.Modulus");
		m=s.nextInt();
		switch(m)
		{
			case 1:
				System.out.println("The addition of two numbers is: "+c.addition(a,b));
				break;
			case 2:
				System.out.println("The Substraction of two numbers is: "+c.substraction(a,b));
				break;
			case 3:
				System.out.println("The Multiplication of two numbers is: "+c.multiply(a,b));
				break;
			case 4:
				System.out.println("The Division of two numbers is: "+c.divide(a,b));
				break;
			case 5:
				System.out.println("The Modulus of two numbers is: "+c.modulus(a,b));
				break;
			default:
				System.out.println("Invalid");
		}
	}
}


