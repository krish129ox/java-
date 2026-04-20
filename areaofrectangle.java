
import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter your length:-");
            int length = scanner.nextInt();
            System.out.print("enter your width:-");
            int width =scanner.nextInt();
          int  areaofrectangle=length * width;
          System.out.println("Area of rectangle =" + areaofrectangle);
          scanner.close();

    }
    
}
