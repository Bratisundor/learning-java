public class Best_Time_To_Bye_And_Sell_Stock {
    public static void main(String[] args) {
       int arr[]=new int[]{7,5,3,4,1};
        int small =arr [0];
       int profit = 0;
       int num = 0;
//        for(int i = 0;i< arr.length;i++){
//            for(int j =i+1;j<arr.length;j++){
//                a = arr[j]-arr[i];
//            if(a>num){
//               b = a;
//            }
//            }
//
//        }
//        System.out.println("Maximum Profit is : "+b);
for(int i = 0;i<arr.length;i++){
    if(small>arr[i]){
        small=arr[i];
    }
    num = arr[i]-small;
    if(num>profit){
        profit=num;
    }
}
        System.out.println("The Maximum profit is : "+profit);
    }
}
