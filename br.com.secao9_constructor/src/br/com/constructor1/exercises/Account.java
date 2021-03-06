package br.com.constructor1.exercises;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	
	public Account() {}
	
	public Account(Integer number, String holder, Double initialDesposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDesposit);
	}
	
	public Account(Integer number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = 0.0;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	@Override
	public String toString() {
		return "Account "
				+number
				+", holder: "
				+holder
				+", Balance: R$ "
				+String.format("%.2f", balance);
	}
	
}
