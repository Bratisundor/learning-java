abstract class Grandfather{
    Grandfather(){

    }
    void Eat(){
        System.out.println("Grandfather was Eating");
    }
    void Drink(String a, String b){
        System.out.println(a +" is now Drinking "+b);
    }

    void Drink(){

    }

    void Sleep(){
        System.out.println("Grandfather is now Sleeping on Armchair");
    }

}

class Father extends Grandfather{
    Father(){

    }

    @Override
    void Eat() {
        super.Eat();
    }

    @Override
    void Drink() {
        super.Drink("Father","Coffee");
    }

    @Override
    void Sleep() {
        super.Sleep();
    }
    void Work(){
        System.out.println("Father Work in Business");
    }

}
class Child extends Grandfather{
    Child(){

        super.Drink();
        this.Eat();
    }
}
public class Human {
    public static void main(String[] args) {
        Child ch = new Child();
        Father fh = new Father();
        ch.Drink();
        fh.Drink();
        fh.Work();
//        Grandfather.Sleep();

    }
}
