package day11;
import java.util.Scanner;
public class Bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		double balance=sc.nextDouble();
		SavingAccount s1=new SavingAccount(balance);
		s1.Showbalance();
		System.out.println("Enter deposit amount");
		double money=sc.nextDouble();
		s1.deposit(money);
		System.out.println("Enter withdraw amount");
		double amount=sc.nextDouble();
		s1.withdraw(amount);
	}

}
