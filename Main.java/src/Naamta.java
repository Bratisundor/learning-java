import java.util.Scanner;

public class Naamta {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("The table is : ");
        for(int i =0;i<=10;i++){
            System.out.println(num+"X"+i+ " = "+num*i);
        }
    }
}
