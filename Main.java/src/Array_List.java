import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        int a[] = new int[]{1,5,4,6,7,8,9};
        ArrayList <Integer>a2 = new ArrayList<Integer>();
        for(int i = 0;i<=6;i++){
            a2.add(a[i]);

        }
        System.out.println(a2);
        for(Integer i : a2){    //for each loop
            System.out.println(i);
        }
    }
}
