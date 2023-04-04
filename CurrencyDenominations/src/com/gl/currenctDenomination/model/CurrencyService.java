package com.gl.currenctDenomination.model;

public class CurrencyService {

	public void denominationCounting(int[] currencyDenomination,int amountToPay) {
		
		if(amountToPay==0)
			System.out.println("Amount to pay is zero.");
		else {
		SortingService sortingServices = new SortingService();
		sortingServices.sort(currencyDenomination);
		
		while(amountToPay > currencyDenomination[currencyDenomination.length-1]) {
			int count =0;
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i : currencyDenomination){
				if(amountToPay>=i)
					{
					count=amountToPay/i;
					amountToPay=amountToPay%i;
					System.out.println(i+":"+count);			
					}
			}
		}
		if(amountToPay>0)
			System.out.println("You will not be able to pay exact amount , Remaining Amount: "+amountToPay);
	}
	}
}
