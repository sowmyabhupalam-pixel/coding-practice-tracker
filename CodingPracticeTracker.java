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
            System.out.println("4.Delete problem");
            System.out.println("5. Update Problem");
            System.out.println("6.Exit");

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
    scanner.nextLine();

    System.out.print("Enter Problem Name to Search: ");
    String searchName = scanner.nextLine();

    boolean found = false;

    for (Problem problem : problems) {

        if (problem.problemName.equalsIgnoreCase(searchName)) {

            System.out.println("\nProblem Found!");
            problem.displayProblem();
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Problem not found.");
    }

    break;

                case 4:
    scanner.nextLine();

    System.out.print("Enter Problem Name to Delete: ");
    String deleteName = scanner.nextLine();

    boolean deleted = false;

    for (int i = 0; i < problems.size(); i++) {
        if (problems.get(i).problemName.equalsIgnoreCase(deleteName)) {
            problems.remove(i);
            deleted = true;
            System.out.println("Problem deleted successfully!");
            break;
        }
    }

    if (!deleted) {
        System.out.println("Problem not found.");
    }
    break;

case 5:
    scanner.nextLine();

    System.out.print("Enter Problem Name to Update: ");
    String updateName = scanner.nextLine();

    boolean updated = false;

    for (Problem problem : problems) {

        if (problem.problemName.equalsIgnoreCase(updateName)) {

            System.out.print("Enter New Difficulty: ");
            problem.difficulty = scanner.nextLine();

            System.out.print("Enter New Platform: ");
            problem.platform = scanner.nextLine();

            updated = true;

            System.out.println("Problem updated successfully!");
            break;
        }
    }

    if (!updated) {
        System.out.println("Problem not found.");
    }

    break;

case 6:
    System.out.println("Thank you!");
    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
