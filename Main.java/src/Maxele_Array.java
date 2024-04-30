public class Maxele_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 7, 9, 3,666};
        int a = arr[0];
        for ( int i = 1;i <= 5;i++){
            if(a<arr[i]){
                    a=arr[i];
                }
            }
        System.out.println("The maximum number is : "+a);
        }
    }










    