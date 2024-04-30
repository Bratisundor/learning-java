import java.util.Scanner;

class Linkedlist{
     int val;
    static Linkedlist next;
   public Linkedlist (int x,Linkedlist y){
            val = x;
            next = y;
    }
}
public class Linklist_Input_p {
    public static void main(String[] args) {
        Linkedlist start = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter no of values for insert  : ");
        int num = sc.nextInt();
        int j=0;
        for(int i = 0;i<num;i++){
            j++;
            System.out.println("Please Enter the "+j+" th position values : ");
            int value = sc.nextInt();
            Linkedlist l1 = new Linkedlist(value,start);
            start = l1;
        }
            System.out.println(start.next.val);
    }
}
