
import java.util.Scanner;

public class userinputloop {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("enter your n:-");
        int n=scanner.nextInt();
        for (int i=0; i<=n; i++)  {
            System.out.println(i);
        }
        scanner.close();

    }
    
}
