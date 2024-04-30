import java.util.Scanner;

public class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Please Enter a Number : ");
        a = sc.nextInt();
        System.out.print("Please Enter another Number : ");
        b = sc.nextInt();
        System.out.println("The Result is : "+Sum(a,b));
    }
    static int Sum(int x,int y){
        return(x+y);
    }
}
