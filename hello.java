
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your marks: ");
        int marks = scanner.nextInt();
        if (marks>=90){
        System.out.println("nigga you on top"); 
        }
        if (marks<90 && marks>=80){
            System.out.println("dang thats goood");
        }
        if(marks<80 && marks>=70){
            System.out.println("its fine");
        }
        if(marks<70 && marks>=60){
            System.out.println("thats not bad");
        }
        else 
        {
            System.out.println("nahh bruhh you failed");
        }
        scanner.close();
    }
            
        }
        
    
    

