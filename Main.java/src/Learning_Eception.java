public class Learning_Eception {


    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 0;
            System.out.println(a / b);//[Arithmatic Eception]
            System.out.println("Brati");
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("handled error");
        }
        try {
            int arr[] = new int[5];
            System.out.println(arr[6]); //[ArrayIndexOutOfBoundsException]
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println(b);
            System.out.println("arrayindexoutofbounds error");
        }
        catch (Exception f){
            System.out.println(f);
            System.out.println("arrayindexoutofbounds error");
        }
        try {
            String rt = "Brati";
            System.out.println(rt.charAt(100));//[StringIndexOutOfBoundsException]
        }
        catch(Exception y){
            System.out.println(y);
            System.out.println("StringIndexOutOfBoundsException error");
        }
help(10);
    }

    static int[] arr = new int[5];
    static void help(int n){
        try{
            System.out.println("n = " + n);
            System.out.println(arr[n]);
            System.out.println("Finnaly we found that index");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("--------------------------------------------------");
            System.out.println("With array index = " + n + ", we faced some issues.");
            System.out.println("Retrying....");
            help(n-1);
        }
    }
}
