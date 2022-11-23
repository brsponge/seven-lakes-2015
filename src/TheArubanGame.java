import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TheArubanGame {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("game.in"));
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			String s = scanner.next();
			if (s.equals("scythe"))
				System.out.println("river");
			else if (s.equals("tube"))
				System.out.println("scythe");
			else if (s.equals("river"))
				System.out.println("tube");
		}
	}
}
