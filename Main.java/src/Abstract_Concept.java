abstract class Tonay{
    int a,b;
    void display(){
        System.out.println(a+" "+b);
    }
    void add(int x,int y){
        System.out.println(a+b);
    }
    abstract void Rakesh();
    abstract void Piyush();
}
class Tandra extends Tonay{
    @Override
    void Rakesh() {
        System.out.println("Rakesh is Good boy");
    }
    void Piyush(){
        System.out.println("Piyush is Human");
    }
}
public class Abstract_Concept {
    public static void main(String[] args) {
        Tandra T1 = new Tandra();
        T1.a = 100;
        T1.b=200;
        T1.display();
        T1.add(5,6);
        System.out.println("jgcgachaocouc");
    }
}