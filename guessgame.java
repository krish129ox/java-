
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        int secretnumber =7;
        int guess =-1;
        while(guess != secretnumber){
            System.out.print("enter your guess:-");
            guess=scanner.nextInt();
            if(guess < secretnumber){
                System.out.println("bruhh thats low 😭✌️!");
            }else if (guess > secretnumber){
                System.out.println("fahhhhhhhhh thats too high 💀!");
            }else {
                System.out.println("you got it😩");
                scanner.close();
            }

        }
    
            
        
    }
    
}
