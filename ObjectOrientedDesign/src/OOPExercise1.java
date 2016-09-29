abstract class BankAccount{
	private float balance;
	private int numberOfDeposits, numberOfWithdrawals;
	private float annualInterestRate;
	private float monthlyServiceCharges;
	
	BankAccount(float bal, int anIntRate){
		this.balance = bal;
		this.annualInterestRate = anIntRate;
	}
	void deposit(float amountOfDeposit){
		this.balance += amountOfDeposit;
		this.numberOfDeposits++;
	}
	void withdrawal(float amountOfWithdrawal){
		this.balance -= amountOfWithdrawal;
		this.numberOfWithdrawals++;
	}
	void calcInterest(){
		this.balance = this.balance + (this.balance * (this.annualInterestRate/12));
		
	}
	void monthlyProcess(){
		this.balance -= this.monthlyServiceCharges;
		calcInterest();
		this.numberOfDeposits = 0;
		this.numberOfWithdrawals = 0;
		this.monthlyServiceCharges = 0;
	}
}


	


public class OOPExercise1 {

}
