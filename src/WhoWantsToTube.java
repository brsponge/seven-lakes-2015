import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhoWantsToTube {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("whoWants.in"));
		int count = 0;
		while (scanner.hasNextLine()) {
			count++;
			scanner.nextLine();
		}
		for (int i = 0; i < count; i++) {
			System.out.println("WE DO!");
		}
		System.out.println("Silence is a friend that never betrays.");
	}
}
