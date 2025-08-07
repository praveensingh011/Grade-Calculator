import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];
        int total = 0;

        System.out.println("Enter marks for " + numberOfSubjects + " subjects (out of 100):");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered! Please enter values between 0 and 100.");
                i--; // Ask again
            } else {
                total += marks[i];
            }
        }

        double average = (double) total / numberOfSubjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total + "/" + (numberOfSubjects * 100));
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
