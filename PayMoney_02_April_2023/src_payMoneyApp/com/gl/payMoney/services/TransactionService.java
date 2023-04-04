package com.gl.payMoney.services;

public class TransactionService {
	private static int[] transactionArray;
	private static int valueOfTarget;

	public TransactionService(int[] transactionArray, int valueOfTarget) {
		TransactionService.transactionArray = transactionArray;
		TransactionService.valueOfTarget = valueOfTarget;
	}

	public void checkTarget(TransactionService object) {
		int checktarget = 0;
		int i;
		boolean flag = false;
		for (i = 0; i < transactionArray.length; i++) {
			checktarget += transactionArray[i];
			if (checktarget >= valueOfTarget) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				flag = true;
				break;
			}	
		}
		if(!flag)
		System.out.println("Given target is not achieved");
	}

}
