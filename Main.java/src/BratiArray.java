import java.util.Scanner;

public class BratiArray {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[5];
        for(int i =0 ;i<arr.length;i++){
            arr[i] = new Student(sc.next(),sc.nextInt());
        }
        for(int i = 0 ; i<arr.length;i++){
            arr[i].display();
        }
        arr[1].setRoll(18);
        arr[1].display();
        System.out.println(arr[1].getRoll());
        arr[2].setName("Subir Singha");
        System.out.println(arr[2].getName());
    }
}

class Student{
    private String name;
    private int roll;
    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println(name+roll);
    }
    void setRoll(int x){
        this.roll = x;
    }
    int getRoll(){
        return roll;
    }
    void setName(String x){

        this.name = x;
    }
    String getName(){
        return name;
    }
}

