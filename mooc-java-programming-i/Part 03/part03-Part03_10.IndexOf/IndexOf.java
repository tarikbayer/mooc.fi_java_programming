
import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOf {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
 
            list.add(input);
        }
 
        System.out.println("Search for?");
        int index = scanner.nextInt();
        int i = 0;
        
        for (int j = 0; j < list.size(); j++) {
            if(index == list.get(j)){
                System.out.println(index + " is at index " + j);
            }
        }
    
        
    
    
    } 
 
 
            
        
}
