import java.util.Scanner;

public class ATM {

	public void Work(Account account) {
		Login login = new Login();
		Scanner scan = new Scanner(System.in);
		System.out.println("********!!Welcome to the FARMBANK!!******");
		int rightofEntry = 3;
		int counter = 0;
		while (rightofEntry != counter) {
			if (login.control(account)) {
				System.out.println("Login is Succesfully Completed...\n");
				break;
			} else {
				counter++;
				System.out.print("Remaining right of Entry= ");
				System.out.println(rightofEntry - counter);
			}
			if (rightofEntry == counter) {
				System.out.println(
						"Your account is blocked for a while!Please Contact with (emir.baran@gmail.com) this email account.");
				return;
			}
		}

		System.out.println("***************************************");
		System.out.println("**********OPTIONS***************");
		while (true) {
			int choose;
			System.out.println("1.Withdrawal");
			System.out.println("2.Investment");
			System.out.println("3.Show Balance");
			System.out.print("Decision: ");
			choose = scan.nextInt();
			if (choose == 1) {
				double amount;
				System.out.print("Amount: ");
				amount = scan.nextDouble();
				account.withDrawal(amount);
			} else if (choose == 2) {
				double amount;
				System.out.print("Amount: ");
				amount = scan.nextDouble();
				account.investment(amount);
			} else if (choose == 3) {
				System.out.println("Your current balance: " + account.getBalance());
			} else {
				String process = null;
				System.out.println("You choose an invalid Selection Please Try it Again or Exit! C(Choose)/E(Exit)");
				System.out.print("Decision: ");
				scan.nextLine(); // null
				process = scan.nextLine();
				if (process.equals("C") || process.equals("c")) {
					System.out.print("Decision: ");
					choose = scan.nextInt();
				} else {
					System.out.println("Exit Completed Successfully...");
					break;
				}
			}

		}

	}
}
