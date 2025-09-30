import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Forum forum = new Forum();
        List<Student> students = new ArrayList<>();

        // Pre-register some students
        Student s1 = new Student("Alice", forum);
        Student s2 = new Student("Bob", forum);
        Student s3 = new Student("Charlie", forum);

        forum.addObserver(s1);
        forum.addObserver(s2);
        forum.addObserver(s3);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("=== University Forum ===");

        int choice = 0;
        while (choice != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Post a new message");
            System.out.println("2. Mark all messages as read");
            System.out.println("3. Add new student subscriber");
            System.out.println("4. Remove a student subscriber");
            System.out.println("5. Show current subscribers");
            System.out.println("6. Exit");

            System.out.print("Choose an option (1-6): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Enter a number (1-6).");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter message to post: ");
                    String message = scanner.nextLine();
                    System.out.println("\n[FORUM] New message posted: " + message);
                    forum.postMessage(message);
                    break;

                case 2:
                    System.out.println("\n[FORUM] Marking all messages as read...");
                    forum.markAllRead();
                    break;

                case 3:
                    System.out.print("Enter new student name: ");
                    String newName = scanner.nextLine();
                    Student newStudent = new Student(newName, forum);
                    forum.addObserver(newStudent);
                    students.add(newStudent);
                    System.out.println(newName + " subscribed to the forum.");
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No students to remove.");
                        break;
                    }
                    System.out.println("Select student to remove:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + ". " + students.get(i).getName());
                    }
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt() - 1;
                        scanner.nextLine();
                        if (index >= 0 && index < students.size()) {
                            Student removed = students.remove(index);
                            forum.removeObserver(removed);
                            System.out.println(removed.getName() + " unsubscribed.");
                        } else {
                            System.out.println("Invalid selection.");
                        }
                    } else {
                        System.out.println("Invalid input.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    System.out.println("Current subscribers:");
                    if (students.isEmpty()) {
                        System.out.println("No active subscribers.");
                    } else {
                        for (Student st : students) {
                            System.out.println("- " + st.getName());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting forum...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}