package GUI;
import java.util.Scanner;
public class Online_GUI extends CreateTable{
	public void register_Account() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n"+createSpace()+createSpaceSmall()+"Fill out the form \n");
		System.out.print(createSpace());
		createRowForm();
		
		System.out.print("\n"+createSpace()+"Username: ");

	}
	public void online_GUI(){
		chooseCondition ch = new chooseCondition();
		
		System.out.println("Do you have an account?\n\t1. Register \t2. Login");
		if(ch.choose()) {
			//Register
			
		}
		else {
			//Login
		}
	}
	public static void main(String[] args) {
		Online_GUI c = new Online_GUI();
		
		c.register_Account();
	}
}
