import java.util.Scanner;

public class Arrayele_Howtimeinelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[]{1,1,5,4,1,4};
        int num = 0;
        int ber = 0;
        for(int i =0;i<=5;i++){
            int count = 0;
            for(int j = 0;j<=5;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>ber){
                ber = count;
                num = arr[i];
            }
        }
        System.out.println(num);
    }
}
