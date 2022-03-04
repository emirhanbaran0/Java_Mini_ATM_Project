import java.util.Scanner;

public class Login {

	Account account = null;
	Scanner scan = new Scanner(System.in);
	String userName;
	String password;

	public boolean control(Account account) {
		String userName;
		String password;
		System.out.println("Enter the Username: ");
		userName = scan.nextLine();

		System.out.println("Enter the Password: ");
		password = scan.nextLine();
		if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
			return true;
		} else if (account.getUserName().equals(userName) && !account.getPassword().equals(password)) {
			System.out.println("Uncorrect Password");
		} else if (!account.getUserName().equals(userName) && account.getPassword().equals(password)) {
			System.out.println("Uncorrect Username");
		} else if (!account.getUserName().equals(userName) && !account.getPassword().equals(password)) {
			System.out.println("Uncorrect Username and Password!");
		}

		return false;

	}

}
