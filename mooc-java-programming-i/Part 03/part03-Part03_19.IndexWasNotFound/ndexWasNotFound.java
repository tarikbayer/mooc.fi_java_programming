import java.util.Scanner;
 
public class IndexWasNotFound {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
 
        System.out.print("Search for? ");
        int searchNumber = Integer.valueOf(scanner.nextLine());
 
        // Implement the search functionality here
        
        
        boolean notFound = true;
        
        for(int i = 0; i<array.length; i++){
            if(searchNumber == array[i]){
                System.out.println(searchNumber + " is at index " + i + ".");
                notFound = false;
            }
        }
        if(notFound) {
            System.out.println(searchNumber + " was not found.");
        }
    }
 
}
