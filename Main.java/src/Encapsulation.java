class krishnagar{
    private int val = 19;
    int val_1 = 0;
    public int getvalue(){
        return val;
    }
    public void setvalue(int city){
        this.val = city;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        krishnagar K1 = new krishnagar();
        System.out.println(K1.val_1);
        System.out.println(K1.getvalue());
        K1.setvalue(100);
        System.out.println(K1.getvalue());
        K1.setvalue(120);
        System.out.println(K1.getvalue());
        K1.setvalue(500);
        System.out.println(K1.getvalue());
    }
}
