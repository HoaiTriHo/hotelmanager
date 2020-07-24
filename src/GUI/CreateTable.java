package GUI;

public class CreateTable {
	public void createRowForm() {
		for(int i = 0; i<60;i++) {
			System.out.print((char)95);
		}
	}

	public String createSpace() {
		return "\t\t\t\t";
	}
	public String createSpaceSmall() {
		return "\t\t\t";
	}
}
