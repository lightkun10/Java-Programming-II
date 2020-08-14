import java.util.ArrayList;

public class TodoList {
     private final ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    // Add the task passed as a parameter to the todo list.
    public void add(String task) {
        this.todos.add(task);
    }

    // Prints the exercises. Each task has a number associated
    // with it on the print statement — use the task's index here (+1).
    public void print() {
        // Iterate through each added todos
        for (String todo : this.todos) {
            int index = this.todos.indexOf(todo);
            int displayI = index + 1;
            System.out.println(displayI + ": " + todo);
        }
    }

    // Removes the task associated with the given number;
    // the number is the one seen associated with the task in the print.
    public void remove(int number) {
        int displayedI = number - 1;
        this.todos.remove(displayedI);
    }
}
