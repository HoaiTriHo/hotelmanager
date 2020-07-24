package GUI;

import java.util.Scanner;
import DTO.Account_DTO;
import BUS.Online_BUS;

public class Online_GUI extends CreateTable {

	public void register_Account(Account_DTO dto) {

		Scanner scanner = new Scanner(System.in);
		Online_BUS bus = new Online_BUS();

		String email, username, password;

		System.out.print("\n" + createSpace() + "Fill out the form \n");
		System.out.print(createSpace());
		createRowForm();

		System.out.print("\n" + createSpace() + "*Email: ");
		email = scanner.nextLine();
		System.out.print("\n" + createSpace() + "*Username: ");
		username = scanner.nextLine();
		System.out.print("\n" + createSpace() + "*Password: ");
		password = scanner.nextLine();

		System.out.print(createSpace());
		createRowForm();

		if (bus.checkData(email, username, password)) {
			if (bus.checkLength(username, password))
				bus.getDataFromForm(dto, email, username, password);
			else {
				System.err.println("\n" + createSpace() + "**Please username and password length > 6**");
				register_Account(dto);
			}
		} else {
			System.err.println("\n" + createSpace() + "**Please fill full the fields**");
			register_Account(dto);
		}
	}

	public void login_Account() {
		Scanner scanner = new Scanner(System.in);
		String email, username, password;
		System.out.println("Do you want login?\n\t1. Yes \t2. No");
		
		System.out.print("\n" + createSpace() + "Fill out the form \n");
		System.out.print(createSpace());
		createRowForm();

		System.out.print("\n" + createSpace() + "*Email: ");
		email = scanner.nextLine();
		System.out.print("\n" + createSpace() + "*Username: ");
		username = scanner.nextLine();
		System.out.print("\n" + createSpace() + "*Password: ");
		password = scanner.nextLine();

		System.out.print(createSpace());
		createRowForm();
	}
}
