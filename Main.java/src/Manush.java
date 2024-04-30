class People {
    String Eat;
    String Sleeping;

    People(String Eat) {
        this.Eat = Eat;
    }

    People(String Sleeping, String Eat) {
        this(Eat);
        this.Sleeping = Sleeping;
    }
}
    class People_1 extends People{
        String Walking;
        String Runing;

        People_1(String Sleeping,String Eat,String Walking){
            super(Eat,Sleeping);
            this.Walking = Walking;
    }
    People_1(String Runing,String Walking){
        this (Walking);
        this.Runing = Runing;
    }
    People_1(String Walking){
            super("");
            this.Walking = Walking;
    }
    }

public class Manush {
    public static void main(String[] args) {

        People P1 = new People("Eating");
    }
}
