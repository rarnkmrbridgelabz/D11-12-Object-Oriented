package com.bridgelabz;

import java.util.Scanner;

public class StockAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number of accounts to be created :");
		int n = sc.nextInt();
		Account[] account = new Account[n];

		for (int i = 0; i < account.length; i++) {
			account[i] = new Account();
			account[i].openAccount();
			}

			int option;
			System.out.println("Press 1 to display the Options");
			String accountNumber = sc.next();
			boolean found = false;
		
		while(true) {
			System.out.println(
					"\nSelect option: \n1. Display All \n2. Search by Account \n3. Deposit \n4. Withdrawal \n5. Exit");
			option = sc.nextInt();
			switch (option) {
			case 1:
				for (Account a : account) {
					a.showAccount();
				}
				break;
			case 2:
				System.out.print("Enter the account number ");
				for (Account b : account) {
					found = b.search(accountNumber);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Account does not exist");
				}
				break;

			case 3:
				System.out.print("Enter the account number ");
				accountNumber = sc.next();
				for (Account c : account) {
					found = c.search(accountNumber);
					if (found) {
						c.deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Account does not exist");
				}
				break;
			case 4:
				System.out.print("Enter the account number ");
				accountNumber = sc.next();
				for (Account d : account) {
					found = d.search(accountNumber);
					if (found) {
						d.withdrawal();
						break;
					}
				}
				if (!found) {
					System.out.println("Account does not exist");
				}
				break;

			case 5:
				System.exit(0);

			default:
				System.out.println("Choose a valid option");
			}
			sc.close();
		}
		
	}

}