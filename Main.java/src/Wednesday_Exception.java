import java.util.Scanner;

public class Wednesday_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your age : ");
        int year = sc.nextInt();
        login(year);

    }
    static void login(int age)throws Tanay{
        if(age<18){
            throw  new Tanay("Under 18 not allowed 😪😪");
        }
        else{
            System.out.println("Login Successful");
            System.out.println("Thank you for login 😀😀😀");
        }
    }
}
class Tanay extends ArithmeticException{
    Tanay(String b){
        super(b);
    }
}
