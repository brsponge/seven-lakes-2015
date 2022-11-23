import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TowerRating {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("sample.in"));
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			double y = scanner.nextDouble();
			double h = scanner.nextDouble();
			double t = scanner.nextDouble();
			double u = scanner.nextDouble();
			System.out.printf("%.2f\n", Math.pow(y * h, 1.0 / t) / 2.0 * u);
		}
	}
}
