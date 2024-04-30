import java.util.Scanner ;

class Node{
    int data ;
    Node next ;
}
public class Piyush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Node Number:-");
        int n = sc.nextInt();

        Node head = new Node();
        System.out.print("0-No NODE Data:-");
        head.data = sc.nextInt();
        Node current = head ;
		/*
		head.next = new Node();// Class Object
		current = head.next ;
		*/
        for(int i =1 ; i<n ; i++){
            current.next = new Node();
            //Creating next node [Full]
            System.out.print(i+"-No NODE Data:-");
            current.data = sc.nextInt();
            current = current.next;
            //Creating only reference
        }
        System.out.println(head.data);
    }
}