import java.util.*;

public class Leapyear {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter a Year : ");
        int year = sc.nextInt();
        if(year%400 == 0 || year%100!=0 && year%4==0){
            System.out.println("The year "+year+" is leapyear");
        }
        else{
            System.out.println("The year "+year+" isn't leapyear");
        }

    }
}
