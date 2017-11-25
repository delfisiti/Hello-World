import java.io.Console;
import java.io.IOException;

public class Login {

	public void inputlogin() {
	
		Console console = System.console();
		System.out.println("Selamat Datang di Toko Delfi ");
		System.out.println("Please enter your username: ");
		String input = console.readLine();
		 System.out.println("Your Username: " + input);
		 System.out.println("Enter your password: ");

		

		 char[] password = console.readPassword();
	
	

	}

}