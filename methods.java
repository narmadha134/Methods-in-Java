import java.util.Scanner;

class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a task message: ");  
        String a = sc.nextLine();                      
        
        todolist x = new todolist();
        x.todo(a);
    }
}

class todolist {
    void todo(String b) {
        if (b.isBlank()) {
            System.out.println("Empty message");   
            return;
        } else {
            System.out.println("Your task: " + b);
            System.out.println("Thank you for your task"); 
        }
    }
}