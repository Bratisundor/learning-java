public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = new int[]{2,7,11,15};
        int target = 9;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
