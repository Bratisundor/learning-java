class LT_1 extends Thread{
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println("Hi from LT_1");
            try {
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class LT_2 extends Thread{
    public void run(){
        for(int j = 0;j<100;j++) {
            System.out.println("Hi from LT_2");
            try {
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Learning_Thread {
    public static void main(String[] args) {
        LT_1 l1 = new LT_1();
        LT_2 l2 = new LT_2();
//        l1.show();
//        l2.show();
        l1.setPriority(1);
        l2.setPriority(10);
        l1.start();
//        System.out.println("...........................................................");
        l2.start();
    }
}
