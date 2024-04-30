class Employee_1{
    String Id;
    String Name;
    int Salary;
    private Employee_1(){

    }
    Employee_1(String Id){
        this.Id = Id;
    }
    Employee_1(String Name,String Id){
     this.Id = Id;
     this.Name = Name;
    }
    Employee_1(String Name,String Id,int Salary){
        this.Name = Name;
        this.Id = Id;
        this.Salary = Salary;
    }
    void Brati(){
        System.out.println("\n"+Id+"\n"+Name+"\n"+Salary);
    }

}
public class Employee {
    public static void main(String[] args) {
        Employee_1 E1 = new Employee_1("EMP001");
        Employee_1 E2 = new Employee_1("Dijwen Biswas","EMP002");
        Employee_1 E3 = new Employee_1("Avik Dutta","EMP003",50000);
        E1.Brati();
        E2.Brati();
        E3.Brati();
    }
}
