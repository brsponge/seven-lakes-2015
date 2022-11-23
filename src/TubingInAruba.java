import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TubingInAruba {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("tubing.in"));
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int level = scanner.nextInt();
			int m = scanner.nextInt();
			scanner.nextLine();
			for (int j = 0; j < m; j++) {
				String name = scanner.nextLine();
				int l = Integer.parseInt(name.substring(name.indexOf(",") + 2));
				name = name.substring(0, name.indexOf(","));
				if (l <= level)
					System.out.println(name);
			}
		}
	}
}
