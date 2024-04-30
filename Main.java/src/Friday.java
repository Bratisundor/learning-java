import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter how many Student's data you want to entry the file : ");
        int size = sc.nextInt();
        try {
            File stu = new File("Student Database.txt");
            stu.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
        try {
            FileWriter fname = new FileWriter("Student Database.txt");
            fname.write("First Name");
            fname.close();
        }catch(IOException f){
            System.out.println(f);
        }
        try {
            FileWriter mname = new FileWriter("Student Database.txt");
            mname.write("Middle Name");
            mname.close();
        }catch(IOException m){
            System.out.println(m);
        }
        try {
            FileWriter lname = new FileWriter("Student Database.txt");
            lname.write("Last Name");
            lname.close();
        }catch(IOException l){
            System.out.println(l);
        }
        try {
            FileWriter dept = new FileWriter("Student Database.txt");
            dept.write("Department");
            dept.close();
        }catch(IOException d){
            System.out.println(d);
        }
        try {
            FileWriter reg = new FileWriter("Student Database.txt");
            reg.write("Registration Number ");
            reg.close();
        }catch(IOException r){
            System.out.println(r);
        }
        try {
            FileWriter address = new FileWriter("Student Database.txt");
            address.write("Address");
            address.close();
        }catch (IOException a){
            System.out.println(a);
        }
        try {
            FileWriter mob = new FileWriter("Student Database.txt");
            mob.write("Mobile No");
            mob.close();
        }catch(IOException m){
            System.out.println(m);
        }
        for(int i = 0;i<size;i++){
            try {
                System.out.println("Please Enter the Student First Name : ");
                String fname_1 = sc.next();
                FileWriter fname = new FileWriter("Student Database.txt", true);
                fname.append(fname_1);
                fname.close();
            }catch(IOException f){
                System.out.println(f);
            }
            try {
                System.out.println("Please Enter the Student Middle Name : ");
                String mname_1 = sc.next();
                FileWriter mname = new FileWriter("Student Database.txt",true);
                mname.append(mname_1);
                mname.close();
            }catch(IOException m){
                System.out.println(m);
            }
            try {
                System.out.println("Please Enter the Student Last Name : ");
                String lname_1 = sc.next();
                FileWriter lname = new FileWriter("Student Database.txt", true);
                lname.append(lname_1);
                lname.close();
            }catch (IOException l){
                System.out.println(l);
            }
            try {
                System.out.println("Please Enter the Student Department : ");
                String dept_1 = sc.next();
                FileWriter dept = new FileWriter("Student Database.txt", true);
                dept.append(dept_1);
                dept.close();
            }catch(IOException d){
                System.out.println(d);
            }
            try {
                System.out.println("Please Enter the Student Registration Number : ");
                String reg_1 = sc.next();
                FileWriter reg = new FileWriter("Student Database", true);
                reg.append(reg_1);
            }catch(IOException r){
                System.out.println(r);
            }
            try {
                System.out.println("Please Enter the Student Address : ");
                String address_1 = sc.next();
                FileWriter address = new FileWriter("Student Database.txt", true);
                address.append(address_1);
                address.close();
            }catch(IOException a){
                System.out.println(a);
            }
            try {
                System.out.println("Please Enter the Student Mobile No : ");
                String mob_1 = sc.next();
                FileWriter mob = new FileWriter("Student Database.txt",true);
                mob.append(mob_1);
                mob.close();
            }catch(IOException m){
                System.out.println(m);
            }
        }
    }
}
