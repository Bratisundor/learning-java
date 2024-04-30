import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_1 {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("File_Name.txt");
            f.write("Apple,Banana,Mango,Kiwi");
            f.close();
        }catch(IOException e){
            System.out.println(e);
        }//*********************file write method**********************//






//    try{
//    File f1 = new File("C:\\Users\\BRATI SUNDOR BISWAS\\OneDrive\\Desktop\\PROJECT\\java\\File_Name.txt");
//    int r = 0;
//    Scanner sc = new Scanner(f1);
//    while(sc.hasNextLine()){
//        System.out.println(sc.nextLine());
//    }
//    }catch(IOException d){
//        System.out.println(d);//******************file read method-1********************//
//    }




        try {
            FileReader f1 = new FileReader("File_Name.txt");
            int r ;
            while((r=f1.read())!=-1){
                if(r==44){
                    System.out.println();
                }
                else{
                    System.out.print((char)r);
                }
            }
        }catch(IOException d){
            System.out.println(d);
        }//************************File read method-2************************//







//        try {
//            File myfile = new File("Brati.txt");
//            myfile.createNewFile();
//        }catch (Exception e){
//            System.out.println(e);
//        }








//        try {
//            FileWriter my_file_1 = new FileWriter("Brati.txt");
//            my_file_1.write("I am Brati Sundor Biswas");
//            my_file_1.close();
//        }catch(IOException h){
//            System.out.println(h);
//        }





//        try {
//
//            FileWriter my_file_1 = new FileWriter("Brati.txt",true);
//            my_file_1.append("I am Studying in Diploma 3rd year.");
//            my_file_1.close();
//        }catch (IOException f){
//            System.out.println(f);
//        }







//        try {
//            FileReader rt = new FileReader("Brati.txt");
//            System.out.println(rt);
//            rt.close();
//        }catch(IOException d){
//            System.out.println(d);
//        }






//        try {
//            File g = new File("Brati.txt");
//            Scanner sc = new Scanner(g);
//            while(sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//            sc.close();
//        }catch(IOException k){
//            System.out.println(k);
//        }





    }
}
