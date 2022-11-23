import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SweatinBullets {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("bullets.in"));
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			double s = scanner.nextDouble();
			int t = scanner.nextInt();
			if (s * Math.log(s) / Math.log(2) <= t)
				System.out.println("It's 32!");
			else
				System.out.println("Sweatin' bullets");
		}
	}
}
