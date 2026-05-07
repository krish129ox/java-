class Animal {
    String name;
}

class Dog extends Animal {
    // method of child class
    public void display() {
        System.out.println("My name is : " + name);
    }
}

public class Krish {
    public static void main(String[] args) {
        // object of subclass
        Dog labrador = new Dog();
        labrador.name = "Rohu";
        labrador.display();
    }
}
