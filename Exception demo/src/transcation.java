
public class transcation {
public static void deposit(Account acc,double amount) {
//	acc.setBalance(acc. getBalance()+ amount);
	acc.setBalance(acc.getBalance()+amount);
}
public static void withdraw(Account acc,double amount) {
 double bal=acc.getBalance();
 if(bal-amount>=1000)
	 acc.setBalance(bal-amount);
 throw new RuntimeException("your account are not suficent");
}

}
