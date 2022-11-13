package switchoperation;
import java.util.Scanner;
public class CalculatorSwitch {

	public static void main(String[] args)//Main Method
	{
		char operator;
		double number1,number2,result;
		Scanner verma=new Scanner(System.in);// creating object a name verma of Scanner class
		//ask users to give input as operator
		System.out.println("Choose an operator : + , - , * , / , or %");
		operator=verma.next().charAt(0);
		//ask users to enter numbers
		System.out.println("Enter First number");
		number1=verma.nextDouble();
		
		System.out.println("Enter Second Number");
		number2=verma.nextDouble();
		switch(operator)
		{
		//performing addition of two Numbers
		case'+' :
			result = number1 + number2;
			System.out.println(number1 + "+" +number2 + "=" +result);
			break;
			
			//performing subtraction of two Numbers
		case'-' :
			result = number1 - number2;
			System.out.println(number1 + "-" +number2 + "=" +result);
			break;
			
			//performing multiplication of two Numbers
		case'*' :
			result = number1 * number2;
			System.out.println(number1 + "*" +number2 + "=" +result);
			break;
			
			//performing division of two Numbers
		case'/' :
			result = number1 / number2;
			System.out.println(number1 + "/" +number2 + "=" +result);
			break;
			
			//performing modulation of two Numbers
		case'%' :
			result = number1 % number2;
			System.out.println(number1 + "%" +number2 + "=" +result);
			break;
			
		default :
			System.out.println("Invalid Operator!!!!");
			break;
		}
		verma.close();
		
	}

}
