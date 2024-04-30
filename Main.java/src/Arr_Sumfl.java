public class Arr_Sumfl {
    public static void main(String[] args) {
        int arr[]=new int[]{5,8,10,20,3};
        int j = 0;
        for(int i =0 ;i<=(arr.length/2);i++){
            j++;
            int result = (arr[i])+(arr[arr.length-j]);
            System.out.println(result);
        }
    }
}
