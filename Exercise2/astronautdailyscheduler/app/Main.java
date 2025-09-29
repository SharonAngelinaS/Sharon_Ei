package app;

import factory.TaskFactory;
import model.Task;
import singleton.ScheduleManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScheduleManager schedule = ScheduleManager.getInstance();
        TaskFactory factory = new TaskFactory();

        int choice;
        do {
            System.out.println("\n==== Astronaut Daily Schedule ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task Type (experiment/maintenance/communication): ");
                    String type = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();

                    System.out.print("Enter Start Time (HH:mm): ");
                    String start = sc.nextLine();

                    System.out.print("Enter End Time (HH:mm): ");
                    String end = sc.nextLine();

                    Task t = factory.createTask(type, desc, start, end);
                    if (t != null) {
                        schedule.addTask(t);
                    } else {
                        System.out.println("Invalid task type.");
                    }
                    break;

                case 2:
                    schedule.displayTasks();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}