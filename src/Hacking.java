import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hacking {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("hacking.in"));
		int N = scanner.nextInt();
		int[] memory = new int[N];
		for (int i = 0; i < N; i++) {
			scanner.nextInt();
			memory[i] = scanner.nextInt(16);
		}
		boolean first = true;
		for (int i = 0; i < N; i++) {
			scanner.nextInt();
			if (memory[i] != scanner.nextInt(16)) {
				System.out.print((first ? "" : ",") + i);
				first = false;
			}
		}
	}
}
