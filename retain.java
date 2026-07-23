import java.util.ArrayList;

public class retain {
     public static void main(String[] args)
    {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(50);
        al.add(20);
        ArrayList<Integer> ref= new ArrayList<>();
        ref.add(50);
        ref.add(30);
        ref.add(40);
        ref.add(20);
        boolean x= ref.retainAll(al);//gives values that are common to both
        System.out.print(ref);
    }
}