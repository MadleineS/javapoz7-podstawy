package todos;

import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] todos = new String[10];
        int index = 0;
        int decision;
        do {
            TodoViews.menu();
        System.out.println("1. Dodaj");
        System.out.println("2. Wyswietl");
        System.out.println("0. Koniec");
       decision =   scanner.nextInt();
       scanner.nextLine();

       switch (decision) {

           case 1:
               if (index == todos.length) {
                   TodoViews.noSpaceWarningMessage();
                   TodoViews.waitForUser(scanner);
                   System.out.println("No space for new todo");
                   System.out.println("Press any key to continue");
                   System.out.println();
                   System.out.println();
                   scanner.nextLine();
               } else {
                   addTodo(scanner, todos, index );
               index++;
               }
               break;
           case 2:
               listTodos(todos, index);
               TodoViews.waitForUser(scanner);
//               System.out.println();
//               System.out.println();
//               System.out.println("Press any key to display");
//               scanner.nextLine();
               break;
       }

    } while (decision != 0);

    }

    private static void addTodo(Scanner scanner, String[] todos, int index) {
        TodoViews.newTodoMessage();
//        System.out.println("Add next todo");
        String newTodo = scanner.nextLine();
        //wstawianie do tablicy
        todos[index] = newTodo;
    }
    private static void listTodos(String[] todos, int todosToDispaly) {
        TodoViews.noTodosToDisplay();
        //wyswietlanie tablicy
        for (int i = 0; i < todosToDispaly ; i++) {
//            System.out.println(i+ ". " + todos[i]);
        }

        }

}