import java.util.Scanner;

public class Arrayele_Howtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the length of array : ");
        int length = sc.nextInt();
        int[] a = new int[length];
        System.out.println("Please Enter the number of the array with using space : ");
        for (int j = 0; j < length; j++) {
            a [j]= sc.nextInt();
        }
        System.out.println("Please Enter a Number : ");
        int num = sc.nextInt();
        int z = 0;
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] == num) {
                z++;
            }
        }
        System.out.println("The number "+num+" is total "+z+" times in this Array : ");
    }
}
