import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Write your program here
        System.out.println("Give a string:");
        String stringInput = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int intInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double doubleInput = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolInput = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + stringInput);
        System.out.println("You gave the integer " + intInput);
        System.out.println("You gave the double " + doubleInput);
        System.out.println("You gave the boolean " + boolInput);
            
 
    }
}
 
