import java.util.Scanner;
 
public class PrintThrice {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here
        
        System.out.print("Give a word: ");
        String inputString = scanner.nextLine();
        
        String newString = inputString + inputString + inputString;
        System.out.println(newString);
    }
}
