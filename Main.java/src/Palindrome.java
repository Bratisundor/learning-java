import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 121;
        for(int i = 0;i<100;i++){
            for (int j = 100;j<0;j--){
                if(i==j){
                    System.out.println("palindrome");
                }
                else{
                    System.out.println("not palindrome");
                }
            }
        }
    }
}
