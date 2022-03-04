import java.util.Scanner;

public class Account {

	private String userName;
	private String password;
	private double balance;
	Scanner scan = new Scanner(System.in);

	Account(String userName, String password, double balance) {
		this.userName = userName;
		this.password = password;
		this.balance = balance;

	}

	public void withDrawal(Double amount) {
		if (amount > 1500) {
			String process = null;
			System.out.println("You can not withDrawal over the 1500$ from the account  in a day.");
			System.out.println("Please choose a new amount or Exit from this process. C(Choose)/E(Exit)");
			System.out.print("Decision: ");
			process = scan.nextLine();
			if (process.equals("C") || process.equals("c")) {
				System.out.print("new Amount: ");
				amount = scan.nextDouble();
				withDrawal(amount);
			} else if (process.equals("E") || process.equals("e")) {
				System.out.println("Exit Completed Successfully...");
			} else {
				System.out.println("You choose a wrong decision.Exit Completed Successfully...");
			}

		} else if (amount < 0) {
			String process = null;
			System.out.println("You can not withDrawal under the 0$ from the account  in a day.");
			System.out.println("Please choose a new amount or Exit from this process. C(Choose)/E(Exit)");
			System.out.print("Decision: ");
			scan.nextLine(); // null
			process = scan.nextLine();
			if (process.equals("C") || process.equals("c")) {
				System.out.print("new Amount: ");
				amount = scan.nextDouble();
				withDrawal(amount);
			} else if (process.equals("E") || process.equals("e")) {
				System.out.println("Exit Completed Successfully...");
			} else {
				System.out.println("You choose a wrong decision.Exit Completed Successfully...");
			}

		} else {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Process Completed Successfully.Your new Balance is " + balance + "$ .");
			} else {
				String process = null;
				System.out.println("You don't have enough money to withDrawal this amount of moey in your account!");
				System.out.println("Please choose a new amount or Exit from this process. C(Choose)/E(Exit)");
				if (process.equals("C") || process.equals("c")) {
					withDrawal(amount);
				} else if (process.equals("E") || process.equals("e")) {
					System.out.println("Exit Completed Successfully...");
				} else {
					System.out.println("You choose a wrong decision.Exit Completed Successfully...");
				}
			}
		}

	}

	public void investment(Double amount) {
		if (amount < 0) {
			String process = null;
			System.out.println("You can not investment under the 0$ from the account  in a day.");
			System.out.println("Please choose a new amount or Exit from this process. C(Choose)/E(Exit)");
			if (process.equals("C") || process.equals("c")) {
				withDrawal(amount);
			}
			if (process.equals("E") || process.equals("e")) {
				System.out.println("Exit Completed Successfully...");
			} else {
				System.out.println("You choose a wrong decision.Exit Completed Successfully...");
			}
		} else {
			balance += amount;
			System.out.println("Process Completed Successfully.Your new Balance is " + balance + "$ .");
		}

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
