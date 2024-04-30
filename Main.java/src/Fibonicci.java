import java.util.Scanner;

public class Fibonicci {
    public static void main(String[] args) {
        int a=0,b=1,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Length : ");
        int d = sc.nextInt();
        System.out.println(a+" "+b);
        for(;c<=d;){
        c = a+b;
        a=b;
        b=c;
//        while(c<=d){
//          c = a+b;
//            a=b;
//            b=c;
        System.out.println(" "+c);
        }
        }
        }


