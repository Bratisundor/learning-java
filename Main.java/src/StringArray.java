import java.util.Scanner;

public class StringArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Please Enter a Length : ");
            int a = sc.nextInt();
            String arr[] = new String[a];
            System.out.println("Please Enter "+a+" Strings : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }

            System.out.println("The Array is: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("\t"+arr[i]);
            }
//            Brati b;
//            b = new Brati();
        }
    }




