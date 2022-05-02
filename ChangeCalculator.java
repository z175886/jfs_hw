package main;
import java.util.Scanner;
/** 
* Write an application that prompts for and reads a double value representing a monetary amount.
* Then determine the fewest number of each bill and coin needed to represent that amount, 
* starting with the highest. Assume that a twenty dollar bill is the maximum size needed.
*/
public class ChangeCalculator {
	/**
	 * @param bills that need to change into small bills
	 * @param bill small bills or coins that need to change into
	 * @return fewest number of bill or coin needed to represent the amount
	 */
	public static int calResult(int amount,int bill) {
		return  amount/bill;
	}
	/**
	 * @param amount bills that need to change into small bills
	 * @param bill small bills or coins that need to change into
	 * @return the remaining part of the bills after it changed into small bills
	 */
	public static int calRemain(int amount,int bill) {
		return amount%bill;
	}
	
	public static void main(String args[]) {
		double amount=0.0;
		int quarters,dimes,nickles,pennies,twenty,ten,five,one=0;
		System.out.print("Amount: $");
		Scanner sc = new Scanner(System.in);
		amount=sc.nextDouble();
		
		//Split the amount into integer part and decimal part, using splitting the string approach to avoid roundoff error 
		String doubleAsString = String.valueOf(amount);//convert the decimal number to a String equivalent
		int indexOfDecimal = doubleAsString.indexOf(".")+1;//return a index that is after the decimal point.
		String integerPart_str=doubleAsString.substring(0,indexOfDecimal-1);
		String decimalPart_str=doubleAsString.substring(indexOfDecimal);//split the String after the decimal point index(Excluding the decimal point)
		int decimalPart = Integer.parseInt(decimalPart_str);//Parse string back to integer
		int integerPart = Integer.parseInt(integerPart_str);


		quarters=calResult(decimalPart,25);
		decimalPart=calRemain(decimalPart,25);
		dimes=calResult(decimalPart,10);
		decimalPart=calRemain(decimalPart,10);
		nickles=calResult(decimalPart,5);
		decimalPart=calRemain(decimalPart,5);
		pennies=calResult(decimalPart,1);
		
		twenty=calResult(integerPart,20);
		integerPart=calRemain(integerPart,20);
		ten=calResult(integerPart,10);
		integerPart=calRemain(integerPart,10);
		five=calResult(integerPart,5);
		integerPart=calRemain(integerPart,5);
		one=calResult(integerPart,1);
		
		//Print result
		System.out.println(twenty+" twenty dollars bills");
		System.out.println(ten+" ten dollars bills");
		System.out.println(five+" five dollars bills");
		System.out.println(one+" one dollars bills");
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickles+" nickles");
		System.out.println(pennies+ " pennies");
	}
	 
	 

}

 