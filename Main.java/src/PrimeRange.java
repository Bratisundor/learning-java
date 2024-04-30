import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter a Range : ");
        int range = sc.nextInt();
        for (int i = 2;i<=range;i++){
            boolean flag = true;
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }

            }
            if(flag)
            System.out.printf("\t"+i);
        }
    }
}
