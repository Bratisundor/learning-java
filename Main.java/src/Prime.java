import java.util.*;

public class Prime {
    public static void main(String[]arg){
        Scanner Sc = new Scanner(System.in);
        System.out.printf("Please Enter a Number : ");
        int number = Sc.nextInt();
        for(int i =2 ; i<=Math.sqrt(number) ; i++){
            int m = number%i;
            if(m == 0){
                System.out.println("The Number "+number+" isn't Prime Number");
                return ;
            }

        }
        System.out.println("The Number "+number+" is Prime Number");
    }
}
