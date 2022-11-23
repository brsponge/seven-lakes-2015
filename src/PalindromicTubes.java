import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromicTubes {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("palinTubes.in"));
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			String s = scanner.next();
			for (int j = 2; j < s.length() - 1; j++) {
				if (isPalindrome(s.substring(0, j)) && isPalindrome(s.substring(j))) {
					System.out.println(s);
					break;
				}
			}
		}
	}

	private static boolean isPalindrome(String s) {
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}

		return true;
	}
}
