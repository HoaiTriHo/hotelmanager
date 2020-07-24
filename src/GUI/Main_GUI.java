package GUI;

public class Main_GUI {
	
	public static void main(String[] args) {
		Offline_GUI offline = new Offline_GUI();
		Online_GUI online = new Online_GUI();
		chooseCondition ch = new chooseCondition();
		
		System.out.println("Do you want?");
		System.out.println("\t1. Check-in room \t2. Check-out room");
		
		//Book online or Offline
		if(ch.choose()) {
			System.out.println("You want?\n \t1. Book Online \t2. Book Offline");
			if(ch.choose()) {
				//online
				
			}
			else {
				//offline
				System.out.println("you choose offline");
			}
		}
	}
}
