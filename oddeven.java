
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
    System.out.print("enter your marks:-");
    int marks= scanner.nextInt();
    if(marks>=90){
        System.out.println("you on top");
    }
    else if(marks<90 && marks>=80){
        System.out.println("its good its cool");
    }
    else if(marks<80 && marks>=70){
        System.out.println("its fine ");
    }
    else if(marks<70 && marks>=60){
        System.out.println("its not bad but still needs improvement");
    }
    else{
        System.out.println("nigga you fuked up");
    }
    scanner.close();



    }


    } 

