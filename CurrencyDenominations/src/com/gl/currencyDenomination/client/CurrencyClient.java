package com.gl.currencyDenomination.client;

import java.util.Scanner;
import com.gl.currenctDenomination.model.CurrencyService;

public class CurrencyClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size of currency denominations");
		int sizeOfCurrencyDenomination = scan.nextInt();
		
		int[] currencyDenomination = new int[sizeOfCurrencyDenomination];
		System.out.println("enter the currency denominations value");
		for(int i= 0;i<sizeOfCurrencyDenomination;i++) 
			currencyDenomination[i]=scan.nextInt();
		
		System.out.println("enter the amount you want to pay");
		int amountToPay = scan.nextInt();
		
		CurrencyService currencyServices = new CurrencyService();  
		currencyServices.denominationCounting(currencyDenomination,amountToPay);
		scan.close();
	}

}
