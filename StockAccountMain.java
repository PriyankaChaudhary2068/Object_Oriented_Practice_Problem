package com.bridgelabz.stockAccount;

import java.util.Scanner;

public class StockAccountMain {

	public static void main(String[] args) {
		
		System.out.println(" Welcome To Stock Account Management System");
		System.out.print("Enter the number of stocks you want to add : ");

	        StockPortfolio stockPortfolio = new StockPortfolio();
	        Scanner scanner = new Scanner(System.in);
	        int numberOfStock = scanner.nextInt();

	        for (int index = 0; index < numberOfStock; index++) {

	            stockPortfolio.readStockData(index + 1);
	        }

	        stockPortfolio.calculateStock();

	        while (true) {

	            System.out.print("\n Enter a positive number to withdraw amount, to exit press 0 : ");
	            int var = (scanner.nextInt() > 0) ? stockPortfolio.debit() : 0;
	            if (var == 0) {
	              System.out.println("Process Terminated.");
	              
	              scanner.close();
	              
	              return;
	                
	               
	            }
	        }
	    }
	}
		

	


