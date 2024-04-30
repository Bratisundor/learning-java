class Link_Node{

    int value;
    Link_Node next;
    Link_Node(int val,Link_Node next){
        this.value=val;
        this.next=next;
    }
}

public class Linked_List{
    static Link_Node Head = null;
    static  void insert(int num) {
        Link_Node temp = new Link_Node(num,Head);
        Head = temp;
    }
    static void display() {
        Link_Node current = Head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        insert(2);
        insert(5);
        insert(9);
        insert(6);
        display();

    }



}