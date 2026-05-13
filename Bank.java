package day11;

public class Bank {
  double balance;
  Bank(double a){
	  if(a<0) {
		  System.out.println("Invalid initial balance");
	  }
	  else {
		  balance=a;
		  System.out.println("Successfull");
	  }
		  }
	
	void Showbalance() {
	
		System.out.println("Yor balance "+ balance);
	}

	

}
