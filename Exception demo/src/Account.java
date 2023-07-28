//import jdk.internal.org.jline.utils.Display;

public class Account {
		private int AccountNo;
		 private String name;
		 private double balance;
		public Account() {
			
		}
		public Account(int accountNo, String name, double balance) {
		
			this.AccountNo = accountNo;
			this.name = name;
			this.balance = balance;
		}
		public int getAccountNo() {
			return AccountNo;
		}
		public double getBalance() {
			return balance;
		}
	public void setBalance(double balance) {
			this.balance = balance;
		}
	static int a=2;
	public static int sum(int v, int b) {
		if(v>b) {
			System.out.println("V is max");
		}else {
			return v+b;
		}
		return v+b;
	}


	}
		

