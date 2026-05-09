import java.util.Scanner;

public class scale {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double weight;
        double neWweight;
        int choice;
        System.out.println("weight converter");
        System.out.println("1: to convert in kgs ");
        System.out.println("2: to convert in lbs");

        System.out.println("chose an option");
        choice = scanner.nextInt();
        if(choice == 1){
            System.out.print("enter your weight in lbs");
            weight = scanner.nextDouble();
            neWweight = weight * 0.453592;
            System.out.printf("the weight in kg is %.2f",neWweight);
        }
        else if(choice ==2){
        System.out.print("enter your weight in kgs");
        weight =scanner.nextDouble();
        neWweight= weight * 2.20462;
        System.out.printf("the weight in lbs is %.2f",neWweight);
        }
        else{
            System.out.println("the choice is invalid");
        }scanner.close();
    


        
        

}
    
}

