import java.util.ArrayList;

class CN{
    String niam="India";

}
public class LearnArrayList {
    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayList<Integer> object=new ArrayList<Integer>();
        object.add(5);
        object.add(4);
        object.add(3);
        object.add(2);
        object.add(1);
        object.add(1234561234);
        System.out.println(object.size());
//        System.out.println(object.get(5));
        ArrayList<CN> object_1 = new ArrayList<CN>();
        CN num = new CN();
        System.out.println(num.niam);
        object_1.add(num);
        object_1.add(num);
        System.out.println(object_1.size());
        System.out.println(object_1.get(1).niam);
    }
}
