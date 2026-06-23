
import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    double temp;
    double newtemp;
    String unit;

    System.out.print("enter the temp:-");
    temp = scanner.nextDouble();

    System.out.print("convert to celsius or firenheight?(c or f):");
    unit = scanner.next().toUpperCase();
   newtemp = (unit.equals("c")) ? (temp-32)* 5 / 9 : (temp* 5 / 9) +32;

   System.out.printf("%.1f°%s", newtemp,unit);


    scanner.close();
 }

    
}
