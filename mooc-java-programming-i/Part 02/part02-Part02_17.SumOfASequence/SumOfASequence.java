import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int n = scanner.nextInt();
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.println("The sum is " + result);
    }
}
