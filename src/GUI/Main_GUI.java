package GUI;

import BUS.Online_BUS;
import DAL.Online_DAL;
import DTO.Account_DTO;

public class Main_GUI {

	public static void main(String[] args) {
		Offline_GUI offline = new Offline_GUI();
		Online_GUI online = new Online_GUI();
		Online_DAL online_dal = new Online_DAL();
		Account_DTO dto = new Account_DTO();
		chooseCondition ch = new chooseCondition();
		Online_BUS bus = new Online_BUS();

		System.out.println("Do you want?");
		System.out.println("\t1. Check-in room \t2. Check-out room");

		// Book online or Offline
		if (ch.choose()) {
			System.out.println("You want?\n \t1. Book Online \t2. Book Offline");
			if (ch.choose()) {
				// online
				System.out.println("Do you have an account?\n\t1. Register \t2. Login");
				if (ch.choose()) {
					// Register
//					online.register_Account(dto);
//					online_dal.insertData(dto);
					online.login_Account();
				} else {
					// Login
				}
			} else {
				// offline
				System.out.println("you choose offline");
			}
		}
	}
}
