 
import java.util.Scanner;
 
public class Squared {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        
        int square = number * number;
        
        System.out.println(square);
 
    }
}
 
