public class Simple_Exception {
    public static void main(String[] args) {
//        try {
//            System.out.println(2 + 3);
//            System.out.println(3 - 2);
        try {
            int a = 0;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
//                System.out.println("Arithmatic Error");
        }
//            System.out.println(8-5);
//            int arr[] = new int[5];
//            System.out.println(arr[6]);
//            System.out.println("Brati");
//        catch(Exception b) {
//            System.out.println(b);
//        }
            finally

    {
        System.out.println("End");
    }
    }
}

//}
