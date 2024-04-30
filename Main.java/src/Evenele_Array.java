public class Evenele_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,9,8,3,60,11};
        int count = 0;
        for(int i = 0;i<=6;i++){
            if((arr[i]%2)==0){
                count++;
            }
        }
        System.out.println("Total Number of Even elements in this Array is : "+count);
    }
}
