import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SafeCrack {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("safe.in"));
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			String number = scanner.next();
			int max = 0;
			for (int j = 0; j < number.length(); j++) {
				max = Math.max(number.charAt(j) - 48, max);
			}
			System.out.println(max);
		}
	}
}
