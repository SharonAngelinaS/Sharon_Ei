package app;

import Singleton.ScheduleManager;
import Singleton.Task;
import factory.TaskFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Astronaut Daily Schedule Organizer =====");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. View Tasks by Priority");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Enter Start Time (HH:mm): ");
                        String start = sc.nextLine();
                        System.out.print("Enter End Time (HH:mm): ");
                        String end = sc.nextLine();
                        System.out.print("Enter Priority (High, Medium, Low): ");
                        String priorityStr = sc.nextLine().trim().toLowerCase();
                        int priority;
                        switch (priorityStr) {
                            case "high":
                                priority = 3;
                                break;
                            case "medium":
                                priority = 2;
                                break;
                            case "low":
                                priority = 1;
                                break;
                            default:
                                System.out.println("❌ Invalid priority. Please enter High, Medium, or Low.");
                                continue;
                        }
                        Task task = TaskFactory.createTask(desc, start, end, priority);
                        manager.addTask(task);
                        break;
                    case 2:
                        System.out.print("Enter Task Description to Remove: ");
                        String removeDesc = sc.nextLine();
                        manager.removeTask(removeDesc);
                        break;
                    case 3:
                        manager.viewTasks();
                        break;
                    case 4:
                        System.out.print("Enter Priority to View (High, Medium, Low): ");
                        String viewPriorityStr = sc.nextLine().trim().toLowerCase();
                        int viewPriority;
                        switch (viewPriorityStr) {
                            case "high":
                                viewPriority = 3;
                                break;
                            case "medium":
                                viewPriority = 2;
                                break;
                            case "low":
                                viewPriority = 1;
                                break;
                            default:
                                System.out.println("❌ Invalid priority. Please enter High, Medium, or Low.");
                                continue;
                        }
                        manager.viewTasksByPriority(viewPriority);
                        break;
                    case 5:
                        System.out.print("Enter Task Description to Mark Completed: ");
                        String completeDesc = sc.nextLine();
                        manager.markTaskCompleted(completeDesc);
                        break;
                    case 6:
                        System.out.println("🚀 Exiting Astronaut Schedule Organizer. Goodbye!");
                        sc.close();
                        return;
                    default:
                        System.out.println("❌ Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
