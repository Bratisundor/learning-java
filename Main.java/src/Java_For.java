
public class Java_For {
    public static void main(String[] args) {
        int arr[]={2,4,7,8,9,4,5};
        int Sum = 0;
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
            Sum+=arr[i];
            System.out.println(Sum);
        }
        for(int j : arr){
            System.out.println(j);
            Sum+=j;
            System.out.println(Sum);
        }
    }
}
