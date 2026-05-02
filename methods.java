import java.util.Scanner;
class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[3];
        System.out.print("Enter task 1: ");
        tasks[0] = sc.nextLine();
        System.out.print("Enter task 2: ");
        tasks[1] = sc.nextLine();
        System.out.print("Enter task 3: ");
        tasks[2] = sc.nextLine();
        todolist x = new todolist();
        x.todo(tasks);
    }
}
class todolist {
    void todo(String[] t) {
        System.out.println("\nYour To-Do List:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + t[i]);
        }
    }
}