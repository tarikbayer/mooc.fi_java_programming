import java.util.Scanner;
 
public class ComparingNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Give the second number:");
        int number2 = scanner.nextInt();
        
        
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
 
    }
}
 
