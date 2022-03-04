public class Main {

	public static void main(String[] args) {
		Account account = new Account("Emirhan", "123", 1000);
		ATM atm = new ATM();
		atm.Work(account);

	}

}
