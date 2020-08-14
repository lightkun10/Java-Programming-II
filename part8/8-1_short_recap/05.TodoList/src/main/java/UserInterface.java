import java.util.Scanner;

public class UserInterface {
    private final TodoList todoList;
    private final Scanner scanner;

    public UserInterface(TodoList tl, Scanner s) {
        this.todoList = tl;
        this.scanner = s;
    }

    public void start() {

        while (true) {
            // Keep ask user for a command input
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            // The command stop stops the execution of the loop,
            // after which the execution of the program advances
            // out of the start method.
            if (command.equals("stop")) {
                break;
            }

            // The command add asks the user for the next task to be added.
            // Once the user enters this task, it should be added to the to-do list.
            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.todoList.add(task);
            }

            // The commmand list prints all the tasks on the to-do list.
            if (command.equals("list")) {
                this.todoList.print();
            }

            // The command remove asks the user to enter the id of the task
            // to be removed. When this has been entered, the specified task
            // should be removed from the list of tasks.
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int remove = Integer.parseInt(scanner.nextLine());
                this.todoList.remove(remove);
            }

        }
    }
}
