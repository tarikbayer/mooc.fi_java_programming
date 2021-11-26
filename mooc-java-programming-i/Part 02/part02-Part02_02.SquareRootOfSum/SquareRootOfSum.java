import java.util.Scanner;
 
public class SquareRootOfSum {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Give the second number:");
        int number2 = scanner.nextInt();
        
        int sum = number1 + number2;
        double squareRoot = Math.sqrt(sum);
        
        System.out.println(squareRoot);
 
    }
}
 
