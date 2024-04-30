class Computer{
    void display(){
        System.out.println("The Computer is now Running");
    }
}
class Laptop extends Computer{
    void display(){
        super.display();
        System.out.println("The Laptop is now running");
    }
}
public class Wednesday {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.display();
        Computer C1 = new Computer();
        C1.display();
    }
}
