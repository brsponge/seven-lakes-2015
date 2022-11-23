import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArubanVisas {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("visas.in"));
		int female = scanner.nextInt();
		int male = scanner.nextInt();
		scanner.nextLine();
		ArrayList<String> females = new ArrayList<>();
		ArrayList<String> males = new ArrayList<>();
		for (int i = 0; i < male + female; i++) {
			String name = scanner.nextLine();
			boolean girl = name.substring(name.indexOf(",") + 2).equals("female");
			name = name.substring(0, name.indexOf(","));
			if (girl) {
				if (females.size() < female)
					females.add(name);
			} else {
				if (males.size() < male)
					males.add(name);
			}
		}
		for (String string : females) {
			System.out.println(string);
		}
		for (String string : males) {
			System.out.println(string);
		}
	}
}
