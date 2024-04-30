public class Fivevisibleele_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{5,25,70,125,17,75,55};
        int count = 0;
        for(int i = 0;i<=6;i++){
            if((arr[i]%5)==0){
                count++;
            }
        }
        System.out.println("The To total number of element whose is visible of 5 : "+count);
    }
}
