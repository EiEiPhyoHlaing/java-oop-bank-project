package day11;

public class SavingAccount extends Bank {
	SavingAccount(double a){
		super(a);
		
	}
	void deposit(double money) {
		balance+=money;
		System.out.println("Deposit successfull");
		System.out.println("Your current amount ="+balance);
	}
	void withdraw(double amount) {
		if(balance>=amount) {
		balance-=amount;
		System.out.println("Withdraw successfull");
		System.out.println("Your  current amount ="+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

}
