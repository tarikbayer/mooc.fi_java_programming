 
import java.util.Scanner;
 
public class GiftTax {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double giftValue = scan.nextDouble();
        
        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue < 25000) {
            System.out.println(100 + (giftValue - 5000) * 0.08);
        } else if (giftValue < 55000) {
            System.out.println(1700 + (giftValue - 25000) * 0.10);
        } else if (giftValue < 200000) {
            System.out.println(4700 + (giftValue - 55000) * 0.12);
        } else if (giftValue < 1000000) {
            System.out.println(22100 + (giftValue - 200000) * 0.15);
        } else if (giftValue >= 1000000) {
            System.out.println(142100 + (giftValue - 1000000) * 0.17);
        }
 
    }
}
