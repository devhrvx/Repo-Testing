import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomList l = new CustomList();
		boolean inSession = true;
		while (inSession) {
			System.out.print("\nActions:\n\tA-insert an element\n\tB-remove an element\n\tC-get random value\n\tD-Replace an element inside the list\n\tE- display the list\n\tANY- to end session\n\n\t");

			String choice = input.next();
			switch (choice.toLowerCase()) {
			case "a":
				l.insert();
				break;
			case "b":
				l.remove();
				break;
			case "c":
				l.getRandom();
				break;
			case "d":
				l.replaceElem();
				break;
			case "e":
				l.displayList();
				break;
			default:
				inSession = false;
			}
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("An error has occured.");
            }
		}
	}

}