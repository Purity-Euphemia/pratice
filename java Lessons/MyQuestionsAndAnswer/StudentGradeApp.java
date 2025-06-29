import java.util.Scanner;

public class StudentGradeApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

 	System.out.print("How many students? ");
	int numberOfStudents = input.nextInt();

	System.out.print("How many students? ");
	int numberOfSubjects = input.nextInt();


	int[][] scores = new int[numberOfStudents][numberOfSubjects];


	for (int count = 0; count < numberOfStudents; count++) {
	System.out.println("\nStudent " + (count + 1) + ":");


		for (int counter = 0; counter < numberOfSubjects; counter++) {
		int score;

			do {
				System.out.print("Enter score for Subjects " + (counter + 1) + ": ");
				score = input.nextInt();
				if (score < 0 || score > 100) {
					System.out.println("Score must be 0 to 100.");

					}


			} while (score < 0 || score > 100);
			

			scores[count][counter] = score;


		}
	}


	System.out.println("\n--- Class Summary ---");
	for (int count = 0; count < numberOfStudents; count++) {
	int total = 0;
	
		for (int counter = 0; counter < numberOfSubjects; counter++) {
			total += scores[count][counter];


}
		double average = (double) total / numberOfStudents;
		System.out.println("Student " + (count + 1) + ": Total = " + total + ", Average = " + average);

}



}
}