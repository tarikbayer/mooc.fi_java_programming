import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            } else if (number > 0) {
                count = count + 1;
                sum = sum + number;
            }
            
        }
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double)sum / count;
            System.out.println("Average of the numbers: " + average);
        }
 
    }
}
