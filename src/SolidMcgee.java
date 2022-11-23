import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolidMcgee {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("solid.in"));
		int n = scanner.nextInt();
		for (int u = 0; u < n; u++) {
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			char[][] mat = new char[r][c];
			for (int i = 0; i < r; i++) {
				mat[i] = scanner.next().toCharArray();
			}
			int startI = -1;
			int startJ = -1;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (mat[i][j] == 'M') {
						startI = i;
						startJ = j;
					}
				}
			}
			System.out.println(!find(mat, startI, startJ, 0) ? "RESORT TO VIOLENCE" : "SNEAKY BEAKY");
		}
	}

	private static boolean find(char[][] mat, int i, int j, int dir) {
		if (i < 0 || j < 0 || i >= mat.length || j >= mat[i].length || mat[i][j] == '5' || mat[i][j] == 'G')
			return false;
		if (mat[i][j] == 'E')
			return true;
		if (dir == 0) {
			for (int k = j; k < mat[i].length; k++) {
				if (mat[i][k] == 'G')
					return false;
			}
		} else if (dir == 1) {
			for (int k = i; k < mat.length; k++) {
				if (mat[k][j] == 'G')
					return false;
			}
		} else if (dir == 2) {
			for (int k = j; k >= 0; k--) {
				if (mat[i][k] == 'G')
					return false;
			}
		} else if (dir == 3) {
			for (int k = i; k >= 0; k--) {
				if (mat[k][j] == 'G')
					return false;
			}
		}
		if (mat[i][j] == '1')
			mat[i][j] = '2';
		else if (mat[i][j] == '2')
			mat[i][j] = '3';
		else if (mat[i][j] == '3')
			mat[i][j] = '4';
		else if (mat[i][j] == '4')
			mat[i][j] = '5';
		else
			mat[i][j] = '1';
		dir = (dir + 1) % 4;
		return find(mat, i + 1, j, dir) || find(mat, i - 1, j, dir) || find(mat, i, j + 1, dir)
				|| find(mat, i, j - 1, dir);
	}
}
