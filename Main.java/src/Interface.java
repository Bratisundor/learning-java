interface Animal{
    void show();
    void eat();
    void sleep();
    void move();
        }

class Mamals implements Animal{
    String a,b;
    public void eat(){
        System.out.println(a+"is eating");
    }
    public void move(){

    }
    public void sleep(){

    }
    public void show(){
        System.out.println(a+" "+b);
    }

}
class Aadmi extends Mamals{
    void drink(){
        System.out.println("Water is Human Life......");
    }
}

class Reptilse implements Animal{
    String a,b;
    public void eat(){

    }
    public void sleep(){

    }
    public void move(){

    }
    public void show(){
        System.out.println(a+" "+b);
    }
}
class Crocodile extends Reptilse{
        void colours(){
            System.out.println("Crocodile colour is black");
        }
}
public class Interface {
    public static void main(String[] args) {
        Aadmi A1 = new Aadmi();
        A1.drink();
        A1.a="Bengali Meaning Aadmi is Manush and ";
        A1.b="English is Human";
        A1.show();
        Crocodile c1 = new Crocodile();
        c1.colours();
        c1.a="Crocodile is a Reptilse Animal";
        c1.b="........";
        c1.show();
    }
}
