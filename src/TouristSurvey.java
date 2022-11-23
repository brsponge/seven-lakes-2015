import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TouristSurvey {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("survey.in"));
		int total = 0;
		double male = 0;
		double totalAge = 0;
		double plan = 0;
		while (scanner.hasNextLine()) {
			total++;
			scanner.next();
			scanner.next();
			if (scanner.next().equals("Male"))
				male++;
			totalAge += scanner.nextInt();
			if (scanner.next().equals("Yes"))
				plan++;
		}

		System.out.printf("""
				Number of Respondents : %d
				Percentage of Male Tourists : %.3f
				Percentage of Female Tourists : %.3f
				Average Age of Tourists : %.3f
				Percentage of who plan to go tubing : %.3f
				Have a great trip, everyone!
				""", total, 100 * male / total, 100 * (total - male) / total, totalAge / total, plan / total * 100);
	}
}
