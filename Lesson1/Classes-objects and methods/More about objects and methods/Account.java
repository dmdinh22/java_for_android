public class Account{

	// class variable - shared among all members of that class
	public static int nextAccount = 1;

	// instance variable - each members have own set of instance variables
	public String name;
	public int accountNumber;
	public int balance;

	// constructors - as many as you want
	public Account(String n){
		name = new String(n);
		accountNumber = nextAccount;
		balance = 0;

		nextAccount++;
	}

	// overloaded constructor
	public Account(String n, int b){
		name = new String(n);
		accountNumber = nextAccount;
		balance = b;

		nextAccount++;
	}

	// methods
	public void deposit(int b) { // not returning anything
		balance = balance + b;
	}

	// overriding default toString() method for this class
	public String toString(){
		return "\nname: " + name + "\naccount number: " + accountNumber + "\nbalance: " + balance;
	}
}