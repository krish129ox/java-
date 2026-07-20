interface dance{
    void dance();
}
class robot implements dance{
   public  void dance(){
        System.out.println("nach raha hai");
    }
}

public class lamdatest {
    public static void main(String[] args) {
        robot g1 = new robot(){
            public void dance(){
                System.out.println("nach raha hai");
            }
        };
        g1.dance();
    }
    
}
