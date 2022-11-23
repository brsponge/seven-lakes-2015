import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheCompilerDontCare {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("compiler.in"));
		int z = scanner.nextInt();
		for (int i = 0; i < z; i++) {
			boolean done = false;
			int m = scanner.nextInt();
			for (int j = 0; j < m; j++) {
				String s = scanner.next();
				if (s.equals("print")) {
					int n = scanner.nextInt();
					String t = scanner.next();
					if (!done)
						System.out.println(t.repeat(n));
				} else if (s.equals("println")) {
					int n = scanner.nextInt();
					String t = scanner.next();
					if (!done)
						System.out.print((t + "\n").repeat(n));
				} else if (s.equals("selfdestruct")) {
					if (!done)
						System.out.println("DONE");
					done = true;
				} else if (s.equals("add")) {
					int a = scanner.nextInt();
					int b = scanner.nextInt();
					if (!done)
						System.out.println(a + b);
				} else if (s.equals("Care"))
					if (!done)
						System.out.println("No!");
			}
		}
	}
}
