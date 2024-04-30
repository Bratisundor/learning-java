import java.util.Scanner;

public class Sum_Digit {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number : ");
        int a = sc.nextInt();
        while(a!=0){
            sum = sum+(a%10);
            a=a/10;
        }
        System.out.println("The Sum of "+a+" is : "+sum);
    }
}
