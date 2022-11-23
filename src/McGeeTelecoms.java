import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class McGeeTelecoms {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("mcgeeTele.in"));
		int R = scanner.nextInt();
		int[][] mat = new int[R][];
		int[][] sums = new int[R][];
		for (int i = 1; i <= R; i++) {
			mat[i - 1] = new int[i];
			sums[i - 1] = new int[i];
			for (int j = 0; j < i; j++) {
				mat[i - 1][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < R; i++) {
			sums[R - 1][i] = mat[R - 1][i];
		}
		for (int i = R - 2; i >= 0; i--) {
			for (int j = 0; j < i + 1; j++) {
				sums[i][j] = mat[i][j] + Math.max(sums[i + 1][j], sums[i + 1][j + 1]);
			}
		}
		System.out.println(sums[0][0]);
	}
}
