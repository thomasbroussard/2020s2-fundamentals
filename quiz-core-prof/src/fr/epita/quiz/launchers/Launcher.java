package fr.epita.quiz.launchers;

import java.util.Scanner;

public class Launcher {



	public static void main(String[] args) {
		System.out.println("Hello, please login");
		System.out.print("Username : ");
		Scanner scanner = new Scanner(System.in);
		String login = scanner.nextLine();
		System.out.print("Password : ");
		String pwd = scanner.nextLine();
		// authenticate
		if ( !AuthenticationService.authenticate(login, pwd)) {
			System.out.println("unauthorized");
			scanner.close();
			return;
		}
		System.out.println("congratulations,  you are authenticated!");
		System.out.println("please choose among the following options:");
		System.out.println("Create(c), Update(u), Delete(d), Quit(q)");
		System.out.print("what is your choice? (c|u|d|q) ");
		String choice = scanner.nextLine();
		switch (choice) {
		case "c":
			System.out.println("Creation");
			break;
		case "d":
			System.out.println("deletion");
			break;
		case "u":
			System.out.println("update");
			break;
		case "q":
			System.out.println("good bye!");
			break;
		default:
			System.out.println("unrecognized option");
		}
		

		scanner.close();

	}
	


}
