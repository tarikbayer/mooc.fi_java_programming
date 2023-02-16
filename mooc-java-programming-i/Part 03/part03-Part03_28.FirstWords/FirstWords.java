import java.util.Scanner;
 
public class FirstWords {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = null;
        
        while(true){
            input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            
            String[] pieces = input.split(" ");
            
            System.out.println(pieces[0]);
        }
 
    }
}
 
