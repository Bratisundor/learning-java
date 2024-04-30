import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student_Database {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter How many student details you want to store in database : ");
        int size = sc.nextInt();
        try {
            FileWriter student = new FileWriter("Student Database.csv",true);
            student.append("First Name\t Middle Name\t Last Name\t Department\t Registration Number\tAddress\tMobile Number ");
            for(int i = 0;i<size;i++){
                student.append("\n");
                System.out.println("Please Enter the Student First Name : ");
                String fname = sc.next();
                student.append(fname);
                System.out.println("Please Enter Student Middle Name : ");
                String mname = sc.next();
                student.append("\t"+mname);
                System.out.println("Please Enter Student Last Name : ");
                String lname = sc.next();
                student.append("\t"+lname);
                System.out.println("Please Enter Student Department : ");
                String dept = sc.next();
                student.append("\t"+dept);
                System.out.println("Please Enter Student Registration Number : ");
                String reg = sc.next();
                student.append("\t"+reg);
                System.out.println("Please Enter Student Address : ");
                String address = sc.next();
                student.append("\t"+address);
                System.out.println("Please Enter Student Mobile Number : ");
                String mob = sc.next();
                student.append("\t"+mob);

            }
            student.close();
        }catch(IOException e){
            System.out.println(e);
        }
        try {
            FileReader stu = new FileReader("C:\\Users\\BRATI SUNDOR BISWAS\\OneDrive\\Desktop\\PROJECT\\java\\Student Database.csv");
            int c;
            while ((c = stu.read()) != -1) {
                if (c == 44) {
                    System.out.println();
                } else {
                    System.out.print((char) c);
                }
            }
        }catch(IOException e){
                System.out.println(e);
            }
        }
    }

