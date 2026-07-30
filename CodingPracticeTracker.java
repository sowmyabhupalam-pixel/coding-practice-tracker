import java.util.ArrayList;
import java.util.Scanner;

public class CodingPracticeTracker {

    static ArrayList<Problem> problems = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Coding Practice Tracker =====");
            System.out.println("1. Add Problem");
            System.out.println("2. View Problems");
            System.out.println("3. Search Problem");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
    scanner.nextLine();

    System.out.print("Enter Problem ID: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter Problem Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Difficulty: ");
    String difficulty = scanner.nextLine();

    System.out.print("Enter Platform: ");
    String platform = scanner.nextLine();

    Problem p = new Problem(id, name, difficulty, platform);
    problems.add(p);

    System.out.println("Problem added successfully!");
    break;

                case 2:
    if (problems.isEmpty()) {
        System.out.println("No problems found.");
    } else {
        System.out.println("\n===== Problem List =====");

        for (Problem Problem : problems) {
            Problem.displayProblem();
        }
    }
    break;

                case 3:
                    System.out.println("Search Problem feature will be implemented next.");
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
