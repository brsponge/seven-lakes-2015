import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheRealMcGee {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("real.in"));
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String aq = scanner.nextLine();
			String bq = scanner.nextLine();
			String cq = scanner.nextLine();
			String ac = scanner.nextLine();
			ac = ac.substring(0, ac.length() - 1);
			String bc = scanner.nextLine();
			bc = bc.substring(0, bc.length() - 1);
			String cc = scanner.nextLine();
			cc = cc.substring(0, cc.length() - 1);
			String aa = scanner.nextLine();
			boolean correct = true;
			if (!aa.toLowerCase().equals(ac.toLowerCase()))
				correct = false;
			String ba = scanner.nextLine();
			if (!ba.toLowerCase().equals(bc.toLowerCase()))
				correct = false;
			String ca = scanner.nextLine();
			if (!ca.toLowerCase().equals(cc.toLowerCase()))
				correct = false;
			System.out.printf("""
					%s : %s
					%s : %s
					%s : %s
					%s
					""", aq, aa, bq, ba, cq, ca, correct ? "The Real McGee" : "shoulda used Java");
		}
	}
}
