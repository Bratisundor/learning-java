import java.util.Scanner;

public class Arr_Leftele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the array length : ");
        int length = sc.nextInt();
        int [] a = new int[length];
        System.out.println("Please Enter the array element with using space : ");
        for(int j = 0;j<length;j++){
            a[j] = sc.nextInt();
        }
        System.out.println("Please Enter a Number to array : ");
       int num = sc.nextInt();
        System.out.println("The Array's Number is : ");
        for(int i =0 ;i<a.length;i++){
            if( a[i]==num){
                continue;
            }
            System.out.print("\t"+a[i]);
        }
    }
}
