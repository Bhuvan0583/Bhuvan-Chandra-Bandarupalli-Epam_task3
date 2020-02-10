import Calci.*;
import java.util.*;
public class Calculator {
	int a,b;
	int m;
	Scanner s=new Scanner(System.in);
	CalculatorOperations c=new CalculatorOperations();
	m=s.nextInt();
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("Choose your Option:\n1.Add\n2.Subsract\n3.Multiply\n4.Divide\n5.Modulus");
	switch(m) {
		String s1;
		case 1:
			s1="The addition of two numbers is: "+c.addition(a,b);
			System.out.println(s1);
			break;
		case 2:
			s1="The Substraction of two numbers is: "+c.substraction(a,b);
			System.out.println(s1);
			break;
		case 3:
			s1="The Multiplication of two numbers is: "+c.multiply(a,b);
			System.out.println(s1);
			break;
		case 4:
			s1="The Division of two numbers is: "+c.divide(a,b);
			System.out.println(s1);
			break;
		case 5:
			s1="The Modulus of two numbers is: "+c.modulus(a,b);
			System.out.println(s1);
			break;
		default:
			System.out.println("Invalid");
}
}
