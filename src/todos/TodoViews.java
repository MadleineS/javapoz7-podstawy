package todos;

import java.util.Scanner;

public class TodoViews {
    public static void menu() {

    }

    public static void noSpaceWarningMessage() {
        System.out.println("no space for new todo");
        System.out.println();
        System.out.println();
    }

    public static void waitForUser(Scanner scanner) {
        System.out.println("Press any key to continue");
        scanner.nextLine();

    }

    public static void newTodoMessage() {
        System.out.println();
        System.out.println("add next todo");
        System.out.println();
    }

    public static void noTodosToDisplay() {
        System.out.println("-------------");
        System.out.println("-No todos to display");
        System.out.println("-------------");
    }
}
