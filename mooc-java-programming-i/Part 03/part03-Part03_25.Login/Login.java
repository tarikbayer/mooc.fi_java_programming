import java.util.Scanner;
 
public class Login {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String inputId = scanner.nextLine();
        System.out.println("Enter password: ");
        String inputPw = scanner.nextLine();
        
        if (inputId.equals("alex") && inputPw.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (inputId.equals("emma") && inputPw.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
 
