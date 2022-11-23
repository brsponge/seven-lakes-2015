import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArubanPhonebooks {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("phonebook.in"));
		int n = scanner.nextInt();
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String last = scanner.next();
			names.add(scanner.next() + ", " + last);
		}
		Collections.sort(names);
		for (String string : names) {
			System.out.println(string);
		}
	}
}
