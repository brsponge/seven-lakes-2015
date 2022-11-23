import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RectU {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("rect_u.in"));
		long n = scanner.nextLong();
		for (int i = 0; i < n; i++) {
			long x = scanner.nextLong();
			long y = scanner.nextLong();
			System.out.println(Math.abs((scanner.nextLong() - x) * (scanner.nextLong() - y)));
		}
	}
}
