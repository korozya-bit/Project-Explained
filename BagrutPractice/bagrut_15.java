package BagrutPractice;

public class bagrut_15 {
	public static int gradeCalc(int startingLevel, int startingUnit, int currentLevel, int currentUnit) {
		return 2 * (currentLevel - startingLevel) + currentUnit - startingUnit;
	}

	public static void main(String[] args) {
		System.out.println(gradeCalc(6, 2, 9, 1));
		System.out.println(gradeCalc(2, 1, 4, 2));
		System.out.println(gradeCalc(4, 2, 9, 2));
	}
}
