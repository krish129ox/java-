public class genericfunction {
    static <T> void print(T s){
        System.out.println(s);

    }
    public static void main(String [] a){
        print(new int[]{10,20,30,40,50});
    }
    
}
