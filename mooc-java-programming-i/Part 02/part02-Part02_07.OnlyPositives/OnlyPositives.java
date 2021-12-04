import java.util.Scanner;
 
public class OnlyPositives {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powerOfTwo;
        
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if (number <0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number == 0) {
                break;
            } else {
                powerOfTwo = number * number;
                System.out.println(powerOfTwo);
            }
        }
 
    }
}
