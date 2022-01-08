import java.util.Scanner;
 
public class FromWhereToWhere {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here
        
        int number = scanner.nextInt();
        int startNumber = scanner.nextInt();
        
        for (int i = startNumber; i <= number; i++) {
            System.out.println(i);
        }
    }
}
