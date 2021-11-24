
public class BankAccount {
	public int number;
	private double balance;
	private static int accountNumbers;
	
	public BankAccount() {
		number = ++accountNumbers;
	}
	
	public void deposit(double amount) {
		if(amount >= 0.0) {
			balance +=amount;
			displayMessage('d', true, amount);
		}else {
			displayMessage('d', false, amount);
		}		
	}
	
	public void withdraw(double amount) {
		if((balance-amount)>=0.0) {
			balance -= amount;
			displayMessage('w', true, amount);
		}else {
			displayMessage('w', false, amount);
		}
	}
	
	@Override
	public String toString() {
		return "Account # "+ number +", balance: $"+ balance;
	}
	
	public void displayMessage(char type, boolean state, double amount ) {
		String message1 = "";
		String message2= "";
		if(type == 'd') {
			message1 = " have been deoosited to ";
			message2 = " Invalid amount.";
		}else if (type=='w') {
			message1 =" have been withdrawn from ";
			message2 = " Insufficient amount.";
		}
		
		if(state) {
			System.out.println("Transaction successful, $"+amount+message1+"account #"+number+".\nNew Balance: $"+balance);
		}else {
			System.out.println("Transaction Unsuccesful,"+message2);
		}
		
	}
}
