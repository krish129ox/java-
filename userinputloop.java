
import java.util.Scanner;

public class userinputloop {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("enter your n:-");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=0; i<=n; i++)  {
            sum += i;
        }
        System.out.println("sum of 1 to "+n+"=" +sum);
        scanner.close();

    }
    
}
