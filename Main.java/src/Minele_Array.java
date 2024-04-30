public class Minele_Array {
    public static void main(String[] args) {
        int [] arr_1 = new int[]{2,8,10,1,3,0,-1,-2,-13,-10,6};
        int a = arr_1[0];
        for(int i =1 ; i<=9 ; i++){
            if (a>arr_1[i]){
                a=arr_1[i];
        }
    }
        System.out.println("The minimum number of the array is : "+a);
}
}

