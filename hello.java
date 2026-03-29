
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your number:- ");
        int number = scanner.nextInt();
        if (number %2==0){
        System.out.println("the number is even"); 
        }
        else
        {
            System.out.println("the number is odd");
        }
        scanner.close();
        
        }
        
    }
            
        
        
    
    

