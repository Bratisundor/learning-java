import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the order of matrix : ");
        int order_1 = sc.nextInt();
        int arr[][]=new int [order_1][order_1];
        System.out.print("Please Enter the order by of the matrix : ");
        int order_2 = sc.nextInt();
        int arr_1[][] = new int[order_2][order_2];
        int sum[][]   =new int [order_1][order_1];
        if(order_1==order_2) {
            System.out.print("Please Enter the number of the first matrix : ");
            for(int j=0;j<arr.length;j++){
                for(int i = 0;i<arr.length;i++ ){
                    arr[j][i] = sc.nextInt();
                }
            }
            System.out.print("Please Enter the Second Matrix : ");
            for(int j = 0;j< arr_1.length;j++){
                for(int i = 0;i<arr_1.length;i++){
                    arr_1[j][i] = sc.nextInt();
                }
            }
            System.out.println("The Sum of two  Matrix is : ");
            for(int j = 0;j< arr_1.length;j++){
                for(int i = 0;i<arr_1.length;i++){
                    System.out.print("\t"+arr[j][i]);
                }
                System.out.println();
            }
            System.out.println("        +");
            for(int j = 0;j< arr_1.length;j++){
                for(int i = 0;i<arr_1.length;i++){
                    System.out.print("\t"+arr_1[j][i]);
                }
                System.out.println();
            }
            System.out.println("......................");
            for(int j = 0;j< arr_1.length;j++){
                for(int i = 0;i<arr_1.length;i++){
                    sum[j][i]=arr[j][i]+arr_1[j][i];
                }
            }
            for(int j = 0;j< arr_1.length;j++){
                for(int i = 0;i<arr_1.length;i++){
                    System.out.print("\t"+sum[j][i]);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Don't possible sum of the matrix take same order in both matrix !!!!!");
        }
    }
}
