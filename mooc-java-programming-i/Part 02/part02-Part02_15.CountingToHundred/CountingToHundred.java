import java.util.Scanner;
 
public class CountingToHundred {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        
        
        for (int i = count; i <= 100; i++) {
            System.out.println(i);
        }
 
    }
}
 
