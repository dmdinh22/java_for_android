/**
 * Main class of the Java program.
 */

public class Main{

	public static void main(String[] args) {
		Account alice = new Account("Alice", 100);
		Account bob = new Account("Bob", 200);

		System.out.println(alice);
		System.out.println(bob);

		System.out.println(alice.nextAccount);
		System.out.println(bob.nextAccount);
		System.out.println(Account.nextAccount);

		boolean aliceEnoughFunds = alice.withdraw(150);
		boolean bobEnoughFunds = bob.withdraw(80);

		System.out.println(aliceEnoughFunds);
		System.out.println(bobEnoughFunds);
	}
}