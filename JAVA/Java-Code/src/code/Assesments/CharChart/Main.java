package code.Assesments.CharChart;

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in).useDelimiter("\\n");
		String str = sc.next();
		LetterSequence l = new LetterSequence(str);
		l.computeFrequency();
		l.displayLetterFrequency();

	}

}
