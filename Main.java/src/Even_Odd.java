import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number : ");
        long a = sc.nextLong();
        if((a%2)==0){
            System.out.println("The Number is Even Number.");
        }
        else{
            System.out.println("The Number is Odd number .");
        }
    }
}
