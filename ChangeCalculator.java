package main;

import java.util.Hashtable;
import java.util.Scanner;

public class ChangeCalculator {
	 public static void main(String args[]) {
		double amount=0.0;
		int quarters,dimes,nickles,pennies,twenty,ten,five,one=0;
		System.out.print("Amount: $");
		Scanner sc = new Scanner(System.in);
		amount=sc.nextDouble();
		//Split the amount into integer part and decimal part, using splitting the string approach to avoid roundoff error. 
		String doubleAsString = String.valueOf(amount);//convert the decimal number to a String equivalent
		int indexOfDecimal = doubleAsString.indexOf(".")+1;//return a index that is after the decimal point.
		String decimalPart_str=doubleAsString.substring(indexOfDecimal);//split the String after the decimal point index
		int decimalPart = Integer.parseInt(decimalPart_str);//Parse string back to integer
		quarters=decimalPart/25; //example:99/25=3 quarters		
		decimalPart%=25;//example:remain:99%25=24
		dimes=decimalPart/10;
		decimalPart%=10;
		nickles=decimalPart/5;
		decimalPart%=5;
		pennies=decimalPart;
		twenty=(int)amount/20;
		amount%=20;
		ten=(int)amount/10;
		amount%=10;
		five=(int)amount/5;
		amount%=5;
		one=(int)amount;
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

 