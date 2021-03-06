package br.com.constructor1.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.constructor1.entities.Product;
import br.com.constructor1.exercises.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/*
		Product p = null;
		
		System.out.println("Enter data of products: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		p = new Product(name, quantity, price);
		
		System.out.println(p);
		*/
		
		// Exercício
		Account acc = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder:  ");
		// Para consumir a quebra de linha pendente do nextInt
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char isDeposit = sc.next().charAt(0);

		
		if(isDeposit == 'y') {
			System.out.print("Enter initial deposit value:");
			double balance = sc.nextDouble();
			
			acc = new Account(number, holder, balance);
		} else {
			acc = new Account(number, holder);
		}
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.print("Enter a deposit value:");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		
		System.out.println();
	}

}
