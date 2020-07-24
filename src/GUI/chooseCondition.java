package GUI;
import java.util.Scanner;

public class chooseCondition {
	public boolean choose() {
		int choose;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("\tYour choose: ");
			choose = scanner.nextInt(); 
		}while(choose != 1 && choose != 2);
		
		if(choose == 1)
			return true;
		return false;
	}
}
