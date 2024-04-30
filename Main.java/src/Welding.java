class Parent {
    int age;
    String name;

    private Parent() {

    }

    Parent(int age) {
        this.age = age;
    }

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int add(int x, int y) {
        return (x + y);
    }

    int add(int x, int y, int z) {
        return (x + y + z);
    }

    int add(int x, int y, int z, int a) {
        return (x + y + z + a);
    }
    void display(){
        System.out.println(" "+name+" "+age+" "+add(5,10)+" " +add(10,50,100));
    }
}

  public  class Welding {
        public static void main(String[] args) {
            Parent p1 = new Parent("Bipradas Pal", 1000);
            System.out.println(p1);
            p1.display();
            Parent p2 = new Parent(15);
            System.out.println(p2);
            System.out.println( p2.add(5, 10));
            p2.display();
        }
    }
