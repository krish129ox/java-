
import java.util.Scanner;

public class sumoftwonumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter your num1:-");
        int num1=scanner.nextInt();
        System.out.print("enter your num2:-");
        int num2=scanner.nextInt();
        int sum ;
        sum=num1+num2;
        System.out.println("the sum of your num is "+sum);
        scanner.close();
    }
    
    
}
