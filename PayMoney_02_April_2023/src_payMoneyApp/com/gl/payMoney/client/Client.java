package com.gl.payMoney.client;

import java.util.Scanner;
import com.gl.payMoney.services.TransactionService;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the size of transaction array");
		int sizeOfTransactionArray = scan.nextInt();

		int[] transactionArray = new int[sizeOfTransactionArray];
		System.out.println("Enter values for array:");
		for (int i = 0; i < sizeOfTransactionArray; i++)
			transactionArray[i] = scan.nextInt();
		System.out.println();
		System.out.println("enter the value of target");
		int valueOfTarget = scan.nextInt();

		TransactionService transactionservices = new TransactionService(transactionArray, valueOfTarget);
		transactionservices.checkTarget(transactionservices);
		scan.close();
	}
}
